package iitm.saarang;

import android.app.Activity;
import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
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
	
	public void onCreate(Bundle savedInstanceState) 
	{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.details3);
	Bundle extras= getIntent().getExtras();
	Long id=extras.getLong("event");
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
	t.setText(event_name);
	u.setText(day+"");
	v.setText(time);
	w.setText(venue);
	
//	fillDescription();
	
	}
	

}
