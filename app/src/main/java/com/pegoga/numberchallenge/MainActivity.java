package com.pegoga.numberchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt1;
    private Button btn1;
    private EditText edTxt1;
    private double minimo = 1;
    private double maximo = 50;
    private double aRandom;
    private String resultado = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextView) findViewById(R.id.text1);
        btn1 = (Button) findViewById(R.id.boton1);
        edTxt1 = (EditText) findViewById(R.id.editText1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = edTxt1.getText().toString();
                if(numero.isEmpty()){
                    txt1.setText("Please fill the blank with a number");
                }else{
                    aRandom = randomInteger(minimo, maximo);
                    resultado = String.valueOf((int)aRandom);
                    int c=Integer.parseInt(numero.toString());
                    //Log.i("MYTAGS", numero);
                    if ((int)aRandom == c){
                        txt1.setText("The number generated was the same you input");
                    }else{
                        txt1.setText("The number generated was " + resultado + "\n and your input " + numero);
                        edTxt1.setText("");
                    }
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MYTAGS","onStart method Iniciado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MYTAGS","onResume method Iniciado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MYTAGS","onPause method Iniciado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MYTAGS","onRestart method Iniciado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MYTAGS","onDestroy method Iniciado");
    }

    private double randomInteger(double minimo, double maximo) {
        return Math.floor(Math.random() * (maximo - minimo + 1)) + minimo;
    }
}