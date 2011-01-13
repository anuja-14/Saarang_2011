package iitm.saarang;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class venue extends ListActivity {
	private String[] venues={"ICSR","HSB","ChLT","CLT","PhLT",
            "FA Hut","Sangam","OAT","Sanskriti","DOMS","SAC","Bindaas","Informals","Paintball",  };    

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.side);
	Button t=(Button)findViewById(R.id.text2);
	t.setText("Venues");
	setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem, venues));
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
	    super.onListItemClick(l, v, position, id);
	    Intent i = new Intent(this,map.class);
	    Bundle b = new Bundle(); 
	    b.putInt("value",position);
	    i.putExtras(b);
	    startActivity(i);
	}


}

