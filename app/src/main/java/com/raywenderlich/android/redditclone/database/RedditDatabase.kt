

package com.raywenderlich.android.redditclone.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.raywenderlich.android.redditclone.database.dao.RedditKeysDao
import com.raywenderlich.android.redditclone.database.dao.RedditPostsDao
import com.raywenderlich.android.redditclone.model.RedditPost
import com.raywenderlich.android.redditclone.model.Redditkeys


@Database(
    entities = [RedditPost::class, Redditkeys::class],
    version = 1,
    exportSchema = false
)
abstract class RedditDatabase : RoomDatabase() {
    companion object {
        fun create(context: Context): RedditDatabase {
            val databaseBuilder =
                Room.databaseBuilder(context, RedditDatabase::class.java, "redditclone.db")
            return databaseBuilder.build()
        }
    }

    abstract fun redditPostsDao(): RedditPostsDao
    abstract fun redditKeysDao(): RedditKeysDao
}