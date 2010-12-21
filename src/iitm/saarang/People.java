package iitm.saarang;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class People extends ListActivity{
	private String[] items={"Cores","Coordinators"};
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.side);
	Button t=(Button)findViewById(R.id.text2);
	t.setText("People");
	setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem, items));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		 super.onListItemClick(l, v, position, id);
		    Intent i = new Intent(this,Peoplesub.class);
		    Bundle b = new Bundle(); 
		    b.putString("value",items[position]);
		    i.putExtras(b);
		    startActivity(i);
	}


}
