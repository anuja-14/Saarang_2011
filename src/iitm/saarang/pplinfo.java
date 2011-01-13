package iitm.saarang;



import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class pplinfo extends Activity{
	 private static final int call = Menu.FIRST;
	    private static final int sms = Menu.FIRST + 1;
	    private static final int  book= Menu.FIRST + 2;
	    public pplmanager p;
	    public int c;
	   
	    private ppldbadapter test;
	   
	   
	    private String bookmark="Add bookmark";
	    private Menu menuorig;
	    private long bookid;
	    private String name;
	    private String dep;
	    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        test=new ppldbadapter(this);
        test.open();
       // test.createNote("", "","");
      Cursor pplcursor = test.fetchallppl();
       
       name=new String("");
        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            name = extras.getString("value");
            
        }
        setContentView(R.layout.details2);
        Button t=(Button)findViewById(R.id.text8);
        TextView u=(TextView)findViewById(R.id.text9);
        TextView v=(TextView)findViewById(R.id.text10);
        TextView w=(TextView)findViewById(R.id.text11);
        
        t.setText(name);
        
        p=new pplmanager();
        p.createdata();
        c=p.findposbyname(name);
        u.setText(p.allppl[c].nick);
        v.setText(p.allppl[c].department);
        w.setText(p.allppl[c].phno);
       
        
        int index = pplcursor.getColumnIndex("name");
        int index2 = pplcursor.getColumnIndex("_id");
        pplcursor.moveToFirst();
        while (pplcursor.isAfterLast() == false) 
        {
        	if((pplcursor.getString(index).equals(name)))
        		{
        		bookmark="Remove bookmark";
        		bookid=pplcursor.getLong(index2);
        		}
        	
        	pplcursor.moveToNext();
        }
         
       
	
}
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menuorig=menu;
        menu.add(0, call, 0, "Call");
        menu.add(0, sms, 0, "Send SMS");
        menu.add(0,book,0,bookmark);
        return true;
    }   
    
    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch(item.getItemId()) {
        case call:
        	
        	try {
        	        Intent callIntent = new Intent(Intent.ACTION_CALL);
        	        callIntent.setData(Uri.parse("tel:" + p.allppl[c].phno ));
        	        startActivity(callIntent);
        	
        	    } catch (ActivityNotFoundException activityException) {
        	       Log.e("helloandroid dialing example", "Call failed");
        	   
        	
              }
                  break;
        case sms:
        	/* Intent sendIntent = new Intent(Intent.ACTION_VIEW,Uri.parse( "sms:" + p.allppl[c].phno ));
             sendIntent.putExtra("sms_body.", "Your text goes here "); 
             sendIntent.setType("vnd.android-dir/mms-sms");
             context.startActivity(sendIntent);
             break;*/
        	Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse( "sms:" + p.allppl[c].phno ) );
        	intent.putExtra( "sms_body", "" );
        	this.startActivity( intent );
                  break;
        case book:
        	  p=new pplmanager();
        	  p.createdata();
              String nick=new String("");
              nick=p.findnickbyname(name);
              dep=p.finddepbyname(name);
            
        	if(bookmark.equals("Add bookmark"))
            {  
        		long id=test.createNote(name,nick,dep);
        		//long id=0;
        		p.allppl[p.findposbyname(name)].bookid=id;
        	    bookmark="Remove bookmark";
        	}
        	else if(bookmark.equals("Remove bookmark"))
            {  
        		
        	   test.deleteNote(bookid);
        	   p.allppl[p.findposbyname(name)].bookid=-1;
        	   bookmark="Add bookmark";
        	}
         
            menuorig.clear();
           boolean i=onCreateOptionsMenu(menuorig);
            break;
        
    	}
        	
        	
        return super.onMenuItemSelected(featureId, item);
    }
        
       
    }
    
    
