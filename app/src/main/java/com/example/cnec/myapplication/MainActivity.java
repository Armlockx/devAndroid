package com.example.cnec.myapplication;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pressButton(View v){
        Log.v("teste1", "mensagem do teste1");
        //clicar no botao "Send" mostra esta menstagem no log
     }

    public void pressButton2(View v){
        EditText et = (EditText) findViewById(R.id.et);
        Log.v("teste666", et.getText().toString());
        //clicar no botao "Send" mostra a mensagem escrita na primeira caixa
    }

    public void pressButton3(View v){
        EditText et = (EditText) findViewById(R.id.et);
        EditText pt = (EditText) findViewById(R.id.pt);
        TextView tv = (TextView) findViewById(R.id.tv);

        tv.setText(et.getText());
        pt.setText(et.getText());

        Log.v("teste666", et.getText().toString());

        //altera senha e mensagem principal com o que foi escrito na primeira caixa
    }

    public void pressButton4(View v){
        EditText et = (EditText) findViewById(R.id.et);
        EditText pt = (EditText) findViewById(R.id.pt);
        TextView tv = (TextView) findViewById(R.id.tv);
        TextView rato = (TextView) findViewById(R.id.pegaRatao);

        rato.setText(et.getText());
        //pt.setText(et.getText());

        Log.v("teste666", et.getText().toString());

        //altera o que for escrito na primeira caixa, mas em outro texto
    }

    public void pressButton5(View v){
        TextView tv = (TextView) findViewById(R.id.tv);
        EditText et = (EditText) findViewById(R.id.et);
        EditText pt = (EditText) findViewById(R.id.pt);
        TextView rato = (TextView) findViewById(R.id.pegaRatao);

        String nome = et.getText().toString();
        String sobrenome = pt.getText().toString();

        tv.setText(nome + " " + sobrenome);

        Log.v("teste666!!", nome + " " + sobrenome);
        Log.i("teste666", nome + " " + sobrenome);
        rato.setText(nome + " " + sobrenome);

        //altera o que for escrito na primeira caixa, mas em outro texto
    }

    public void pressButton6(View v){
        TextView tv = (TextView) findViewById(R.id.tv);
        EditText et = (EditText) findViewById(R.id.et);
        EditText pt = (EditText) findViewById(R.id.pt);
        TextView rato = (TextView) findViewById(R.id.pegaRatao);

        //String nome = et.getText().toString();
        int nome = Integer.parseInt(et.getText().toString());
        int sobrenome = Integer.parseInt(pt.getText().toString());

        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.inicial);

        //cl.setBackgroundColor(Color.parseColor("#BBFF00"));

        if(nome > sobrenome){
            tv.setText("Nome > sobrenome : " + nome);
            cl.setBackgroundColor(Color.GREEN);
            //rato.setText(nome + " " + sobrenome);
        }
        else{
            tv.setText("Sobrenome > nome : " + sobrenome);
            //cl.setBackgroundColor(Color.parseColor(""));
            cl.setBackgroundColor(Color.WHITE);
        }
    }
}