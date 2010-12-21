package iitm.saarang;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Coordsub extends ListActivity 
{
	public  pplmanager p;
	public String title;
	public String title2;
	public String[] types;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side);
       title=new String("");
       
        Bundle extras = getIntent().getExtras();title2=new String("");
        
        if (extras != null) {
            title = extras.getString("value");
             
        }
        
        int k=0;
        p=new pplmanager();
        p.createdata();
        if(title.equals("Design"))
        {
        	String[] items={"Ambience","Design","IP","IP(Events)","Photography & Videography"};
          setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,items)); 
         types=items; 
        }
        if(title.equals("Events"))
        {
        	String[] items={"Antakshari","Biz Quiz","Cartoonist","Choreo Nite & Free Style Dancing","Classical Dance","Classical Music","Cluedo","Creative Writing & The Fourth Estate"
        			        ,"Crossie","Daily Events","Daily & Online Quiz","Essence","Fine Arts","Geo-Genius","India Quiz","Informals","Lectures & Demos","Light Music","Lonewolf","Online Debate",
        			        "Online media","Paintball","Photography contest","Potpourri","Saarang Village","Scrabble","Short Film Making","Speaking Events"
        			        ,"SpEnt Quiz","Thespian Events","Treasure Hunt","Western Music","Whose Line","Workshops","WTGW"};
          setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,items)); 
         types=items;  
        }
        if(title.equals("Facilities"))
        {
        	String[] items={"Equipment","Facilities & Requirements","Production"};
          setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,items)); 
         types=items; 
        }
        if(title.equals("Finance"))
        {
        	String[] items={"Catering","Finance","PPM","Sales & Distribution","Transport"};
          setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,items)); 
         types=items; 
        }
        if(title.equals("Publicity & Sales"))
        {
        	String[] items={"EP","Ticket Sales"};
          setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,items)); 
         types=items; 
        } 
        if(title.equals("Spons & PR"))
        {
        	String[] items={"Newsletter","Spons pub & Marketing","Spons & PR"};
          setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,items)); 
         types=items; 
        }
        if(title.equals("Web operations"))
        {
        	String[] items={"Mobile Operations","Web Operations"};
          setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,items)); 
         types=items; 
        }
        Button t=(Button)findViewById(R.id.text2);
        t.setText(title);
        
	}
	
	
     //@Override
    	protected void onListItemClick(ListView l, View v, int position, long id) {
         	 super.onListItemClick(l, v, position, id);
    		    Intent i = new Intent(this,pplname.class);
    		    Bundle b = new Bundle(); 
    		    b.putString("value",types[position]);
    		    b.putString("value2", "Coordinators");
    		    i.putExtras(b);
    		    startActivity(i);
    		  
    	
       }
       
}


