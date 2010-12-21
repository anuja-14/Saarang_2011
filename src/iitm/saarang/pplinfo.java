package iitm.saarang;



import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       String name=new String("");
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
         
       
	
}
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        
        menu.add(0, call, 0, "Call");
        menu.add(0, sms, 0, "Send SMS");
        menu.add(0,book,0,"Add Bookmark");
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
        
        
        }
        return super.onMenuItemSelected(featureId, item);
    }
    
    
}