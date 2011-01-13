package iitm.saarang;


import android.app.ListActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Proshows extends ListActivity {

private String[] items={"Introduction","Pro Shows" };    
public Eventmanager e; 
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) 
{
super.onCreate(savedInstanceState);
setContentView(R.layout.side);
TextView t=(TextView)findViewById(R.id.text2);
t.setText("Pro Shows");
setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem, items));
}

@Override
protected void onListItemClick(ListView l, View v, int position, long id) {
    super.onListItemClick(l, v, position, id);
    e=new Eventmanager();
    //e.createdata();
    if(position==0)
    {	
    Intent i = new Intent(this,Eventbody.class);
    Bundle b = new Bundle(); 
    b.putString("value",e.finddesbysub("Pro Shows"));
    b.putString("value2", "Pro Shows");
    i.putExtras(b);
    startActivity(i);
    }
}


}

