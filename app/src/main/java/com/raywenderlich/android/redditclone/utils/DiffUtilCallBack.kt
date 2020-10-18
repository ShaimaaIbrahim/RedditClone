
package com.raywenderlich.android.redditclone.utils

import androidx.recyclerview.widget.DiffUtil
import com.raywenderlich.android.redditclone.model.RedditPost

class DiffUtilCallBack : DiffUtil.ItemCallback<RedditPost>() {
    
    override fun areItemsTheSame(oldItem: RedditPost, newItem: RedditPost): Boolean {
        return oldItem.key == newItem.key
    }

    override fun areContentsTheSame(oldItem: RedditPost, newItem: RedditPost): Boolean {
        return oldItem.key == newItem.key
                && oldItem.score == newItem.score
                && oldItem.commentCount == newItem.commentCount
    }
}