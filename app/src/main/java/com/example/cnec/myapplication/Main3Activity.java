package com.example.cnec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import static java.sql.Types.NULL;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void pressButtonAct3(View v){
        //TextView tv = (TextView) findViewById(R.id.tv);
        //EditText pt = (EditText) findViewById(R.id.pt);

        EditText numero7 = (EditText) findViewById(R.id.numero7);
        TextView avistar = (TextView) findViewById(R.id.avistar);


        //ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.inicial);
        Float salario = Float.parseFloat(numero7.getText().toString());

        try{
            if (salario <= 600.00){
                avistar.setText("Isento;");
                //setContentView(R.layout.activity_main);
            }
            else{
                if(salario <= 1200.00){
                    avistar.setText("20% de Desconto: " + salario*0.20);
                }
                else{
                    if(salario <= 2000.00){
                        avistar.setText("35% de Desconto: " + salario*0.35);
                    }
                    else{
                        if(salario > 2000.00){
                            avistar.setText("Sei lá bixo paga o inss lá, meu");
                        }
                    }
                }
            }
        }catch (Exception e){
            avistar.setText(":::ERRO BIXO:::");
        }
    }
}
