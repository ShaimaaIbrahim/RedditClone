package com.raywenderlich.android.redditclone.repositories;

import java.lang.System;

@kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0013\u0010\t\u001a\u0004\u0018\u00010\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ-\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/raywenderlich/android/redditclone/repositories/RedditRemoteMediator;", "Landroidx/paging/RemoteMediator;", "", "Lcom/raywenderlich/android/redditclone/model/RedditPost;", "redditService", "Lcom/raywenderlich/android/redditclone/networking/RedditService;", "redditDatabase", "Lcom/raywenderlich/android/redditclone/database/RedditDatabase;", "(Lcom/raywenderlich/android/redditclone/networking/RedditService;Lcom/raywenderlich/android/redditclone/database/RedditDatabase;)V", "getRedditKeys", "Lcom/raywenderlich/android/redditclone/model/Redditkeys;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Landroidx/paging/RemoteMediator$MediatorResult;", "loadType", "Landroidx/paging/LoadType;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RedditRemoteMediator extends androidx.paging.RemoteMediator<java.lang.Integer, com.raywenderlich.android.redditclone.model.RedditPost> {
    private final com.raywenderlich.android.redditclone.networking.RedditService redditService = null;
    private final com.raywenderlich.android.redditclone.database.RedditDatabase redditDatabase = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.LoadType loadType, @org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, com.raywenderlich.android.redditclone.model.RedditPost> state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.MediatorResult> p2) {
        return null;
    }
    
    public RedditRemoteMediator(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.redditclone.networking.RedditService redditService, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.redditclone.database.RedditDatabase redditDatabase) {
        super();
    }
}