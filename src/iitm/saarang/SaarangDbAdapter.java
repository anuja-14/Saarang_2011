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

public class SaarangDbAdapter {

    public static final String KEY_EVENT = "event";
    public static final String KEY_VENUE = "venue";
    public static final String KEY_ROWID = "_id";
    public static final String KEY_TIME = "time";
    public static final String KEY_DAY = "day";
    public static final String KEY_EVENT_ID="event_id";

    private static final String TAG = "NotesDbAdapter";
    private DatabaseHelper mDbHelper;
    private SQLiteDatabase mDb;
    

    private static final String DATABASE_CREATE =
            "create table events (_id integer primary key autoincrement, "
                    + "event text not null, day integer not null,venue text not null,time text not null,event_id text not null);";

    private static final String DATABASE_NAME = "saarang2";
    private static final String DATABASE_TABLE = "events";
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

    public SaarangDbAdapter(Context ctx) {
        this.mCtx = ctx;
    }

    
    public SaarangDbAdapter open() throws SQLException {
        mDbHelper = new DatabaseHelper(mCtx);
        mDb = mDbHelper.getWritableDatabase();
        return this;
    }
    
    public void close() {
        mDbHelper.close();
    }


    public long createEvent(String event,String venue,int day,String time,String event_id) {
        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_EVENT, event);
        initialValues.put(KEY_VENUE, venue);
        initialValues.put(KEY_DAY, day);
        initialValues.put(KEY_TIME,time);
        initialValues.put(KEY_EVENT_ID,event_id);

        return mDb.insert(DATABASE_TABLE, null, initialValues);
    }

    
    public boolean deleteEvent(long rowId) {

        return mDb.delete(DATABASE_TABLE, KEY_ROWID + "=" + rowId, null) > 0;
    }

    public Cursor fetchAllEvents(String day) {	
    
        return mDb.query(DATABASE_TABLE, new String[] {KEY_ROWID, KEY_EVENT,
                KEY_VENUE}, "day="+day, null, null, null, null);
    }
    
    public Cursor fetchEvent(long rowId) throws SQLException {

        Cursor mCursor =

                mDb.query(true, DATABASE_TABLE, new String[] {KEY_EVENT,KEY_DAY,
                        KEY_TIME ,KEY_VENUE,KEY_EVENT_ID}, KEY_ROWID + "=" + rowId, null,
                        null, null, null, null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;

    }
    
    
}

