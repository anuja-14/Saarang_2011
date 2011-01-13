package iitm.saarang;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class pplname extends ListActivity
{  
	
    public int k;
    public String[] subppl={"","","","","","","","","","","","","","","","","","","","","",""};
    public pplmanager e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);	 
       

        setContentView(R.layout.side);
       String title=new String("");
       String title2=new String("");
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            title = extras.getString("value");
            title2=extras.getString("value2");
        }
      
        
      int i;
      k=0;
      e =new pplmanager();
      e.createdata();
      int c1=e.noofcoords;
      int c2=e.noofcores;
      if(title2.equals("Coordinators"))
      { 
    	  
    	  for(i=0;i<c1;i++)
           if((e.allppl[i].department).equals(title))
    	  {
    		  subppl[k]=e.allppl[i].name;
    		  k++;
    	  }
      }
      else
    	 
    	  {
    	  for(i=c1;i<c1+c2;i++)
    	  
          {
        	 if((e.allppl[i].department).equals(title))
        	  {
        		  subppl[k]=e.allppl[i].name;
        		  k++;
        	  }
          }
      
             if(title.equals("Cul Secs"))
              {
    	          title="Cul Sec Arts";
    	          for(i=c1;i<c1+c2;i++)
    	        	  
    	          {
    	        	 if((e.allppl[i].department).equals(title))
    	        	  {
    	        		  subppl[k]=e.allppl[i].name;
    	        		  k++;
    	        	  }
    	          }
    	          for(i=c1;i<c1+c2;i++)
    	        	  
    	          {
    	        	 if((e.allppl[i].department).equals(title))
    	        	  {
    	        		  subppl[k]=e.allppl[i].name;
    	        		  k++;
    	        	  }
    	          }       
    	       
              }
    	  }
      
      setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,subppl)); 
      Button t=(Button)findViewById(R.id.text2);
      if(title.equals("HospitalityCoord") || title.equals("HospitalityDeputyCoord"))
    	  t.setText("Hospitality");
      else
    	  t.setText(title); 
	 }
    
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(position<=k)
        {	
        Intent i = new Intent(this,pplinfo.class);
        Bundle b = new Bundle(); 
	    b.putString("value",subppl[position]);
	    i.putExtras(b);
        startActivity(i);

        }
    }


};

