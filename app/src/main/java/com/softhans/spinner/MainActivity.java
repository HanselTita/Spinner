package com.softhans.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * 1. Create a spinner on layout and give an id
 * 2. initiate it in the activity...mSpinner
 * 3. Go to res/values/strings and create a string array and fit the values you wish to have in your spinner
 * 4. Back your activity set and arrayadapter for the string array.
 * 5. Make it a drop down list
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //intiating spinner
        Spinner mSpinner= findViewById(R.id.spinnerID);


        //setting ArrayAdapter
        ArrayAdapter<String>mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.names));

        //code to get and display spinner as drop down  list
        mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(mAdapter);
    }
}
