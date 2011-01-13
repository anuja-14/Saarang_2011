package iitm.saarang;




import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.AdapterView.AdapterContextMenuInfo;

public class booksub extends ListActivity { 
	private Eventsdbadapter test;
	private ppldbadapter test2;
	private static final int DELETE_ID = Menu.FIRST + 1;
	private String title;
	SimpleCursorAdapter notes;
	public Cursor listcursor;
	@Override
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.side);
    
    title=new String("");
    Bundle extras = getIntent().getExtras();
    if (extras != null) {
        title = extras.getString("value");
    }
    Button t=(Button)findViewById(R.id.text2);
    
    
    /*long id=e.createNote("first", "second", "third");
    if(id==-1)*/
    	t.setText(title);
    
    fillData();
    registerForContextMenu(getListView());
}
	
	 private void fillData() {
		 if(title.equals("Events"))
				 { 
			 test= new Eventsdbadapter(this);
			    test.open();
			 
			 listcursor = test.fetchallevents();
	        startManagingCursor(listcursor);
	        
	        // Create an array to specify the fields we want to display in the list (only TITLE)
	        String[] from = new String[]{Eventsdbadapter.KEY_TITLE};
	        
	        // and an array of the fields we want to bind those fields to (in this case just text1)
	        int[] to = new int[]{R.id.text1};
	        
	        // Now create a simple cursor adapter and set it to display
	        notes = 
	        	    new SimpleCursorAdapter(this, R.layout.simplelistitem, listcursor, from, to);
	        setListAdapter(notes);
				 }
		 if(title.equals("People"))
		 { 
			 
	 test2= new ppldbadapter(this);
	    test2.open();
	 
	 listcursor = test2.fetchallppl();
    startManagingCursor(listcursor);
    
    // Create an array to specify the fields we want to display in the list (only TITLE)
    String[] from = new String[]{Eventsdbadapter.KEY_TITLE};
    
    // and an array of the fields we want to bind those fields to (in this case just text1)
    int[] to = new int[]{R.id.text1};
    
    // Now create a simple cursor adapter and set it to display
    notes = 
    	    new SimpleCursorAdapter(this, R.layout.simplelistitem, listcursor, from, to);
    setListAdapter(notes);
		 }
	    }
	    
	  @Override
		public void onCreateContextMenu(ContextMenu menu, View v,
				ContextMenuInfo menuInfo) {
			super.onCreateContextMenu(menu, v, menuInfo);
	        menu.add(0, DELETE_ID, 0, "Remove bookmark");
		}

	    @Override
		public boolean onContextItemSelected(MenuItem item) {
			switch(item.getItemId()) {
	    	case DELETE_ID:
	    		AdapterContextMenuInfo info = (AdapterContextMenuInfo) item.getMenuInfo();
		        if(title.equals("Events"))
	    		    test.deleteNote(info.id);
		        else if(title.equals("People"))
		        	test2.deleteNote(info.id);
		        fillData();
		        return true;
			}
			return super.onContextItemSelected(item);
		}
	    @Override
	    protected void onListItemClick(ListView l, View v, int position, long id) {
	        super.onListItemClick(l, v, position, id);
	        if(title.equals("Events"))
	        {
	        int index = listcursor.getColumnIndex("name");
	        int index2 = listcursor.getColumnIndex("description");
	       	Eventmanager e=new Eventmanager();
	       	e.createData();
	        Intent i = new Intent(this,Eventbody.class);
	        Bundle b = new Bundle(); 
	        listcursor.moveToFirst();
	        for(int j=0;j<position;j++)
	        	listcursor.moveToNext();
	        
	        b.putString("value",listcursor.getString(index2));
	        b.putString("value2",listcursor.getString(index));
	        i.putExtras(b);
	        startActivity(i);
	        }
	        if(title.equals("People"))
	        {
	        int index = listcursor.getColumnIndex("name");
	        
	       	pplmanager p=new pplmanager();
	       	p.createdata();
	        Intent i = new Intent(this,pplinfo.class);
	        Bundle b = new Bundle(); 
	        listcursor.moveToFirst();
	        for(int j=0;j<position;j++)
	        	listcursor.moveToNext();
	        
	        //b.putString("value",listcursor.getString(index2));
	        b.putString("value",listcursor.getString(index));
	        i.putExtras(b);
	        startActivity(i);
	        }
	    }
	
}
