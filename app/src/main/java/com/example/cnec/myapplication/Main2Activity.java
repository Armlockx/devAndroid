package com.example.cnec.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;

import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.sql.Types.NULL;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
                                                                    //Padrão para ativar a primeira activity
        ConstraintLayout inicial2 = findViewById(R.id.inicial2);
        registerForContextMenu(inicial2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_calc, menu);    //Cria toaster usando "menu_principal"
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_calc, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){          //Necessário para trocar de activty
        switch (item.getItemId()){                                //através do menu "..." usando SWITCH
            case R.id.iCalc:
                Toast.makeText(getApplicationContext(), "Calculadora", Toast.LENGTH_LONG).show();
                Intent intentCalc = new Intent(Main2Activity.this, Main2Activity.class);
                startActivity(intentCalc);
                break;
            case R.id.iInss:
                Toast.makeText(getApplicationContext(), "INSS", Toast.LENGTH_LONG).show();
                Intent intentInss = new Intent(Main2Activity.this, Main3Activity.class );
                startActivity(intentInss);
                break;
            case R.id.iVoltar:
                Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_LONG).show();
                Intent intentVoltar = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intentVoltar);
                break;
        }
        return true;
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
