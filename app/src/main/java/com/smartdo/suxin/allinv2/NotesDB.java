package com.smartdo.suxin.allinv2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by suxin on 9/25/16.
 */

public class NotesDB extends SQLiteOpenHelper {

    public static final String TABLE_NAME_NOTES = "notes";
    public static final String TABLE_NAME_MEDIA = "media";
    public static final String COLUMN_NAME_ID = "_id";
    public static final String COLUMN_NAME_NOTE_NAME = "name";
    public static final String COLUMN_NAME_NOTE_CONTENT = "content";
    public static final String COLUMN_NAME_NOTE_DATE = "date";
    public static final String COLUMN_NAME_MEDIA_PATH = "path";
    public static final String COLUMN_NAME_MEDIA_OWNER_NOTE_ID = "note_id";

    public NotesDB(Context context) {
        super(context, "notes", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_NAME_NOTES + "(" + COLUMN_NAME_ID
                + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_NAME_NOTE_NAME
                + " TEXT NOT NULL DEFAULT \"\"," + COLUMN_NAME_NOTE_CONTENT
                + " TEXT NOT NULL DEFAULT \"\"," + COLUMN_NAME_NOTE_DATE
                + " TEXT NOT NULL DEFAULT \"\"" + ")");
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_NAME_MEDIA + "(" + COLUMN_NAME_ID
                + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_NAME_MEDIA_PATH + " TEXT NOT NULL DEFAULT \"\","
                + COLUMN_NAME_MEDIA_OWNER_NOTE_ID
                + " INTEGER NOT NULL DEFAULT 0" + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}
