package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nome;

    private EditText sexo;

    private TextView idade;

    private EditText automovel;

    private TextView value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("OnCreate", "Entrou no método Oncreate");
        setContentView(R.layout.activity_main);
        nome = (EditText) findViewById(R.id.textTexto1);
        sexo = (EditText) findViewById(R.id.textTexto2);

        idade = (EditText) findViewById(R.id.textNumber2);

        automovel = (EditText) findViewById(R.id.textNumber1);

        value = (TextView) findViewById(R.id.textShow);
    }


     public void buttonCopiarClick(View view){
         String idadeValue = idade.getText().toString();
         String sexoValue = sexo.getText().toString();
         String automovelValue = automovel.getText().toString();


        if(Integer.parseInt(idadeValue) > 35 && sexoValue.equals("masculino") || sexoValue.equals("masculino ")){
            int apolice = Integer.parseInt(automovelValue) * 10/100;
            value.setText(Integer.toString(apolice));
        }

         if(Integer.parseInt(idadeValue) < 35 && sexoValue.equals("masculino") || sexoValue.equals("masculino ")){
             int apolice = Integer.parseInt(automovelValue) * 5/100;
             value.setText(Integer.toString(apolice));
         }

         if(sexoValue.equals("feminino") || sexoValue.equals("feminino ")){
             int apolice = Integer.parseInt(automovelValue) * 2/100;
             value.setText(Integer.toString(apolice));
         }
     }

     /*
     public void buttonCopiarClick(View view){
        texto2.setText(texto1.getText().toString());
            Toast.makeText(this, "Sucesso!", Toast.LENGTH_SHORT).show();
        }
    */


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("OnStart", "Entrou no método OnStart");
    }

    @Override
    protected void onResume() {
        Log.i("OnResume", "Entrou no método OnResume");
        super.onResume();
    }


}