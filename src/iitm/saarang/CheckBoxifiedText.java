package iitm.saarang;

import android.graphics.drawable.Drawable;
import android.view.View.OnClickListener;

public class CheckBoxifiedText implements Comparable<CheckBoxifiedText>{
   
     public String mText = "";
     private boolean mChecked;    
     public CheckBoxifiedText(String text, boolean checked) {
    	 /* constructor */ 
          mText = text;
          mChecked = checked;
     }
     public boolean isChecked() {
 		return mChecked;
 	}
 	
 	public void setChecked(boolean selectable) {
 		mChecked = selectable;
 	}
 	
 	public String getText() {
 		return mText;
 	}
 	
 	public void setText(String text) {
 		mText = text;
 	}
 	

     
     /** Make IconifiedText comparable by its name */
 	public int compareTo(CheckBoxifiedText other) {
 		if(this.mText != null)
 			return this.mText.compareTo(other.getText()); 
 		else 
 			throw new IllegalArgumentException();
 	}
	
}
