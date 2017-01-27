package com.example.brendan.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CompoundButton;
import android.widget.CheckBox;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }








    // attempt 3
    // is working as expected oddly

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        CheckBox hstBox = (CheckBox) findViewById(R.id.checkBox2);

        boolean checked = ((CheckBox) view).isChecked();

        // would use switch if needed for multiple boxes

                // if button is pressed
                if (checked){

                    Toast.makeText(this, "checked", Toast.LENGTH_LONG).show();


                }
                // if the HST option isn't enabled
                else{

                    //
                }


        }



    //TODO: To be finished soon checkInput()

    /*
    This method checks if the bill amount entered is a valid number
     */
public boolean checkInput(View view){

    // set to true for now , adjust when writing the method
    boolean isValid ;

    // find the bill input field
    TextView editText = (TextView) findViewById(R.id.editText2);

    //parse input as string
    String input = editText.getText().toString();

    float number;

    try {

        // if parsed as float
        number = Float.parseFloat(input);

        return true;

        // input was not valid
    } catch (NumberFormatException e) {

        Toast.makeText(this, "Not a Valid Input!", Toast.LENGTH_LONG).show();

        return false;

    }

  }

}


/*

need to code the logic for the app now. Below if the order to follow

- onCalculate() : create a listener for this . the method will need the following functionality

 - checks : takes the entered value for the bill amount , checks if HST is enabled (use boolean value), checks what the tip percent is from the spinner( uses it to calculate total)

 - calls : it should pass these values to another method that displays the information (make it as modular as possible)

 -display(): display the results of the calculations




 */

