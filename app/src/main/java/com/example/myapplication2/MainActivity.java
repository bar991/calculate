package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.StrictMath.sqrt;

public class MainActivity extends AppCompatActivity {
TextView x1;
    TextView x2;
    EditText a;
    EditText b;
    EditText c;
double a1, b2, c3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x1=findViewById(R.id.x1);
        x2=findViewById(R.id.x2);
        a=findViewById(R.id.a);


        b=findViewById(R.id.b);

        c=findViewById(R.id.c);


    }

    public void Calculate(View view) {
        a1 = Double.parseDouble(a.getText().toString());
        b2 = Double.parseDouble(b.getText().toString());
        c3 = Double.parseDouble(c.getText().toString());

        x1.setText((-b2 + sqrt(b2 * b2 - 4 * a1 * c3)) / 2 * a1 + "");
        x2.setText((-b2 - sqrt(b2 * b2 - 4 * a1 * c3)) / 2 * a1+ "");
    }
}
