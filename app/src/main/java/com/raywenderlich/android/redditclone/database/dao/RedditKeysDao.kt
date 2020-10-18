package com.raywenderlich.android.redditclone.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.raywenderlich.android.redditclone.model.RedditPost
import com.raywenderlich.android.redditclone.model.Redditkeys


@Dao
interface RedditKeysDao {


    @Insert(onConflict = REPLACE)
    suspend fun saveRedditKeys(redditKey: Redditkeys)

    @Query("SELECT * FROM redditKeys ORDER BY id DESC")
    suspend fun getRedditKeys(): List<Redditkeys>

}