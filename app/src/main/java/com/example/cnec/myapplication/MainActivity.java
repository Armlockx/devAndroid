package com.example.cnec.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.sql.Types.NULL;


public class MainActivity extends AppCompatActivity {

    Button calculadora;
    Button inss;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculadora = (Button) findViewById(R.id.calc);
        inss = (Button) findViewById(R.id.inss);

        calculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentCalc = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intentCalc);
            }
        });

        inss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentInss = new Intent(MainActivity.this, Main3Activity.class );
                startActivity(intentInss);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.iInss:
                Toast.makeText(getApplicationContext(), "INSS", Toast.LENGTH_LONG).show();
                Intent intentCalc = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intentCalc);
                break;
            case R.id.iCalc:
                Toast.makeText(getApplicationContext(), "Sair", Toast.LENGTH_LONG).show();
                Intent intentInss = new Intent(MainActivity.this, Main3Activity.class );
                startActivity(intentInss);
                break;
        }
        return true;
    }




    public void pressButton(View v){
        Log.v("teste1", "mensagem do teste1");
        //clicar no botao "Send" mostra esta menstagem no log
    }

    public void pressButton2(View v){
        EditText et = (EditText) findViewById(R.id.numero1);
        Log.v("teste666", et.getText().toString());
        //clicar no botao "Send" mostra a mensagem escrita na primeira caixa
    }

    public void pressButton3(View v){
        EditText et = (EditText) findViewById(R.id.numero1);
        EditText pt = (EditText) findViewById(R.id.pt);
        TextView tv = (TextView) findViewById(R.id.tv);

        tv.setText(et.getText());
        pt.setText(et.getText());

        Log.v("teste666", et.getText().toString());

        //altera senha e mensagem principal com o que foi escrito na primeira caixa
    }

    public void pressButton4(View v){
        EditText et = (EditText) findViewById(R.id.numero1);
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
        EditText et = (EditText) findViewById(R.id.numero1);
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
        EditText et = (EditText) findViewById(R.id.numero1);
        EditText pt = (EditText) findViewById(R.id.pt);
        TextView rato = (TextView) findViewById(R.id.pegaRatao);

        //String nome = et.getText().toString();
        int nome = Integer.parseInt(et.getText().toString());
        int sobrenome = Integer.parseInt(pt.getText().toString());

        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.inicial);

        //cl.setBackgroundColor(Color.parseColor("#BBFF00"));

        if(nome > sobrenome){
            rato.setText("Nome > sobrenome : " + nome);
            cl.setBackgroundColor(Color.GREEN);
            //rato.setText(nome + " " + sobrenome);
        }
        else{
            if(nome == sobrenome){
                rato.setText("Igual, nome: " + nome + "                           sobrenome: " + sobrenome);
                cl.setBackgroundColor(Color.parseColor("#ffff11"));
            }else{
                rato.setText("Sobrenome > nome : " + sobrenome);
                //cl.setBackgroundColor(Color.parseColor(""));
                cl.setBackgroundColor(Color.WHITE);
            }
        }
    }

    public void pressButton7(View v){
        TextView tv = (TextView) findViewById(R.id.tv);
        EditText et = (EditText) findViewById(R.id.numero1);
        EditText pt = (EditText) findViewById(R.id.pt);
        TextView rato = (TextView) findViewById(R.id.pegaRatao);

        int nome = Integer.parseInt(et.getText().toString());
        int sobrenome = Integer.parseInt(pt.getText().toString());

        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.inicial);

        int resultado = nome + sobrenome;

        if(nome == NULL){
            if(sobrenome == NULL){
                rato.setText(":::NULLSHIT::: ");
            }
            else{
                rato.setText("Valor: " + resultado);
            }
        }
        else{
            rato.setText("Valor: " + resultado);
        }
    }

    public void pressButton8(View v){
        TextView tv = (TextView) findViewById(R.id.tv);
        EditText et = (EditText) findViewById(R.id.numero1);
        EditText pt = (EditText) findViewById(R.id.pt);
        TextView rato = (TextView) findViewById(R.id.pegaRatao);

        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.inicial);

        String nome = et.getText().toString();

        if(nome.length() > 0){
            rato.setText("Tamanho do nome: " + nome.length());
        }
        else{
            rato.setText("Nome NULL");
        }

    }

    public void pressButton9(View v){
        TextView tv = (TextView) findViewById(R.id.tv);
        EditText et = (EditText) findViewById(R.id.numero1);
        EditText pt = (EditText) findViewById(R.id.pt);
        TextView rato = (TextView) findViewById(R.id.pegaRatao);

        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.inicial);

        String nome = et.getText().toString();

        if(nome.length() > 0){
            rato.setText("Tamanho do nome: " + nome.length());
            int x;
            for(x = 0; x < 10; x++){
                Log.i("teste666", " " + nome + ", " + x);
            }
        }
        else{
            rato.setText("Nome NULL");
        }
    }

    public void pressButton10(View v){
        TextView tv = (TextView) findViewById(R.id.tv);
        EditText et = (EditText) findViewById(R.id.numero1);
        EditText pt = (EditText) findViewById(R.id.pt);
        TextView rato = (TextView) findViewById(R.id.pegaRatao);

        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.inicial);

        Float salario = Float.parseFloat(et.getText().toString());

        try{
            if (salario <= 600.00){
                rato.setText("Isento;");
                //setContentView(R.layout.activity_main);
            }
            else{
                if(salario <= 1200.00){
                    rato.setText("20% de Desconto: " + salario*0.20);
                }
                else{
                    if(salario <= 2000.00){
                        rato.setText("35% de Desconto: " + salario*0.35);
                    }
                    else{
                        if(salario > 2000.00){
                            rato.setText("40% de Desconto: " + salario*0.40);
                        }
                    }
                }
            }
        }catch (Exception e){
            rato.setText(":::ERRO BIXO:::");
        }
    }

    /////////////////////////////////////////////////////////////
    public void somar(View v){
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

    /////////////////////////////////////////////////////////////
}