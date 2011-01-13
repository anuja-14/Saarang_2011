package iitm.saarang;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

public class Eventsub_day extends Activity
{
	private SaarangDbAdapter mDbHelper;
private static  String event_name="dance";
private static String time="10";
private static String venue="11";
private static int day=1;
private static final int details = Menu.FIRST;
//private static final int coord = Menu.FIRST + 1;
private static final int  book= Menu.FIRST + 1;
private Menu menuorig;
public Eventmanager e;
private String bookmark;
private Eventsdbadapter test;
private long bookid;
private long event_map_id;
private long book_id;
private long id;
	
	public void onCreate(Bundle savedInstanceState) 
	{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.details3);
	Bundle extras= getIntent().getExtras();
	id=extras.getLong("event");
	mDbHelper = new SaarangDbAdapter(this);
	mDbHelper.open();
	Button t=(Button)findViewById(R.id.text12);
	 TextView u=(TextView)findViewById(R.id.text13);
     TextView v=(TextView)findViewById(R.id.text14);
     TextView w=(TextView)findViewById(R.id.text15);
 	
	Cursor c =mDbHelper.fetchEvent(id);
	startManagingCursor(c);
	event_name=c.getString(0);
	day=c.getInt(1);
	time=c.getString(2);
	venue=c.getString(3);
	event_map_id=Long.parseLong(c.getString(4));
	book_id=c.getInt(5);
	if(book_id==0)
		bookmark="Add Bookmark";
	else
		bookmark="Remove Bookmark";
	t.setText(event_name);
	u.setText(day+"");
	v.setText(time);
	w.setText(venue);
	
//	fillDescription();
	
	}
	
	 public boolean onCreateOptionsMenu(Menu menu) {
	        super.onCreateOptionsMenu(menu);
	        menuorig=menu;
	      //  bookmark="jdskajd";
	        menu.add(0, details, 0, "details");
	      //  menu.add(0, coord, 0, "Coordinators");
	        menu.add(0,book,0,bookmark);
	       
	        return true;
	    }  
	 
	 
	 public boolean onMenuItemSelected(int featureId, MenuItem item) {
		 super.onMenuItemSelected(featureId, item);
		 e=new Eventmanager();
     	e.createData();
     	String title=e.findsubbyid(event_map_id);
         String type=e.findtypebysub(title);
         String des=e.finddesbysub(title);
	    	switch(item.getItemId()) {
	        case book:
	        	if(book_id==0)
	        	{
	        		mDbHelper.update(id,1);
	        		book_id=1;
	        		bookmark="Remove Bookmark";
	        	}
	        	else
	        	{
	        		mDbHelper.update(id,0);
	        		book_id=0;
	        		bookmark="Add Bookmark";
	        		
	        	}
	           menuorig.clear();
	           boolean i=onCreateOptionsMenu(menuorig);
	            break;
	            
	        case details:
	        	 Intent i1 = new Intent(this,Eventbody.class);
	             Bundle b = new Bundle(); 
	             b.putString("value",des);
	             b.putString("value2",title+"hello");
	             i1.putExtras(b);
	             startActivity(i1);
	             break;
	      //  case coord:
	        //	break;	        	
	      
	        	
	    	}
	    	
	        	
	        	
	        return super.onMenuItemSelected(featureId, item);
	    }
	    
	    
	

}
