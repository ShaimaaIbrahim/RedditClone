package com.raywenderlich.android.redditclone.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "redditKeys")
    data class Redditkeys(
        @PrimaryKey(autoGenerate = true)
        val id: Int,
        val after: String?,
        val before: String?)