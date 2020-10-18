package com.raywenderlich.android.redditclone.database;

import java.lang.System;

@androidx.room.Database(entities = {com.raywenderlich.android.redditclone.model.RedditPost.class, com.raywenderlich.android.redditclone.model.Redditkeys.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/raywenderlich/android/redditclone/database/RedditDatabase;", "Landroidx/room/RoomDatabase;", "()V", "redditKeysDao", "Lcom/raywenderlich/android/redditclone/database/dao/RedditKeysDao;", "redditPostsDao", "Lcom/raywenderlich/android/redditclone/database/dao/RedditPostsDao;", "Companion", "app_debug"})
public abstract class RedditDatabase extends androidx.room.RoomDatabase {
    public static final com.raywenderlich.android.redditclone.database.RedditDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.android.redditclone.database.dao.RedditPostsDao redditPostsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.android.redditclone.database.dao.RedditKeysDao redditKeysDao();
    
    public RedditDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/raywenderlich/android/redditclone/database/RedditDatabase$Companion;", "", "()V", "create", "Lcom/raywenderlich/android/redditclone/database/RedditDatabase;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.android.redditclone.database.RedditDatabase create(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}