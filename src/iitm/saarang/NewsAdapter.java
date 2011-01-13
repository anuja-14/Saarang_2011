/*
 * Copyright (C) 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package iitm.saarang;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class NewsAdapter {

    public static final String KEY_TITLE = "title";
    public static final String KEY_DESC = "desc";
    public static final String KEY_ROWID = "_id";
   
    private static final String TAG = "NewsDbAdapter";
    private DatabaseHelper mDbHelper;
    private SQLiteDatabase mDb;
    

    private static final String DATABASE_CREATE =
            "create table news (_id integer primary key autoincrement, "
                    + "title text not null, desc text not null);";

    private static final String DATABASE_NAME = "saarang3";
    private static final String DATABASE_TABLE = "news";
    private static final int DATABASE_VERSION = 2;

    private final Context mCtx;

    private static class DatabaseHelper extends SQLiteOpenHelper {

        DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

            db.execSQL(DATABASE_CREATE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.w(TAG, "Upgrading database from version " + oldVersion + " to "
                    + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS notes");
            onCreate(db);
        }
    }

    public  NewsAdapter(Context ctx) {
        this.mCtx = ctx;

     

    }

    
    public NewsAdapter open() throws SQLException {
        mDbHelper = new DatabaseHelper(mCtx);
        mDb = mDbHelper.getWritableDatabase();
        return this;
    }
    
    public void close() {
        mDbHelper.close();
    }


    public long createNews(String title,String desc) {
        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_TITLE, title);
        initialValues.put(KEY_DESC, desc);
       
        return mDb.insert(DATABASE_TABLE, null, initialValues);
    }

    
    public boolean deleteNews(long rowId) {

        return mDb.delete(DATABASE_TABLE, KEY_ROWID + "=" + rowId, null) > 0;
    }

    public Cursor fetchAllNews() {	
    
        return mDb.query(DATABASE_TABLE, new String[] {KEY_ROWID, KEY_TITLE,KEY_DESC}, null, null, null, null, null);
    }
    
    public Cursor fetchNews(long rowId) throws SQLException {

        Cursor mCursor =

                mDb.query(true, DATABASE_TABLE, new String[] {KEY_ROWID,KEY_TITLE,KEY_DESC}, KEY_ROWID + "=" + rowId, null,
                        null, null, null, null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;

    }
    
    
  /*  public Cursor fetchEventsByBookid()
    {
    Cursor mCursor= 	 mDb.query(true, DATABASE_TABLE, new String[] {KEY_ROWID,KEY_EVENT,KEY_DAY,
            KEY_TIME ,KEY_VENUE,KEY_EVENT_ID}, KEY_BOOK_ID + "= 1" , null,
            null, null, null, null);
    return mCursor;
    }
    
    public Cursor search(String search)
    {
    	Cursor mCursor = mDb.query(true, DATABASE_TABLE, new String[] {KEY_ROWID,KEY_EVENT,KEY_DAY,
                KEY_TIME ,KEY_VENUE,KEY_EVENT_ID}, KEY_EVENT + "= '"+search+"'" , null,
                null, null, null, null);
    	return mCursor;
    }
    */
    
}

