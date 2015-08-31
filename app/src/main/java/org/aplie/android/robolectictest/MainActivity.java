package org.aplie.android.robolectictest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Calculadora calculadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etValor1 = (EditText) findViewById(R.id.etFistNumber);
        final EditText etValor2 = (EditText) findViewById(R.id.etSecondNumber);
        final TextView tvResult = (TextView) findViewById(R.id.tvResult);
        Button suma = (Button) findViewById(R.id.bSumar);
        Button resta = (Button) findViewById(R.id.bRestar);
        Button multi = (Button) findViewById(R.id.bMultiplicar);
        Button dividir = (Button) findViewById(R.id.bDividir);

        calculadora = new Calculadora();

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(comprobarInputNumbers(etValor1, etValor2)){
                    int valor1 = Integer.parseInt(etValor1.getText().toString());
                    int valor2 = Integer.parseInt(etValor2.getText().toString());

                    String result = calculadora.suma(valor1, valor2);
                    tvResult.setText("Resultado: "+result);
                }else{
                    tvResult.setText("Resultado:");
                }
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(comprobarInputNumbers(etValor1, etValor2)){
                    int valor1 = Integer.parseInt(etValor1.getText().toString());
                    int valor2 = Integer.parseInt(etValor2.getText().toString());

                    String result = calculadora.resta(valor1, valor2);
                    tvResult.setText("Resultado: "+result);
                }else{
                    tvResult.setText("Resultado:");
                }
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(comprobarInputNumbers(etValor1, etValor2)){
                    int valor1 = Integer.parseInt(etValor1.getText().toString());
                    int valor2 = Integer.parseInt(etValor2.getText().toString());

                    String result = calculadora.multiplicar(valor1, valor2);
                    tvResult.setText("Resultado: "+result);
                }else{
                    tvResult.setText("Resultado:");
                }
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(comprobarInputNumbers(etValor1,etValor2)){
                    int valor1 = Integer.parseInt(etValor1.getText().toString());
                    int valor2 = Integer.parseInt(etValor2.getText().toString());

                    String result = calculadora.dividir(valor1, valor2);
                    tvResult.setText("Resultado: "+result);
                }else{
                    tvResult.setText("Resultado:");
                }
            }
        });
    }

    private boolean comprobarInputNumbers(EditText etValor1, EditText etValor2) {
        if(editTextHasData(etValor1) && editTextHasData(etValor2)){
            return true;
        }
        return false;
    }

    private boolean editTextHasData(EditText et) {
        String text = et.getText().toString();
        if(text.length() >0){
            return true;
        }
        return false;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
