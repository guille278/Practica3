package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.gNum1);
        num2 = findViewById(R.id.gNum2);

    }

    public void bAceptar(View view) {
        Toast.makeText(getApplicationContext(), "Num1 + Num2: " + operacion(), Toast.LENGTH_SHORT).show();
    }

    public double operacion() {
        return Float.parseFloat(num1.getText().toString()) + Float.parseFloat(num2.getText().toString());
    }
}