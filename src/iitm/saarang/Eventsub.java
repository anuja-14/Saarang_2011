package iitm.saarang;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Eventsub extends ListActivity
{  
	
    public int k;
    public String[] subevents={"","","","","","","","","","","",""};
    public Eventmanager e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side);
        
       String title=new String("");
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            title = extras.getString("value");
        }

        Button t=(Button)findViewById(R.id.text2);
        t.setText(title);
      int i;
      k=0;
      e =new Eventmanager();
      e.createdata();

      
      for(i=0;i<e.allevents.length;i++)
      {
    	 if((e.allevents[i].type).equals(title))
    	  {
    		  subevents[k]=e.allevents[i].name;
    		  k++;
    	  }
      }
    	  
      setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,subevents)); 
     
	 }
    
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(position<=k)
        {	
        Intent i = new Intent(this,Eventbody.class);
        Bundle b = new Bundle(); 
        b.putString("value",e.finddesbysub(subevents[position]));
        b.putString("value2", subevents[position]);
        i.putExtras(b);
        startActivity(i);
        }
    }


};
