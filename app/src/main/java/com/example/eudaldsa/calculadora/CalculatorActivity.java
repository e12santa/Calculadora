package com.example.eudaldsa.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    //Model
    private String num = ""; //Aquí està guardat el numero actual!
    private String numAnt = "";
    private char operacio = ' ';

    //
    private TextView numView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        numView = findViewById(R.id.numView);
        numView.setText(num);
    }

    public void onClickDigit(View view) {
        Button b = (Button)view;
        num += b.getText().toString();
        numView.setText(num);
    }

    public void onClickOperator(View view) {
        Button b = (Button)view;
        numAnt = num;
        num = "";
        operacio = b.getText().toString().charAt(0);
        numView.setText(num);
    }

    public void onClickEquals(View view) {
        double x = Double.valueOf(num);
        double xant = Double.valueOf(numAnt);

        switch (operacio) {
            case '+':
                num = Double.toString(xant+x);
                break;
            case '-':
                num = Double.toString(xant-x);
                break;
            case '*':
                num = Double.toString(xant*x);
                break;
            case '/':
                num = Double.toString(xant/x);
                break;
        }
        numView.setText(num);
    }
}
