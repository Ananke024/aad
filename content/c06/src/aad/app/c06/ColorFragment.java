package aad.app.c06;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ColorFragment extends Fragment {

    private int mColor = 0; // Default to black
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment and set the color
        View v = inflater.inflate(R.layout.color_layout, container, false);
        setColor(mColor);
        return v;
    }
    
    public void setColor(int color) {        
        
        mColor = color;
        this.getView().setBackgroundColor(mColor);
    }

}
