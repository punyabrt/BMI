package com.example.punyabrt.bmi;

import android.content.DialogInterface;
import android.nfc.Tag;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HOME_BMI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__bmi);

        final Button calculatorButton =findViewById(R.id.CALCULATOR_button);
        calculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText HeightEditText = findViewById(R.id.Height_editText);
                EditText WeightEditText = findViewById(R.id.Weight_editText);

                int h = Integer.parseInt(HeightEditText.getText().toString());
                int w = Integer.parseInt(WeightEditText.getText().toString());
                float BMI = calBmi(h,w);
                String printText = "";
                if(BMI<18.5){
                    printText = "ผอมมาก";
                }
                else if(BMI<25){
                    printText = "ปกติ";
                }
                else if(BMI<30){
                    printText = "ผอม";
                }
                else {
                    printText = "อ้วนเกิน";
                }
                Toast t = Toast.makeText(HOME_BMI.this,printText,Toast.LENGTH_SHORT);
                t.show();

                AlertDialog.Builder dialog= new AlertDialog.Builder(HOME_BMI.this);
                dialog.setTitle("Result");
                dialog.setMessage(printText);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.setNegativeButton("No",null);
                dialog.setCancelable(false);
                dialog.show();
            }
        });
    }
    private float calBmi(int h, int w){
        //bmi = kg/m*2
        float height = h / 100f;
        float bmi = w / (height + height);
        return  bmi;

    }
}
