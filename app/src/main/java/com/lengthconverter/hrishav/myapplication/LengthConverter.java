package com.lengthconverter.hrishav.myapplication;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class LengthConverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_converter);

        final TextView temp=(TextView)findViewById(R.id.resultTextView);

        final Button conn=(Button)findViewById(R.id.conBtn);

        final EditText editText3=(EditText)findViewById(R.id.editText3);

        final Spinner thisSpinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<String>(LengthConverter.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Convert));

        //System.out.print(thisSpinner.toString());

        myArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        thisSpinner.setAdapter(myArrayAdapter);

        //thisSpinner.setOnItemClickListener((AdapterView.OnItemClickListener) this);

        conn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = thisSpinner.getSelectedItemPosition();

                System.out.print("The value is :" + a);
                double kika = new Double(editText3.getText().toString());
                if(a == 0)

                    kika = UnitConverter.centimeterToMeter(kika);
                else
                    kika = UnitConverter.meterToCentimeter(kika);

                temp.setText(new Double(kika).toString());
                /*
                double kika = new Double(editText3.getText().toString());
                if ()
                    kika = UnitConverter.centimeterToMeter(kika);
                else
                    kika = UnitConverter.meterToCentimeter(kika);
                temp.setText(new Double(kika).toString());
                */

         }
        });
    }
}
