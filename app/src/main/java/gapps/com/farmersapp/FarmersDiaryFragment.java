package gapps.com.farmersapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class FarmersDiaryFragment extends Fragment{

    View myView;
    Button generateDiary;
    EditText day;
    TextView completedTasks;

    public int dayInCycle;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.farmers_diary_layout, container, false);
        day = (EditText) myView.findViewById(R.id.dayEditText);
        generateDiary = (Button) myView.findViewById(R.id.generateDiaryButton);
        completedTasks = (TextView) myView.findViewById(R.id.completedTasks);

        generateDiary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FarmActivities farmActivities = new FarmActivities();

                dayInCycle = Integer.parseInt(day.getText().toString());

                if(dayInCycle<20){
                    //Display stage1 and stage2 as To Do
                    completedTasks.setText("");
                }
                else if(dayInCycle>=20 && dayInCycle<50){
                    completedTasks.setText(Arrays.toString(farmActivities.stage1));
                    //display stage1 as completed and stage2 as To do
                }
                else if(dayInCycle>=50){
                    //Display stage1 and stage2 as completed
                }
            }
        });

        return myView;
    }
}
