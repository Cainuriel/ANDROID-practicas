package com.example.fernando.sumar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// creamos el metodo que realizará la suma. @param objeto tipo View
    public void aSumar(View view){
        // creamos el objeto EditText, y fundimos las variables envíados de los dos recuadros de texto
        EditText cuadro1=(EditText)findViewById(R.id.num1);
        EditText cuadro2=(EditText)findViewById(R.id.num2);
        // Instanciamos el objeto INTENCIÓN relacionando esta clase con la otra clase JAVA.

        Intent deseo =new Intent(this, Sumar.class);

        // transformamos los objetos EditText en String, para fundirlos de nuevo en INTEGER
        int n1=Integer.parseInt(cuadro1.getText().toString());
        int n2=Integer.parseInt(cuadro2.getText().toString());

        // Con los objetos de la clase INTENT mandamos los datos a la otra actividad "Sumar"
        deseo.putExtra("numero1",n1);
        deseo.putExtra("numero2",n2);
        //activamos la actividad con el objeto INTENT
        startActivity(deseo);

    }
}
