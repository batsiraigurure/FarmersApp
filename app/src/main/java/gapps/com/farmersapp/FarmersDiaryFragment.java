package gapps.com.farmersapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FarmersDiaryFragment extends Fragment{

    View myView;

    public int dayInCycle;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.farmers_diary_layout, container, false);

        /* convert what is in edittext to integer
        dayInCycle = (myView.findViewById(R.id.dayEditText).toString());
        */

        return myView;
    }
}
