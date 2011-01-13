package iitm.saarang;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Peoplesub extends ListActivity 
{
	public  pplmanager p;
	public String title;
	public String[] types;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side);
       title=new String("");
        Bundle extras = getIntent().getExtras();
        
        if (extras != null) {
            title = extras.getString("value");
        }
        int k=0;
        p=new pplmanager();
        p.createdata();
        if(title.equals("Cores"))
        {
        	String[] items={"Design","Events","Facilities","Finance","Hospitality","Web Operations","Publicity Sales and Marketing","QMS","Security","Spons PR & Media"};
          setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,items)); 
         types=items; 
        }
        if(title.equals("Coordinators"))
        {
        	String[] items={"Design","Events","Facilities","Finance","Hospitality","ProShows","Publicity & Sales","QMS","Security","Spons & PR","Web operations"};
          setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,items)); 
         types=items;  
        }
       
        Button t=(Button)findViewById(R.id.text2);
        t.setText(title);
        
        
	}
	
	
     @Override
    	protected void onListItemClick(ListView l, View v, int position, long id) {
         	 super.onListItemClick(l, v, position, id);
    		 if(title.equals("Coordinators"))
    		 {
    			 if((position==0)|(position==1)|(position==2)|(position==3)|(position==6)|(position==9)|(position==10)|(position==4))
    		       {Intent i = new Intent(this,Coordsub.class);
    			  Bundle b = new Bundle(); 
    		    b.putString("value",types[position]);
    		   
    		    i.putExtras(b);
    		    startActivity(i);}
    			 else
    			 {Intent i = new Intent(this,pplname.class);
   			      Bundle b = new Bundle(); 
   			      
   		          b.putString("value",types[position]);
   		          b.putString("value2","Coordinators");
   		          i.putExtras(b);
   		          startActivity(i);}
    				 
    			 
    		  }
    		if(title.equals("Cores"))
    		 {
    		    Intent i = new Intent(this,pplname.class);
    		    Bundle b = new Bundle(); 
    		    b.putString("value",types[position]);
    		    b.putString("value2","Cores");
    		    i.putExtras(b);
    		    startActivity(i);
    		  }
    		        
       }
       
}


