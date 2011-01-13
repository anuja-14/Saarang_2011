
package iitm.saarang;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

import java.io.BufferedInputStream; 
import java.io.InputStream; 
import java.net.URL; 
import java.net.URLConnection; 

import org.apache.http.util.ByteArrayBuffer; 

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView; 
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;

public class News extends ListActivity {
	private NewsAdapter mDbHelper;
	private static final int update = Menu.FIRST;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
    	super.onCreate(savedInstanceState);
    	  setContentView(R.layout.side);
    	  Button t=(Button)findViewById(R.id.text2);
          t.setText("News");
    	mDbHelper = new NewsAdapter(this);
    	mDbHelper.open();
      //  TextView tv =(TextView)findViewById(R.id.text16);
      prepareDummydb();
       
       Cursor c = mDbHelper.fetchAllNews();
        startManagingCursor(c);
       String [] from = new String[]{NewsAdapter.KEY_TITLE};
        int[] to= new int[]{R.id.text1};
         SimpleCursorAdapter notes = new SimpleCursorAdapter(this,R.layout.simplelistitem,c,from,to);
        setListAdapter(notes);
   
    }
    
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        
        
        menu.add(0, update, 0, "Update");
         return true;
    }  
    
    public void update ()
    {
    	int cnt =getCount();
    	
    	Cursor mCursor= mDbHelper.fetchAllNews();
    	int db_cnt=mCursor.getCount();
    	if(cnt==db_cnt)
    	{
    		
    	}
    	else
    	{
    		for(int counter=db_cnt+1;counter<=cnt;counter++)
    		{
    			String myString = null; 
    	         try { 
    	         
    	              URL myURL = new URL( 
    	                        "http://saarang.iitm.ac.in/mobile10/news/retrieve.php?id="+counter); 
    	            
    	              URLConnection ucon = myURL.openConnection(); 

    	              InputStream is = ucon.getInputStream(); 
    	              BufferedInputStream bis = new BufferedInputStream(is); 
    	           
    	              ByteArrayBuffer baf = new ByteArrayBuffer(50); 
    	              int current = 0; 
    	              while((current = bis.read()) != -1){ 
    	                   baf.append((byte)current); 
    	              
    	              } 

    	           
    	              myString = new String(baf.toByteArray()); 
    	         } catch (Exception e) { 
    	           
    	              myString = e.getMessage(); 
    	         } 
    	    
    	         Spanned html = Html.fromHtml(myString);
    	         updateNews(html.toString());
    	         
    		}
    	}
    	
    }
    
    public void updateNews(String html)
    {
    	String title="";
    	String desc="";
    	int flag=0;
    	for (int i=0;i<html.length();i++)
    	{
    	
    	char ch = html.charAt(i);
    	if(ch=='#')
    	{
    		flag++;
    		i++;
    	ch=html.charAt(i);
    	}
    	if(ch=='$')
    	{
    		mDbHelper.createNews(title, desc);
    		title="";
    		desc="";
    		flag=0;
    		
    	}
    	if(ch=='\n')
    			{
    			i++;
    			ch=html.charAt(i);
    			    			desc=desc+"...";
    			}
    	if (flag==1)
    		title=title+ch;
    	if(flag==2)
    			desc=desc+ch;
    	}
    }
    
    public int getCount()
    {
    	 String myString = null; 
         try { 
         
              URL myURL = new URL( 
                        "http://saarang.iitm.ac.in/mobile10/news/gettotal.php"); 
            
              URLConnection ucon = myURL.openConnection(); 

              InputStream is = ucon.getInputStream(); 
              BufferedInputStream bis = new BufferedInputStream(is); 
           
              ByteArrayBuffer baf = new ByteArrayBuffer(50); 
              int current = 0; 
              while((current = bis.read()) != -1){ 
                   baf.append((byte)current); 
              } 

           
              myString = new String(baf.toByteArray()); 
         } catch (Exception e) { 
           
              myString = e.getMessage(); 
         } 
    
         Spanned html = Html.fromHtml(myString);
         String count=html.toString();
         int cnt=Integer.parseInt(count);
         return cnt;
    }
    
    public void prepareDummydb()
    {
    
    	Cursor c= mDbHelper.fetchAllNews();
    	startManagingCursor(c);
    	if (c.getCount()<1)
    	{
    	mDbHelper.createNews("Popular lecture series", "Dr.kamal hasan -january 22nd at 9am in Icsr main auditorium");
    	mDbHelper.createNews("Hospitality Accomodation", "Hospitality Accomodation to be extended to 12th jan");
    	mDbHelper.createNews("proshows", "proshow to be conducted with a delay of half an hour");
    	mDbHelper.createNews("tickets", "tickets of rockshow available online at saarang.aspx/limata.com");
    	}
    	
    }
    
    
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent i = new Intent(this,News_sub.class);
        Bundle b = new Bundle(); 
        b.putLong("id",id);
        i.putExtras(b);
        startActivity(i);
    }
    
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
    	Button t=(Button)findViewById(R.id.text5);
    	switch(item.getItemId()) {
    	case update:
    		update();
    	}
      	
    	
    	 setContentView(R.layout.side);
   	  Button t1=(Button)findViewById(R.id.text2);
         t1.setText("News");
   	mDbHelper = new NewsAdapter(this);
   	mDbHelper.open();
     //  TextView tv =(TextView)findViewById(R.id.text16);
     prepareDummydb();
      
      Cursor c = mDbHelper.fetchAllNews();
       startManagingCursor(c);
      String [] from = new String[]{NewsAdapter.KEY_TITLE};
       int[] to= new int[]{R.id.text1};
        SimpleCursorAdapter notes = new SimpleCursorAdapter(this,R.layout.simplelistitem,c,from,to);
       setListAdapter(notes);
        	
        return super.onMenuItemSelected(featureId, item);
    }
    
}