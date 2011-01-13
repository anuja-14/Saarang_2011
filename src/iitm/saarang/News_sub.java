package iitm.saarang;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.TextView;

public class News_sub extends Activity{
	private NewsAdapter mDbhelper;
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.body);
	        Bundle extras = getIntent().getExtras();
	        long id=extras.getLong("id");
	        mDbhelper=new NewsAdapter(this);
	        mDbhelper.open();
	     Cursor c = mDbhelper.fetchNews(id);
	        startManagingCursor(c);
	        String title=c.getString(1);
	        String desc=c.getString(2);
	        Button t=(Button)findViewById(R.id.text5);
	        t.setText(title);
	        TextView u=(TextView)findViewById(R.id.text6);
	        u.setText(desc+"");
	        u.setMovementMethod(new ScrollingMovementMethod());
	        
	 }

}
