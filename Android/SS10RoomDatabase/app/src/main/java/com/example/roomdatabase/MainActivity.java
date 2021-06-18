package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.roomdatabase.database.AppDatabase;
import com.example.roomdatabase.database.BookmarkEntity;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = AppDatabase.getAppDatabase(this);
        insertBookmark();
        updateBookmark(1);
        findBookmarkById(1);
        deleteBookmark(1);
        // deleteAllBookmark();
        getAllBookmark();
    }

    private void insertBookmark() {
        BookmarkEntity bm = new BookmarkEntity();
        bm.title = "This is Title";
        bm.content = "This is Content";
        db.bookmarkDAO().insertBookmark(bm);

    }

    private void updateBookmark(int id) {
        BookmarkEntity bm = db.bookmarkDAO().getBookmark(id);
        bm.title = "This is Title update";
        db.bookmarkDAO().updateBookmark(bm);
    }

    private void findBookmarkById(int id) {
        BookmarkEntity bm = db.bookmarkDAO().getBookmark(id);
        Log.d("TAG", "id : " + bm.id + "title : " + bm.title);
    }

    private void deleteBookmark(int id) {
        BookmarkEntity bm = db.bookmarkDAO().getBookmark(id);
        db.bookmarkDAO().deleteBookmark(bm);

    }

    private void deleteAllBookmark() {
        db.bookmarkDAO().deleteALl();

    }

    private void getAllBookmark() {
        List<BookmarkEntity> list = db.bookmarkDAO().getAllBookMark();
        for (BookmarkEntity model : list) {
            Log.d("TAG", "id : " + model.id + "title : " + model.title);
        }
    }
}
