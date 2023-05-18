package sg.edu.rp.c346.id21037598.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements Serializable {

    // Initialize variables
    TextView module1, module2, module3, module4, module5;
    Button summaryBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link variables to xml elements
        module1 = findViewById(R.id.module1);
        module2 = findViewById(R.id.module2);
        module3 = findViewById(R.id.module3);
        module4 = findViewById(R.id.module4);
        module5 = findViewById(R.id.module5);
        summaryBtn = findViewById(R.id.summaryButton);

        // Create module objects, imported from Module class
        Module c203 = new Module("C203", "Web Application Development in PHP", "W65D");
        Module c206 = new Module("C206", "Software Development Process", "W65D");
        Module c218 = new Module("C218", "UI/UX Design for Applications", "W65D");
        Module c235 = new Module("C235", "IT Security and Management", "W65D");
        Module c346 = new Module("C346", "Mobile App Development", "E63A");

        // Create array for module objects
        Module[] moduleArr = new Module[5];

        // Add objects into array manually
        moduleArr[0] = c203;
        moduleArr[1] = c206;
        moduleArr[2] = c218;
        moduleArr[3] = c235;
        moduleArr[4] = c346;

        // On click, display content in SecondActivity class
        module1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("module", c203);
                startActivity(intent);
            }
        });

        module2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("module", c206);
                startActivity(intent);
            }
        });

        module3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("module", c218);
                startActivity(intent);
            }
        });

        module4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("module", c235);
                startActivity(intent);
            }
        });

        module5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("module", c346);
                startActivity(intent);
            }
        });

        summaryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean summaryBtnClicked = true;
                Intent intent = new Intent(MainActivity.this, SummaryActivity.class);
                intent.putExtra("summaryBtnClicked", summaryBtnClicked);
                intent.putExtra("array", moduleArr);
                startActivity(intent);
            }
        });
    }
}