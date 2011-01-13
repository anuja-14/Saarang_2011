package iitm.saarang;


import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/** @author Steven Osborn - <!-- m --><a class="postlink" href="http://steven.bitsetters.com">http://steven.bitsetters.com</a><!-- m --> */
public class CheckBoxifiedTextListAdapter extends BaseAdapter {

	/** Remember our context so we can use it when constructing views. */
	private Context mContext;

	public List<CheckBoxifiedText> mItems = new ArrayList<CheckBoxifiedText>();

	public CheckBoxifiedTextListAdapter(Context context) {
		mContext = context;
	}

	public void addItem(CheckBoxifiedText it) { mItems.add(it); }

	public void setListItems(List<CheckBoxifiedText> lit) { mItems = lit; }

	/** @return The number of items in the */
	public int getCount() { return mItems.size(); }

	public Object getItem(int position) { return mItems.get(position); }

	public boolean areAllItemsSelectable() { return false; }

	public boolean isSelectable(int position) { 
		
			return mItems.get(position).isChecked();
		
	}


	/** Use the array index as a unique id. */
	public long getItemId(int position) {
		return position;
	}
	
	 public View getView(int position, View convertView, ViewGroup parent){
	
	          CheckBoxifiedTextView btv;

	          if (convertView == null) {
	
	               btv = new CheckBoxifiedTextView(mContext, mItems.get(position));
	
	          } else { // Reuse/Overwrite the View passed
	
	               // We are assuming(!) that it is castable!
	
	                   CheckBoxifiedText src = mItems.get(position);
	
	               btv = (CheckBoxifiedTextView) convertView;
	
	               btv.setCheckBoxState(src.isChecked());
	
	               btv = (CheckBoxifiedTextView) convertView;
	
	               btv.setText(mItems.get(position).getText());
	
	          }
	
	          return btv;
	
	     }

     public void deselectAll(){
         for(CheckBoxifiedText cboxtxt: mItems)
              cboxtxt.setChecked(false);
        
         
     }
}