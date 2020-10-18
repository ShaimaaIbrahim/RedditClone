package com.raywenderlich.android.redditclone.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/android/redditclone/networking/RedditService;", "", "fetchPosts", "Lretrofit2/Response;", "Lcom/raywenderlich/android/redditclone/model/ApiResponse;", "loadSize", "", "after", "", "before", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RedditService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/r/aww/hot.json")
    public abstract java.lang.Object fetchPosts(@retrofit2.http.Query(value = "limit")
    int loadSize, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "after")
    java.lang.String after, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "before")
    java.lang.String before, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.raywenderlich.android.redditclone.model.ApiResponse>> p3);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}