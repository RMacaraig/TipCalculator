package com.example.brendan.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

//TODO: spinner has been populated with entries
/*

need to code the ogic for the app now. Below if the order to follow

- onCalculate() : create a listener for this . the method will need the following functionallity

 - checks : takes the entered value for the bill amount , checks if HST is enabled (use boolean value), checks what the tip percent is from the spinner( uses it to calculate total)

 - calls : it should pass these vaues to another method that displays the information (make it as modular as possible)

 -display(): display the results of the calculations




 */

