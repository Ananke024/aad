package edu.washington.android210;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class MyListCustomAdaptorActivity extends ListActivity {

	
/** Called when the activity is first created. */

	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		String[] names = new String[] { "Linux", "Windows7", "Eclipse", "Suse",
				"Ubuntu", "Solaris", "Android", "iPhone" };
		MySimpleArrayAdapter adapter = new MySimpleArrayAdapter(this, names);
		setListAdapter(adapter);
	}

}