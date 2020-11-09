package com.example.a003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    EditText tempera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tempera = (EditText)findViewById(R.id.tempera);
        Button submit = (Button)findViewById(R.id.button1);

        submit.setOnClickListener(new Button.OnClickListener() {


            public void onClick(View arg0) {
                Float F = Float.parseFloat(tempera.getEditableText().toString());
                TextView result = (TextView)findViewById(R.id.textView04);
                F=F*9/5+32;

                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(2);
                result.setText(String.valueOf(F));

            }
        });
    }
}