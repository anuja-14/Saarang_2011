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
        	String[] items={"Ambience","GraphicDesign","DesignFest","CreativeTeam","Photography","Videography"};
          setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,items)); 
         types=items; 
        }
        if(title.equals("Events"))
        {
        	String[] items={"FineArts","Choreo","ClassicalDance","Lectures and Demonstrations","Creative Writing","Crossie","Scrabble","WTGW",
        			       "PhotographyWorkshops","SFM","MUN","Classical Music","Light Music","Western Music","Kryptyx","BizQuiz"
        			        ,"India Quiz","SpEnt Quiz","Main Quiz","Speaking Events","Dramatics","Daily Events","QOS","Treasure Hunt"
        			        ,"Adventure Zone","Daily Quiz","Antakshari","Cluedo","Potpourrie","SaarangVillage","Workshops","Informals","CultureShow","Mr. & Ms.Saarang"};
          setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,items)); 
         types=items;  
        }
        if(title.equals("Facilities"))
        {
        	String[] items={"Equipment","Facilities","Production"};
          setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,items)); 
         types=items; 
        }
        if(title.equals("Finance"))
        {
        	String[] items={"Catering","Finance","PPM","Transportation","SalesandDistribution"};
          setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,items)); 
         types=items; 
        }
        if(title.equals("Publicity & Sales"))
        {
        	String[] items={"InternalPublicity","ExternalPublicity","Ticket Sales"};
          setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,items)); 
         types=items; 
        } 
        if(title.equals("Spons & PR"))
        {
        	String[] items={"CreativeNewsletter","Spons Pub","Spons,PR and Media","OnlineMedia","Sponssupport"};
          setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,items)); 
         types=items; 
        }
        if(title.equals("Web operations"))
        {
        	String[] items={"Mobile Operations","Web Operations"};
          setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,items)); 
         types=items; 
        }
        if(title.equals("Hospitality"))
        		{
        	String[] items={"Coordinators","Deputy coordinators"};
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
    		    if(title.equals("Hospitality"))
    		    {   if(position==0)
    		    	b.putString("value","HospitalityCoord");
    		    else if(position==1)
    		    	b.putString("value","HospitalityDeputyCoord");
    		    }
    		    else
    		    	b.putString("value",types[position]);
    		    b.putString("value2", "Coordinators");
    		    i.putExtras(b);
    		    startActivity(i);
    		  
    	
       }
       
}


