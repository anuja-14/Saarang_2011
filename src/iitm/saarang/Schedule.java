package iitm.saarang;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
public class Schedule extends ListActivity {

private String[] DayList={"Day1","Day2","Day3","Day4"  };    
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) 
{
super.onCreate(savedInstanceState);
setContentView(R.layout.side);
Button t=(Button)findViewById(R.id.text2);
t.setText("Events");
setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem, DayList));
}

@Override
protected void onListItemClick(ListView l, View v, int position, long id) {
    super.onListItemClick(l, v, position, id);
    Intent i = new Intent(this,DaySub.class);
    Bundle b = new Bundle(); 
    b.putString("value",DayList[position]);
    i.putExtras(b);
    startActivity(i);
}


}
