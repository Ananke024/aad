
package aad.app.e09;

import aad.app.e09.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class HelloGestureActivity extends Activity {

    private static final String TAG = HelloGestureActivity.class.getSimpleName();

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        Log.d(TAG, "onCreate()");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
    }

        

}
