package iitm.saarang;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Checkbox extends Activity {
    /** Called when the activity is first created. */
	
	private CheckBoxifiedTextListAdapter cbla;
	private CheckBoxifiedTextListAdapter cbla2;
	// Create CheckBox List Adapter, cbla
	private String[] items = {"Events","People","Schedule"};
	// Array of string we want to display in our list

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.search);
        ListView l=(ListView)findViewById(R.id.list1);
        cbla = new CheckBoxifiedTextListAdapter(this);
        int selection=-1;
        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            selection = extras.getInt("selection");
            
        }
        
        if(selection==0)
        {
        	cbla.addItem(new CheckBoxifiedText(items[0], false));
        	cbla.addItem(new CheckBoxifiedText(items[1], false));
        	cbla.addItem(new CheckBoxifiedText(items[2], false));
        }
        if(selection==1)
        {
        	cbla.addItem(new CheckBoxifiedText(items[0], true));
        	cbla.addItem(new CheckBoxifiedText(items[1], false));
        	cbla.addItem(new CheckBoxifiedText(items[2], false));
        }
        if(selection==2)
        {
        	cbla.addItem(new CheckBoxifiedText(items[0], false));
        	cbla.addItem(new CheckBoxifiedText(items[1], true));
        	cbla.addItem(new CheckBoxifiedText(items[2], false));
        }
        // Display it
        l.setAdapter(cbla);
        //setListAdapter(cbla);
        ListView u=(ListView)findViewById(R.id.list2);
        String[] items2 = {"Case insensitive","Include details"};
        cbla2 = new CheckBoxifiedTextListAdapter(this);
        for(int k=0; k<items2.length; k++)
        {
        	cbla2.addItem(new CheckBoxifiedText(items2[k], false));
        }  
        // Display it
        u.setAdapter(cbla2);
        
       Button b=(Button)findViewById(R.id.button1); 
       b.setOnClickListener( new OnClickListener()
    {
    	   
   		public void onClick(View v) {
    		   int k=0;
EditText e = null;
    		   for(k=0; k<items.length; k++)
    	        {
    	        	if (cbla.isSelectable(k)==true)
    	        		break;
    	        } 
    		   int t;
    		   if(cbla2.isSelectable(0)==true && cbla2.isSelectable(1)==true)
    		     t=0;
    		   else if(cbla2.isSelectable(0)==true)
    			   t=1;
    		   else if(cbla2.isSelectable(1)==true)
    			   t=2;
    		   else
    			   t=3;
    		   if(k<2)
    		   {
    			   
    		   Intent i = new Intent(Checkbox.this,Searchresults.class);
    		   Bundle b=new Bundle();
    		   b.putInt("first", k);
    		   b.putInt("second", t);
    		  e=(EditText)findViewById(R.id.edit1);
    		  b.putString("third",e.getText().toString());
    		   i.putExtras(b);
    		   
   	        startActivity(i);   
    		   }
    		   else if (k==2)
    		   {
    			   e=(EditText)findViewById(R.id.edit1);
    			   Intent i = new Intent(Checkbox.this,search_schedule.class);
    			   Bundle b = new Bundle();
    			   b.putString("search",e.getText().toString());
    			   i.putExtras(b);
    			   startActivity(i);
    		   }
    		   else 
    		 {    Context context = getApplicationContext();

    			   int duration = Toast.LENGTH_SHORT;

    		   Toast toast = Toast.makeText(context, "Incomplete information", duration);
    		   toast.show();
    		 } 
    		   
    		   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   }
    });
       
       
       
       
    }
}

