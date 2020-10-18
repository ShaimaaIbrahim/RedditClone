package com.raywenderlich.android.redditclone.database.dao;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.raywenderlich.android.redditclone.model.RedditPost;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RedditPostsDao_Impl implements RedditPostsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RedditPost> __insertionAdapterOfRedditPost;

  public RedditPostsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRedditPost = new EntityInsertionAdapter<RedditPost>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `posts` (`key`,`title`,`score`,`author`,`commentCount`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RedditPost value) {
        if (value.getKey() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getKey());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        stmt.bindLong(3, value.getScore());
        if (value.getAuthor() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAuthor());
        }
        stmt.bindLong(5, value.getCommentCount());
      }
    };
  }

  @Override
  public Object savePosts(final List<RedditPost> redditPosts, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRedditPost.insert(redditPosts);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public PagingSource<Integer, RedditPost> getPosts() {
    final String _sql = "SELECT * FROM posts";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, RedditPost>() {
      @Override
      public LimitOffsetDataSource<RedditPost> create() {
        return new LimitOffsetDataSource<RedditPost>(__db, _statement, false , "posts") {
          @Override
          protected List<RedditPost> convertRows(Cursor cursor) {
            final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(cursor, "key");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(cursor, "title");
            final int _cursorIndexOfScore = CursorUtil.getColumnIndexOrThrow(cursor, "score");
            final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(cursor, "author");
            final int _cursorIndexOfCommentCount = CursorUtil.getColumnIndexOrThrow(cursor, "commentCount");
            final List<RedditPost> _res = new ArrayList<RedditPost>(cursor.getCount());
            while(cursor.moveToNext()) {
              final RedditPost _item;
              final String _tmpKey;
              _tmpKey = cursor.getString(_cursorIndexOfKey);
              final String _tmpTitle;
              _tmpTitle = cursor.getString(_cursorIndexOfTitle);
              final int _tmpScore;
              _tmpScore = cursor.getInt(_cursorIndexOfScore);
              final String _tmpAuthor;
              _tmpAuthor = cursor.getString(_cursorIndexOfAuthor);
              final int _tmpCommentCount;
              _tmpCommentCount = cursor.getInt(_cursorIndexOfCommentCount);
              _item = new RedditPost(_tmpKey,_tmpTitle,_tmpScore,_tmpAuthor,_tmpCommentCount);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    }.asPagingSourceFactory().invoke();
  }
}
