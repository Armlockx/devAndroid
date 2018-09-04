package com.example.cnec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.sql.Types.NULL;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void somar(View v){
        //TextView tv = (TextView) findViewById(R.id.tv);
        EditText et = (EditText) findViewById(R.id.numero1);
        EditText pt = (EditText) findViewById(R.id.pt);
        TextView rato = (TextView) findViewById(R.id.pegaRatao);

        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.inicial);

        Float num1 = Float.parseFloat(et.getText().toString());
        Float num2 = Float.parseFloat(pt.getText().toString());

        try{
            if(num1 == NULL){
                if(num2 == NULL){
                    rato.setText(":::NULLSHIT::: ");
                }
                else{
                    float resultado = num1 + num2;
                    rato.setText(num1 + " + " + num2 + " = " + resultado);
                }
            }
            else{
                float resultado = num1 + num2;
                rato.setText(num1 + " + " + num2 + " = " + resultado);
            }

        }catch (Exception e){
            rato.setText(":::Exception::: ");

        }
    }

    public void subtrair(View v){
        TextView tv = (TextView) findViewById(R.id.tv);
        EditText et = (EditText) findViewById(R.id.numero1);
        EditText pt = (EditText) findViewById(R.id.pt);
        TextView rato = (TextView) findViewById(R.id.pegaRatao);

        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.inicial);

        Float num1 = Float.parseFloat(et.getText().toString());
        Float num2 = Float.parseFloat(pt.getText().toString());

        try{
            if(num1 == NULL){
                if(num2 == NULL){
                    rato.setText(":::NULLSHIT::: ");
                }
                else{
                    float resultado = num1 - num2;
                    rato.setText(num1 + " + " + num2 + " = " + resultado);
                }
            }
            else{
                float resultado = num1 - num2;
                rato.setText(num1 + " + " + num2 + " = " + resultado);
            }

        }catch (Exception e){
            rato.setText(":::Exception::: ");

        }
    }

}
