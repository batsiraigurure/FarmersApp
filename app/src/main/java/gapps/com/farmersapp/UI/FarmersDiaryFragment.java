package gapps.com.farmersapp.UI;

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

import gapps.com.farmersapp.Farming.FarmActivities;
import gapps.com.farmersapp.R;

public class FarmersDiaryFragment extends Fragment{

    View myView;
    Button generateDiary;
    EditText day;
    TextView completedTasks;
    TextView todoTasks;

    public int dayInCycle;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.farmers_diary_layout, container, false);
        day = (EditText) myView.findViewById(R.id.dayEditText);
        generateDiary = (Button) myView.findViewById(R.id.generateDiaryButton);
        completedTasks = (TextView) myView.findViewById(R.id.completedTasks);
        todoTasks = (TextView) myView.findViewById(R.id.todoTasks);

        Toast.makeText(getActivity(), "Enter the number of day in the crop cycle then click VIEW DIARY", Toast.LENGTH_LONG).show();

        generateDiary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FarmActivities farmActivities = new FarmActivities();

                completedTasks.setText("");
                todoTasks.setText("");

                dayInCycle = Integer.parseInt(day.getText().toString());

                if(dayInCycle<20){
                    StringBuilder builder = new StringBuilder();
                    for (String details : farmActivities.allStages) {
                        builder.append(">>" + details + "\n");
                    }
                    todoTasks.setText(builder.toString());
                }
                else if(dayInCycle>=20 && dayInCycle<50){
                    StringBuilder builder = new StringBuilder();
                    for (String details : farmActivities.stage1) {
                        builder.append(">>" + details + "\n");
                    }
                    completedTasks.setText(builder.toString());

                    StringBuilder strBuilder = new StringBuilder();
                    for (String details : farmActivities.stage2) {
                        strBuilder.append(">>" + details + "\n");
                    }
                    todoTasks.setText(strBuilder.toString());
                    /*completedTasks.setText(Arrays.toString(farmActivities.stage1));
                    todoTasks.setText(Arrays.toString(farmActivities.stage2));*/
                }
                else if(dayInCycle>=50){
                    StringBuilder builder = new StringBuilder();
                    for (String details : farmActivities.allStages) {
                        builder.append(">>" + details + "\n");
                    }
                    completedTasks.setText(builder.toString());
                    //completedTasks.setText(Arrays.toString(farmActivities.allStages));
                }
            }
        });

        return myView;
    }
}
