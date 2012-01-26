package aad.app.c05;

import aad.app.c05.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class HelloViewActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ((CustomButton) this.findViewById(R.id.customButton1)).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                // An Empty Click Handler to register for the playSoundEffect override
                
            }});
    
        ((Button) this.findViewById(R.id.animatedButton)).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(HelloViewActivity.this, R.anim.rotate);
                v.setAnimation(animation);
                
            }
            
        });
    }
}