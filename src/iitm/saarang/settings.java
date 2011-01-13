package iitm.saarang;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class settings extends Activity {
    /** Called when the activity is first created. */
	private settingsdbadapter helper;
	private CheckBoxifiedTextListAdapter cbla;
	private CheckBoxifiedTextListAdapter cbla2;
	// Create CheckBox List Adapter, cbla
	private String[] items = {"Small","Medium","Large"};
	private String[] items2 = {"Default","Monospace","Sans serif","Serif"};
	// Array of string we want to display in our list

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.settings);
        ListView l=(ListView)findViewById(R.id.list3);
        cbla = new CheckBoxifiedTextListAdapter(this);
        int selection=-1;
        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            selection = extras.getInt("selection");
            
        }
        helper=new settingsdbadapter(this);
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
        ListView u=(ListView)findViewById(R.id.list4);
        
       
        cbla2 = new CheckBoxifiedTextListAdapter(this);
        for(int k=0; k<items2.length; k++)
        {
        	cbla2.addItem(new CheckBoxifiedText(items2[k], false));
        }  
        // Display it
        CheckBoxifiedTextListAdapter dummy = new CheckBoxifiedTextListAdapter(this);
       
        
        u.setAdapter(cbla2);
        
       Button b=(Button)findViewById(R.id.button3); 
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
    		   for(t=0; t<items2.length; t++)
   	        {
   	        	if (cbla2.isSelectable(t)==true)
   	        		break;
   	        } 
    		   
    	       helper.open();
    	        Cursor c=helper.fetchallevents();
    	        c.moveToLast();
    		   if(k==0)
    		   {
    			   int id=c.getInt(0);
    			 helper.updateNote(id, 13, t);
    		   }
    		   if(k==1)
    		   {
    			   int id=c.getInt(0);
    			   helper.updateNote(id, 15, t);
    		   }
    		   if(k==2)
    		   {
    			  int id=c.getInt(0);
    			  helper.updateNote(id, 18, t);
    		   }
    		   
    	   Intent i=new Intent(settings.this,saarangmain.class);
    	   startActivity(i);
    	   
    	   
    	   
    	   
    	   }
    });
       
       
       
       
    }
}

