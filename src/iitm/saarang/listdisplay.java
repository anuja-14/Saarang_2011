package iitm.saarang;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class listdisplay extends ListActivity {
	Eventmanager e;
	public String[] list;
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
	super.onCreate(savedInstanceState);
	  String title=new String("");
      Bundle extras = getIntent().getExtras();
      if (extras != null) {
          title = extras.getString("value");
      }
	e=new Eventmanager();
	e.createData();
	list=new String[e.findcoordsbysub(title).length];
	pplnode[] dum=e.findcoordsbysub(title);
	for(int i=0;i<dum.length;i++)
		list[i]=dum[i].name;
	setContentView(R.layout.side);
	Button t=(Button)findViewById(R.id.text2);
	t.setText("Coordinators");
	setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,list ));
	}

	 @Override
	    protected void onListItemClick(ListView l, View v, int position, long id) {
	        super.onListItemClick(l, v, position, id);
	        	
	        Intent i = new Intent(this,pplinfo.class);
	        Bundle b = new Bundle(); 
	        b.putString("value",list[position]);
	       
	        i.putExtras(b);
	        startActivity(i);
	        

}}
