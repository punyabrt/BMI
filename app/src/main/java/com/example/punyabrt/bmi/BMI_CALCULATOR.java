package com.example.punyabrt.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BMI_CALCULATOR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi__calculator);

        final Button start = findViewById(R.id.START_button);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Hello";
                Toast t = Toast.makeText(BMI_CALCULATOR.this, "Hello", Toast.LENGTH_SHORT);
                t.show();

                Intent i = new Intent(BMI_CALCULATOR.this,HOME_BMI.class);
                startActivity(i);
            }
        });
        Button exit = findViewById(R.id.EXIT_button);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
