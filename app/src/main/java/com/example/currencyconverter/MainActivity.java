package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText enter;
    TextView res;
    Button converter;
    public void converter(View view){
        double input = Double.parseDouble(enter.getText().toString());

        double result = input*79.40;

        res.setText(String.valueOf(result));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         enter = (EditText) findViewById(R.id.enter);
         res = (TextView) findViewById(R.id.res);
         converter = (Button) findViewById(R.id.converter);
    }
}