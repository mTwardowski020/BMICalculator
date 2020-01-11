package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weight, height;
    TextView resulttext;
    String calculation, BMIresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight=findViewById(R.id.weight);
        height=findViewById(R.id.height);
        resulttext=findViewById(R.id.result);

    }

    public void calculateBMI(View view) {

        String S1 = weight.getText().toString();
        String S2 = height.getText().toString();

        float weightValue = Float.parseFloat(S1);
        float heightValue = Float.parseFloat(S2) / 100;

        float bmi = weightValue / (heightValue * heightValue);

        if (bmi < 16){
            BMIresult = "WYGLODZENIE";
        } else if (bmi < 17){
            BMIresult = "WYCHUDZENIE";
        } else if  (bmi >=17 && bmi < 18.5){
            BMIresult = "NIEDOWAGA";
        } else if  (bmi >=18.5 && bmi < 25){
            BMIresult = "POZADANA MASA CIALA";
        } else if  (bmi >=25 && bmi < 30){
            BMIresult = "NADWAGA";
        } else if  (bmi >=30 && bmi < 35){
            BMIresult = "OTYLOSC I STOPNIA";
        } else if  (bmi >=35 && bmi < 40){
            BMIresult = "OTYLOSC II STOPNIA";
        } else if  (bmi >= 40){
            BMIresult = "OTYLOSC III STOPNIA";
        }

        calculation = "TWOJ WYNIK: \n\n" + bmi + "\n" + BMIresult;

        resulttext.setText(calculation);

    }
}
