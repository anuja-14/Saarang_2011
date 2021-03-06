package iitm.saarang;





import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class saarangmain extends ListActivity {
	
	private SaarangDbAdapter mDbHelper;
	private settingsdbadapter helper;
	public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.main);
        helper=new settingsdbadapter(this);
        helper.open();
        long rowid=-1;
//rowid=helper.createNote(10,"sans");
Cursor c=helper.fetchallevents();
if(c.getCount()==0)
	rowid=helper.createNote(13,0);

IconifiedTextListAdapter itla = new IconifiedTextListAdapter(this);


        //Cursor c= helper.fetchallevents();
  /*    if(c.getCount()==0)
        	rowid=helper.createNote(10, "SANS"); */  
        ImageView image = (ImageView) findViewById(R.id.test_image);
        
        
        mDbHelper= new SaarangDbAdapter(this);
        preparedb();
        itla.addItem(new IconifiedText("   Events", getResources().getDrawable(R.drawable.events)));
        itla.addItem(new IconifiedText("   Pro Shows", getResources().getDrawable(R.drawable.proshows)));
        itla.addItem(new IconifiedText("   Spotlight", getResources().getDrawable(R.drawable.spotlight)));
        //itla.addItem(new IconifiedText("   Quiz", getResources().getDrawable(R.drawable.quiz)));
        itla.addItem(new IconifiedText("   Schedule", getResources().getDrawable(R.drawable.schedule)));
        itla.addItem(new IconifiedText("   People", getResources().getDrawable(R.drawable.people)));
        itla.addItem(new IconifiedText("   Map", getResources().getDrawable(R.drawable.map)));
        itla.addItem(new IconifiedText("   Search", getResources().getDrawable(R.drawable.search)));
        itla.addItem(new IconifiedText("   News", getResources().getDrawable(R.drawable.news)));
        itla.addItem(new IconifiedText("   Bookmarks", getResources().getDrawable(R.drawable.bookmarks)));
        itla.addItem(new IconifiedText("   Hospitality", getResources().getDrawable(R.drawable.hospitality)));
        itla.addItem(new IconifiedText("   Settings", getResources().getDrawable(R.drawable.settings)));
        itla.addItem(new IconifiedText("   Help", getResources().getDrawable(R.drawable.help)));
        
        // Display it
        setListAdapter(itla);
	}
	 @Override
	    protected void onListItemClick(ListView l, View v, int position, long id) {
	        super.onListItemClick(l, v, position, id);
	        if(position==0)
	        {Intent i = new Intent(this, Events.class);
	        startActivity(i);}
	        super.onListItemClick(l, v, position, id);
	        if(position==1)
	        {Intent i = new Intent(this,Proshows.class);
	        startActivity(i);}
	        if(position==2)
	        {
	         Intent i=new Intent(this,Eventsub.class);
	         Bundle b = new Bundle(); 
	         b.putString("value","Spotlight");
	         i.putExtras(b);
	         startActivity(i);
	        }
	        if(position==4)
	        {Intent i = new Intent(this, People.class);
	        startActivity(i);}
	        if(position==3)
	        {
	        Intent i = new Intent(this,Schedule.class);	
	        startActivity(i);
	        }
	        if(position==8)
	        {Intent i = new Intent(this, Bookmarks.class);
	        startActivity(i);}
	        if(position==7)
	        {
	        	Intent i = new Intent(this,News.class);
	        	startActivity(i);
	        }
	        if(position==5)
	        {Intent i = new Intent(this, map.class);
	        Bundle b = new Bundle(); 
		    b.putInt("value",-1);
		    i.putExtras(b);
	        startActivity(i);}
	        if(position==6)
	        {Intent i = new Intent(this, Checkbox.class);
	        Bundle b=new Bundle();
	        b.putInt("selection", 0);
	        i.putExtras(b);
	        startActivity(i);}
	        if(position==10)
	        {Intent i = new Intent(this, settings.class);
	        Bundle b=new Bundle();
	        b.putInt("selection", 0);
	        i.putExtras(b);
	        startActivity(i);}    
	        
	    }
	 public void preparedb()
	 {
	mDbHelper.open();
	Cursor c= mDbHelper.fetchAllEvents("1");
	if (c.getCount()<1)
	{
	mDbHelper.createEvent("formalities", "clt", 1, "9am-2pm","57",0);
		mDbHelper.createEvent("essence-workshops", "sac", 2, "11","55",0);
		mDbHelper.createEvent("pottery", "sac1", 3, "11","52",0);
		mDbHelper.createEvent("Rock-show", "icsr", 4, "11","58",0);
	}
		 
		 
	 }

	
	
}