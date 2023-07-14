package com.sveri.spinnerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] dishes = {"None","Pav Bhaji","Vada Pav","Poha","Chicken 65",
            "mutton chaap","Biriyani","Dahi Balle","Paneer Tikka Masala","Idli Sambhar"};
    private ArrayAdapter<String> adapter;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialise
        spinner = findViewById(R.id.spinnerDishes);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,dishes);
        spinner.setAdapter(adapter);

        //attach handlers
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "My favourite Dish is :"+dishes[position],
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}