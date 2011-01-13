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

public class search_schedule extends ListActivity {
    private SaarangDbAdapter mDbHelper;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side);
       
        mDbHelper = new SaarangDbAdapter(this);
        mDbHelper.open();
 
        fillData();
      

    }

  
   
      public void fillData()
    {
    	  Bundle extras=getIntent().getExtras();
    	  String search=(String)extras.get("search");
    	 Button t=(Button)findViewById(R.id.text2);
         t.setText(search);
    	
 Cursor c = mDbHelper.search(search);
  startManagingCursor(c);
  //c.getColumnIndex("event_name");
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
