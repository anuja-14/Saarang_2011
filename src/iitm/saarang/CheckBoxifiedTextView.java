package iitm.saarang;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class CheckBoxifiedTextView extends LinearLayout 
{
	private TextView mText;
	
	private CheckBoxifiedText mCheckBoxText;
	private CheckBox mCheckBox;
public CheckBoxifiedTextView(Context context, CheckBoxifiedText aCheckBoxifiedText) 
{
    super(context);



    /* First CheckBox and the Text to the right (horizontal),
     * not above and below (vertical) */
    this.setOrientation(HORIZONTAL);
    mCheckBoxText = aCheckBoxifiedText;
    mCheckBox = new CheckBox(context);
    mCheckBox.setPadding(0, 0, 20, 0); // 5px to the right
    
    /* Set the initial state of the checkbox. */
    mCheckBox.setChecked(aCheckBoxifiedText.isChecked());
    mCheckBox.setTextSize(3);
 
    
    
    /* At first, add the CheckBox to ourself
     * (! we are extending LinearLayout) */
    addView(mCheckBox,  new LinearLayout.LayoutParams(
              LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
    
    mText = new TextView(context);
    mText.setTextColor(Color.BLACK);
    mCheckBox.setOnClickListener( new OnClickListener()
    {
           /**
   	 * Check or uncked the current checkbox!
   	 */
		public void onClick(View v) {
		

			int c=v.getId();
	                            // this cannot works, helppp
	            ListView lv = ((ListView) (v.getParent().getParent()));
	          CheckBoxifiedTextListAdapter cbla=(CheckBoxifiedTextListAdapter) lv.getAdapter();
	                
	          if(lv.getId()==R.id.list1 || lv.getId()==R.id.list3 || lv.getId()==R.id.list4)
	          {for(CheckBoxifiedText cboxtxt:cbla.mItems)
	              if(cboxtxt.mText.equals(mText.getText()))
	        	    cboxtxt.setChecked(!(cboxtxt.isChecked()));
	              else
	            	  cboxtxt.setChecked(false);
	         
	          cbla.notifyDataSetChanged();}
	          else
	          {
	        	  for(CheckBoxifiedText cboxtxt:cbla.mItems)
		              if(cboxtxt.mText.equals(mText.getText()))
		        	    cboxtxt.setChecked(!(cboxtxt.isChecked()));
	        	  cbla.notifyDataSetChanged();
	        	    
	        	}  
	          
	          
		}

    });
    
    
    setText(aCheckBoxifiedText.getText());
    mText.setTextSize(18);
    //mText.setTextColor(2);
    mText.setPadding(0, 0, 15, 0);
    addView(mText, new LinearLayout.LayoutParams(
              LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));




}


public void setText(String words) {
	mText.setText(words);
}
public void setCheckBoxState(Boolean bullet) {
	mCheckBox.setChecked(bullet);
}
public boolean getCheckBoxState() {
	return mCheckBox.isChecked();
}


public void toggleCheckBoxState()

{
    
    setCheckBoxState(getCheckBoxState());

}
}








