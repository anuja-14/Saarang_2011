package iitm.saarang;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class Eventbody extends Activity{
	private static final int schedule = Menu.FIRST;
    private static final int coord = Menu.FIRST + 1;
    private static final int  book= Menu.FIRST + 2;
    
    public Eventmanager e;
    private Eventsdbadapter test;
    private String title;
    private String des;
    private String bookmark="Add bookmark";
    private Menu menuorig;
    private long bookid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.side);
       title=new String("");
       des=new String("");
        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            des = extras.getString("value");
            title=extras.getString("value2");
            
        }
        setContentView(R.layout.body);
        Button t=(Button)findViewById(R.id.text5);
        t.setText(title);
        TextView u=(TextView)findViewById(R.id.text6);
        u.setText(des);
        u.setMovementMethod(new ScrollingMovementMethod()); 
         test=new Eventsdbadapter(this);
         test.open();
        
        Cursor eventscursor = test.fetchallevents();
        
        int index = eventscursor.getColumnIndex("name");
        int index2 = eventscursor.getColumnIndex("_id");
        eventscursor.moveToFirst();
        while (eventscursor.isAfterLast() == false) 
        {
        	if((eventscursor.getString(index).equals(title)))
        		{
        		bookmark="Remove bookmark";
        		bookid=eventscursor.getLong(index2);
        		}
        	
        	eventscursor.moveToNext();
        }

	
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menuorig=menu;
        
        menu.add(0, schedule, 0, "Schedule");
        menu.add(0, coord, 0, "Coordinators");
        menu.add(0,book,0,bookmark);
        return true;
    }  
    
    
    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
    	Button t=(Button)findViewById(R.id.text5);
    	switch(item.getItemId()) {
        case book:
        	e=new Eventmanager();
        	e.createdata();
            String type=e.findtypebysub(title);
            
        	if(bookmark.equals("Add bookmark"))
            {  
        		long id=test.createNote(title,type,des);
        		e.allevents[e.findidbysub(title)].bookid=id;
        	   bookmark="Remove bookmark";
        	}
        	else if(bookmark.equals("Remove bookmark"))
            {  
        		
        	   test.deleteNote(bookid);
        	   e.allevents[e.findidbysub(title)].bookid=-1;
        	   bookmark="Add bookmark";
        	}
         
           menuorig.clear();
           boolean i=onCreateOptionsMenu(menuorig);
            break;
        
    	}
        	
        	
        return super.onMenuItemSelected(featureId, item);
    }
    
}