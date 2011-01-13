package iitm.saarang;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
public class musicsub extends ListActivity {
//	private String[] listItems = {"Thespian Events", 
  //          "Quizzes", "Media events"};
//	private static final int ACTIVITY_CREATE=0;
 //   private static final int ACTIVITY_EDIT=1;

  //  private Eventsdbadapter mDbHelper;
   // private Cursor mNotesCursor;
private String[] Eventtypes={"Classical Music","Light Music" ,"Western Music" };    
/** Called when the activity is first created. */

@Override
public void onCreate(Bundle savedInstanceState) 
{
super.onCreate(savedInstanceState);
setContentView(R.layout.side);
Button t=(Button)findViewById(R.id.text2);
t.setText("Events");
setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem, Eventtypes));
}

@Override
protected void onListItemClick(ListView l, View v, int position, long id) {
    super.onListItemClick(l, v, position, id);

    Intent i = new Intent(this,Eventsub.class);
    Bundle b = new Bundle(); 
    b.putString("value",Eventtypes[position]);
    b.putInt("value1", 0);
    i.putExtras(b);
    startActivity(i);
}


}
