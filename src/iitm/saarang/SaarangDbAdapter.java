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
import android.sax.StartElementListener;
import android.util.Log;

public class SaarangDbAdapter {

    public static final String KEY_EVENT = "event";
    public static final String KEY_VENUE = "venue";
    public static final String KEY_ROWID = "_id";
    public static final String KEY_TIME = "time";
    public static final String KEY_DAY = "day";
    public static final String KEY_EVENT_ID="event_id";
    public static final String KEY_BOOK_ID="book_id";

    private static final String TAG = "NotesDbAdapter";
    private DatabaseHelper mDbHelper;
    private SQLiteDatabase mDb;
    

    private static final String DATABASE_CREATE =
            "create table events (_id integer primary key autoincrement, "
                    + "event text not null, day integer not null,venue text not null,time text not null,event_id text not null,book_id integer not null);";

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


    public long createEvent(String event,String venue,int day,String time,String event_id,int book_id) {
        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_EVENT, event);
        initialValues.put(KEY_VENUE, venue);
        initialValues.put(KEY_DAY, day);
        initialValues.put(KEY_TIME,time);
        initialValues.put(KEY_EVENT_ID,event_id);
        initialValues.put(KEY_BOOK_ID,book_id);
       // initialValues.put(KEY_ROWID, id);

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
                        KEY_TIME ,KEY_VENUE,KEY_EVENT_ID,KEY_BOOK_ID}, KEY_ROWID + "=" + rowId, null,
                        null, null, null, null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;

    }
    
    public void update(long id,int book_id)
    {
 	   ContentValues values= new ContentValues();
 	   values.put(KEY_BOOK_ID, book_id);
 	   int mCursor= mDb.update(DATABASE_TABLE, values, KEY_ROWID+"="+id,null);
    }
    
    public Cursor fetchEventsByBookid()
    {
    Cursor mCursor= 	 mDb.query(true, DATABASE_TABLE, new String[] {KEY_ROWID,KEY_EVENT,KEY_DAY,
            KEY_TIME ,KEY_VENUE,KEY_EVENT_ID}, KEY_BOOK_ID + "= 1" , null,
            null, null, null, null);
    return mCursor;
    }
    
    public Cursor search(String search)
    {
    	Cursor mCursor = mDb.query(true, DATABASE_TABLE, new String[] {KEY_ROWID,KEY_EVENT,KEY_DAY,
                KEY_TIME ,KEY_VENUE,KEY_EVENT_ID}, KEY_EVENT + " LIKE '%"+search+"%'" , null,
                null, null, null, null);
    	return mCursor;
    }
    
    public void set_data_update(String update_str)
    {
    	String event_name="";
    	String event_number="";
    	String day="";
    	String time="";
    	String venue="";
    	String id="";
    	 ContentValues initialValues = new ContentValues();
         
    	int counter=0;
    	char update_id_str=update_str.charAt(0);
    //	int update_id=Integer.parseInt("h");
    	switch(update_id_str)
    	{
    	case '1':
    		counter=0;
    		int flag=0;
    		for (int i=2;i<update_str.length()-1;i++)
    		{
    			if(update_str.charAt(i)==',')
    			{
    				counter++;
    				i++;
    			}
    			if(counter==0)
    			{
    				id+=update_str.charAt(i);
    			}
    			if (counter==1)
    			{
    				event_name+=update_str.charAt(i);
    			}
    			if(counter==2)
    				event_number+=update_str.charAt(i);
    			if(counter==3)
    				day+=update_str.charAt(i);
    			if(counter==4)
    				time+=update_str.charAt(i);
    			if(counter==5)
    			{
    				if(flag==0)
    				{
    					flag=1;
    					time+=":";
    				}
    				else 
    					time+=update_str.charAt(i);
    			}
    			
    			if (counter==6)
    			venue+=update_str.charAt(i);
    		}    
          initialValues.put(KEY_TIME, time);
          initialValues.put(KEY_BOOK_ID,0);
          initialValues.put(KEY_DAY, day);
          initialValues.put(KEY_EVENT, event_name);
          initialValues.put(KEY_VENUE, venue);
          initialValues.put(KEY_EVENT_ID, event_number);
          initialValues.put(KEY_ROWID, id);
    	mDb.insert(DATABASE_TABLE, null,initialValues);
          break;
    		
   	case '2':
    		counter=0;
    		for (int i=2;i<update_str.length()-1;i++)
    		{
    			if(update_str.charAt(i)==',')
    			{
    				counter++;
    				i++;
    			}
    			if(counter==0)
    			{
    				id+=update_str.charAt(i);
    			}
    			if (counter==1)
    			{
    				event_name+=update_str.charAt(i);
    			}
    		}    
          initialValues.put(KEY_EVENT, event_name);
    	mDb.update(DATABASE_TABLE, initialValues, "_id="+id,null);
          break;
	case '3':
		counter=0;
		for (int i=2;i<update_str.length()-1;i++)
		{
			if(update_str.charAt(i)==',')
			{
				counter++;
				i++;
			}
			if(counter==0)
			{
				id+=update_str.charAt(i);
			}
			if (counter==1)
			{
				event_number+=update_str.charAt(i);
			}
		}    
      initialValues.put(KEY_EVENT_ID, event_number);
	mDb.update(DATABASE_TABLE, initialValues, "_id="+id,null);
      break;
    	case '4':
    		counter=0;
    		for (int i=2;i<update_str.length();i++)
    		{
    			if(update_str.charAt(i)==',')
    			{
    				counter++;
    				i++;
    			}
    			if(counter==0)
    			{
    				id+=update_str.charAt(i);
    			}
    			if (counter==1)
    			{
    				day+=update_str.charAt(i);
    			}
    		}
    
            initialValues.put(KEY_DAY,day);
    		mDb.update(DATABASE_TABLE, initialValues, "_id="+id,null);
    		break;
    	case '5':
    		counter=0;
    		
    		for (int i=2;i<update_str.length();i++)
    		{
    			if(update_str.charAt(i)==',')
    			{
    				counter++;
    				i++;
    			}
    			if(counter==0)
    			{
    				id+=update_str.charAt(i);
    			}
    			if (counter==1)
    			{
    				time+=update_str.charAt(i);
    			}
    		}
    	String endtime="";
    		Cursor c = this.fetchEvent(Integer.parseInt(id));
    		String time_old=c.getString(2);
    		int flag2=0;
    		for (int i=0;i<time.length();i++)
    		{
    			if(time_old.charAt(i)==':')
    				flag2=1;
    			else if(flag2==0)
    			{
    				endtime+=time_old.charAt(i);
    			}
    				
    		}
    		
    		 initialValues.put(KEY_TIME,time);
    			mDb.update(DATABASE_TABLE, initialValues, "_id="+id,null);
    			break;
    		
    case '6':
		counter=0;
		
		for (int i=2;i<update_str.length();i++)
		{
			if(update_str.charAt(i)==',')
			{
				counter++;
				i++;
			}
			if(counter==0)
			{
				id+=update_str.charAt(i);
			}
			if (counter==1)
			{
				time+=update_str.charAt(i);
			}
		}
		String starttime="";
		Cursor c1 = this.fetchEvent(Integer.parseInt(id));
		String time_old1=c1.getString(2);
		for (int i=0;i<time.length();i++)
		{
			if(time_old1.charAt(i)==':')
				break;
			else
			{
				starttime+=time_old1.charAt(i);
			}
				
		}
		 initialValues.put(KEY_TIME,time);
			mDb.update(DATABASE_TABLE, initialValues, "_id="+id,null);
			break;
			
		
    case '7':
		counter=0;
		int flag1=0;
		for (int i=2;i<update_str.length();i++)
		{
			if(update_str.charAt(i)==',')
			{
				counter++;
				i++;
			}
			if(counter==0)
			{
				id+=update_str.charAt(i);
			}
			if (counter==1||counter==2)
			{
				if(counter==0& flag1==0)
				{
					flag1=1;
					time+=":";
				}
				time+=update_str.charAt(i);
			}
		}

        initialValues.put(KEY_TIME,time);
      
		mDb.update(DATABASE_TABLE, initialValues, "_id="+id,null);
		break;
		
		
    case '8':
		counter=0;
		for (int i=2;i<update_str.length();i++)
		{
			if(update_str.charAt(i)==',')
			{
				counter++;
				i++;
			}
			if(counter==0)
			{
				id+=update_str.charAt(i);
			}
			if (counter==1)
			{
				venue+=update_str.charAt(i);
			}
		}

        initialValues.put(KEY_VENUE,venue);
		mDb.update(DATABASE_TABLE, initialValues, "_id="+id,null);
		break;
		
    case '9':
		counter=0;
		for (int i=2;i<update_str.length();i++)
		{
			if(update_str.charAt(i)==',')
			{
				counter++;
				i++;
			}
			if(counter==0)
			{
				id+=update_str.charAt(i);
			}
			
		}

		mDb.delete(DATABASE_TABLE, "_id="+id,null);
		break;
		
	//default:
		//counter=0;
		
		
	}
    	
    	

    	
    }
 public Cursor fetchAllEventsbyvenue(String venue) {	
        
        return mDb.query(DATABASE_TABLE, new String[] {KEY_ROWID, KEY_EVENT,
                KEY_VENUE}, KEY_VENUE + " LIKE '%"+venue+"%'", null, null, null, null);
    }
    
    
}

