package com.example.roomdatabase.database;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "Bookmark")
public class BookmarkEntity {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "date")
    public String date;
    @ColumnInfo(name = "title")
    public String title;
    @ColumnInfo(name = "image")
    public String image;
    @ColumnInfo(name = "content")
    public String content;
    @ColumnInfo(name = "url")
    public String url;


}
