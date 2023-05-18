package sg.edu.rp.c346.id21037598.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // Initialize variables
    TextView moduleOutput;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Link xml element to variables
        moduleOutput = findViewById(R.id.moduleOutput);
        backBtn = findViewById(R.id.backButton);

        // Get module object upon click of TextView in MainActivity class
        Module module = (Module) getIntent().getSerializableExtra("module");

        // Convert values into strings and store
        String moduleCode = module.getCode();
        String moduleName = module.getName();
        String moduleYear = Integer.toString(module.getYear());
        String moduleSemester = Integer.toString(module.getSemester());
        String moduleCredit = Integer.toString(module.getCredit());
        String moduleVenue = module.getVenue();

        // Display output
        moduleOutput.setText("Module Code: " + moduleCode
        + "\nModule Name: " + moduleName
        + "\nAcademic Year: " + moduleYear
        + "\nSemester: " + moduleSemester
        + "\nModule Credit: " + moduleCredit
        + "\nVenue: " + moduleVenue);

        // On click, goes back to main page
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}