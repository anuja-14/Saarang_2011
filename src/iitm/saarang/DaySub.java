package iitm.saarang;





import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class DaySub extends ListActivity {
    private SaarangDbAdapter mDbHelper;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side);
       
        mDbHelper = new SaarangDbAdapter(this);
        mDbHelper.open();
       createEvent();
        fillData();
        //Intent i = new Intent(this,sub.class);

    }

  
   /* public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        boolean result =super.onCreateOptionsMenu(menu);
        menu.add(0,INSERT_ID,0,R.string.menu_item);
        return result;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
    	switch(item.getItemId())
    	{
    	case INSERT_ID:
    		createNote();
    		return true;
    	}
        return super.onOptionsItemSelected(item);
        
    }*/
    public void createEvent ()
    {
    /*	mDbHelper.createEvent("dance","sac", 1, "10");
    	mDbHelper.createEvent("artworkshop", "icsr",2, "11");
    	mDbHelper.createEvent("artworkshop2", "icsr",3, "11");
    	mDbHelper.createEvent("artworkshop3", "icsr",4, "11");y.e
    	
   //	mDbHelper.deleteNote(1);
    //	String from []=new String[]{"anauj"};8
    	//setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,from ));*/
    	
 
    	
    }
    public void fillData()
    {
    	String day;
    	Bundle extras= getIntent().getExtras();
    	String day_val=extras.getString("value");
    	 Button t=(Button)findViewById(R.id.text2);
         t.setText(day_val);
    	if(day_val.equals("Day1"))
    	{
    		day="1";
    	}
    	else if (day_val.equals("Day2"))
    		day="2";
    	else if (day_val.equals("Day3"))
    		day="3";
    		else
    			day="4";
   
 Cursor c = mDbHelper.fetchAllEvents(day);
  startManagingCursor(c);
//  c.getColumnIndex("event_name");
  //c.getCount();
 String [] from = new String[]{SaarangDbAdapter.KEY_EVENT};
  int[] to= new int[]{R.id.text1};
   SimpleCursorAdapter notes = new SimpleCursorAdapter(this,R.layout.simplelistitem,c,from,to);
  setListAdapter(notes);
    }
    
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent i = new Intent(this,Eventsub_day.class);
        Bundle b = new Bundle(); 
        b.putLong("event",id);
        i.putExtras(b);
        startActivity(i);
    }
    
}
