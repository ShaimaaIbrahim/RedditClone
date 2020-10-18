package com.raywenderlich.android.redditclone.repositories;

import java.lang.System;

/**
 * for fetching data from
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J+\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/raywenderlich/android/redditclone/repositories/RedditPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/raywenderlich/android/redditclone/model/RedditPost;", "redditService", "Lcom/raywenderlich/android/redditclone/networking/RedditService;", "(Lcom/raywenderlich/android/redditclone/networking/RedditService;)V", "keyReuseSupported", "", "getKeyReuseSupported", "()Z", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RedditPagingSource extends androidx.paging.PagingSource<java.lang.String, com.raywenderlich.android.redditclone.model.RedditPost> {
    private final boolean keyReuseSupported = true;
    private final com.raywenderlich.android.redditclone.networking.RedditService redditService = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.String, com.raywenderlich.android.redditclone.model.RedditPost>> p1) {
        return null;
    }
    
    @java.lang.Override()
    public boolean getKeyReuseSupported() {
        return false;
    }
    
    public RedditPagingSource(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.redditclone.networking.RedditService redditService) {
        super();
    }
}