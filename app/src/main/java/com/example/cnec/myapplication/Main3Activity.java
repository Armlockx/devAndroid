package com.example.cnec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.sql.Types.NULL;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ConstraintLayout inicial3 = findViewById(R.id.inicial3);
        registerForContextMenu(inicial3);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_inss, menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_inss, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){          //Necessário para trocar de activty
        switch (item.getItemId()){                                //através do menu "..." usando SWITCH
            case R.id.iCalc:
                Toast.makeText(getApplicationContext(), "Calculadora", Toast.LENGTH_LONG).show();
                Intent intentCalc = new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(intentCalc);
                break;
            case R.id.iInss:
                Toast.makeText(getApplicationContext(), "INSS", Toast.LENGTH_LONG).show();
                Intent intentInss = new Intent(Main3Activity.this, Main3Activity.class );
                startActivity(intentInss);
                break;
            case R.id.iVoltar:
                Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_LONG).show();
                Intent intentVoltar = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(intentVoltar);
                break;
        }
        return true;
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
