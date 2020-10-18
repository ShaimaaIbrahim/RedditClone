

package com.raywenderlich.android.redditclone.repositories

import android.content.Context
import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.raywenderlich.android.redditclone.database.RedditDatabase
import com.raywenderlich.android.redditclone.model.RedditPost
import com.raywenderlich.android.redditclone.networking.RedditClient
import com.raywenderlich.android.redditclone.networking.RedditService
import kotlinx.coroutines.flow.Flow

class RedditRepo(context: Context) {

    // 1
    private val redditService = RedditClient.getClient().create(RedditService::class.java)
    private val redditDatabase = RedditDatabase.create(context)


    @OptIn(ExperimentalPagingApi::class)
    fun fetchPosts(): Flow<PagingData<RedditPost>> {

        return Pager(

            PagingConfig(
                pageSize = 40,
                enablePlaceholders = false,
                // 1
                prefetchDistance = 3),

            // 2
            remoteMediator = RedditRemoteMediator(redditService, redditDatabase),
            // 3 offline cashing
            pagingSourceFactory = { redditDatabase.redditPostsDao().getPosts() }
        ).flow
    }

}