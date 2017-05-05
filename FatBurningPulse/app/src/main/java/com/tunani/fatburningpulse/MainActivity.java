package com.tunani.fatburningpulse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View button){

        int age = validateAge();
        if(age == 0)
            return;
        int max = validateGender();

        TextView result = (TextView) findViewById(R.id.textResult);
        result.setText(Math.round((max-age)*0.65)+" - "+Math.round((max-age)*0.75)+" "+getString(R.string.bpm));
    }

    int validateAge(){
        int result = 0;
        EditText age_field = (EditText) findViewById(R.id.editTextAge);
        if(!age_field.getText().toString().equals(""))
            result = Integer.parseInt(age_field.getText().toString());
        return result;
    }

    int validateGender(){
        int result = 226;
        RadioButton male_radio = (RadioButton) findViewById(R.id.radioButtonMale);
        if(male_radio.isChecked())
            result = 220;
        return result;
    }



}
