package aad.app.c11;

import android.app.ListActivity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.SimpleCursorAdapter;

public class HelloContentActivity extends ListActivity {

    //private static final String TAG = HelloContentActivity.class.getSimpleName();
    
    private SimpleCursorAdapter mAdapter;
    
    public static final String[] PROJECTION = new String[] {
       "_id",
       "name", 
       "isbn"};
        
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        
        ContentResolver cr = this.getContentResolver();               
        
        Cursor c = cr.query(
                        Uri.parse("content://aad.app.c25.providers.BooksContentProvider/books"), 
                        PROJECTION, 
                        null, 
                        null, 
                        null);
        
        // Setup our mapping from the cursor result to the display field
        String[] from = { "name", "isbn" };
        int[] to = { android.R.id.text1, android.R.id.text2 };
        
        // Create a simple cursor adapter
        mAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_2, c, from, to);

        this.getListView().setAdapter(mAdapter);
    }

}