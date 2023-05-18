package sg.edu.rp.c346.id21037598.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    TextView summaryOutput;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        summaryOutput = findViewById(R.id.summaryOutput);
        backBtn = findViewById(R.id.backBtn2);

        String moduleNames = "";
        int totalCredits = 0;
        String totalCreditsString;

        // Get array through serializable
        Module[] moduleArr = (Module[]) getIntent().getSerializableExtra("array");

        // Initialize year and semester (not sure of a better way to do this)
        String academicYear = Integer.toString(moduleArr[0].getYear());
        String semester = Integer.toString(moduleArr[0].getSemester());

        // For length of array, get total credits, and add module code and name to string
        for (int i = 0; i < moduleArr.length; i++) {
            totalCredits += moduleArr[i].getCredit();
            moduleNames += (moduleArr[i].getCode() + " ");
            moduleNames += (moduleArr[i].getName() + "\n");
        }

        totalCreditsString = Integer.toString(totalCredits);

        // Display output
        summaryOutput.setText("Academic Year: " + academicYear
                + "\nSemester: " + semester
                + "\nTotal modular credits: " + totalCreditsString
                + "\nModules:\n" + moduleNames);

        // On click, goes back to main page
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SummaryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}