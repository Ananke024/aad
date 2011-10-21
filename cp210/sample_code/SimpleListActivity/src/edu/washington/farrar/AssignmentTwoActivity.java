package edu.washington.farrar;

import java.util.ArrayList;
import java.util.HashMap;


import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;


public class AssignmentTwoActivity extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        setContentView(R.layout.main);
        //example of using log
        Log.v("mytag","content view was just set");
        
        //some sample data
       String[] data_array = {"Mail letter", "Buy bananas", "Groom dog"};
       
       
       setListAdapter(new ArrayAdapter<String>(this,                           
    		   android.R.layout.simple_list_item_1 , data_array));                
       //or using a custom list item
       //R.layout.scotts_custom_list_item
      
        
    }
    
    
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		// Get the item that was clicked
		Object o = this.getListAdapter().getItem(position);
		String keyword = o.toString();
		//display a toast
		Toast.makeText(this, "You selected: " + keyword, Toast.LENGTH_SHORT).show();
		
	}
    
    
}