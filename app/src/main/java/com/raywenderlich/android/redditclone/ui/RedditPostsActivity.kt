
package com.raywenderlich.android.redditclone.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.raywenderlich.android.redditclone.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class RedditPostsActivity : AppCompatActivity() {

    private val redditAdapter = RedditAdapter()

    private val redditViewModel: RedditViewModel by lazy {

        ViewModelProvider(this).get(RedditViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViews()

        fetchPosts()

    }

    private fun setupViews() {

        rvPosts.adapter = redditAdapter

        rvPosts.adapter = redditAdapter.withLoadStateHeaderAndFooter(

            header = RedditLoadingAdapter { redditAdapter.retry() },
            footer = RedditLoadingAdapter { redditAdapter.retry() }
        )
    }

    private fun fetchPosts() {

        lifecycleScope.launch {

            redditViewModel.fetchPosts().collectLatest { pagingData ->

                redditAdapter.submitData(pagingData)
            }
        }
    }
}