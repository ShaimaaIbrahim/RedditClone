

package com.raywenderlich.android.redditclone.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.raywenderlich.android.redditclone.model.RedditPost
import com.raywenderlich.android.redditclone.repositories.RedditRepo
import kotlinx.coroutines.flow.Flow

class RedditViewModel(application: Application) : AndroidViewModel(application) {

    // 1
    private val redditRepo = RedditRepo(application)

    // 2
    fun fetchPosts(): Flow<PagingData<RedditPost>> {

        return redditRepo.fetchPosts().cachedIn(viewModelScope)
    }
}