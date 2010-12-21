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
	private static final int DELETE_ID = Menu.FIRST + 1;
	
	SimpleCursorAdapter notes;
	public Cursor eventscursor;
	@Override
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.side);
    Button t=(Button)findViewById(R.id.text2);
    t.setText("Events");
     test= new Eventsdbadapter(this);
    test.open();
    /*long id=e.createNote("first", "second", "third");
    if(id==-1)
    	t.setText("Not working");*/
  fillData();
    registerForContextMenu(getListView());
}
	
	 private void fillData() {
	        eventscursor = test.fetchallevents();
	        startManagingCursor(eventscursor);
	        
	        // Create an array to specify the fields we want to display in the list (only TITLE)
	        String[] from = new String[]{Eventsdbadapter.KEY_TITLE};
	        
	        // and an array of the fields we want to bind those fields to (in this case just text1)
	        int[] to = new int[]{R.id.text1};
	        
	        // Now create a simple cursor adapter and set it to display
	        notes = 
	        	    new SimpleCursorAdapter(this, R.layout.simplelistitem, eventscursor, from, to);
	        setListAdapter(notes);
	        
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
		        test.deleteNote(info.id);
		        fillData();
		        return true;
			}
			return super.onContextItemSelected(item);
		}
	    @Override
	    protected void onListItemClick(ListView l, View v, int position, long id) {
	        super.onListItemClick(l, v, position, id);
	        int index = eventscursor.getColumnIndex("name");
	        int index2 = eventscursor.getColumnIndex("description");
	       	Eventmanager e=new Eventmanager();
	       	e.createdata();
	        Intent i = new Intent(this,Eventbody.class);
	        Bundle b = new Bundle(); 
	        eventscursor.moveToFirst();
	        for(int j=0;j<position;j++)
	        	eventscursor.moveToNext();
	        
	        b.putString("value",eventscursor.getString(index2));
	        b.putString("value2",eventscursor.getString(index));
	        i.putExtras(b);
	        startActivity(i);
	        
	    }
	
}
