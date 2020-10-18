

package com.raywenderlich.android.redditclone.repositories

import androidx.paging.PagingSource
import com.raywenderlich.android.redditclone.model.RedditPost

import com.raywenderlich.android.redditclone.networking.RedditService
import retrofit2.HttpException
import java.io.IOException

/**
 *  for fetching data from
 */
class RedditPagingSource(private val redditService : RedditService) : PagingSource<String , RedditPost>() {

    override suspend fun load(params: LoadParams<String>): LoadResult<String, RedditPost> {
        return try {
            // 1
            val response = redditService.fetchPosts(loadSize = params.loadSize)
            // 2
            val listning = response.body()!!.data

            val redditPosts = listning.children.map {
                it.data
            }
            // 3
            LoadResult.Page(
                redditPosts?: listOf(),
                listning!!.befor!!,
                listning!!.after
            )

        } catch (exception: IOException) { // 6

            return LoadResult.Error(exception)

        } catch (exception: HttpException) {

            return LoadResult.Error(exception)
        }
    }
    override val keyReuseSupported: Boolean = true
}