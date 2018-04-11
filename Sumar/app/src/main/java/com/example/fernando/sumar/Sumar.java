package com.example.fernando.sumar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// heredamos en esta clase creada para sumar, la superclase Activity
public class Sumar extends Activity {

    // Creamos el metodo onCreate
    public void onCreate(Bundle saveInstanceState){
            // la relacionamos con su correspondiente layout
            super.onCreate(saveInstanceState);
            setContentView(R.layout.resultado);
            // recibimos el paquete datos, objeto BUNDLE enviado desde la otra layout
            Bundle datos=getIntent().getExtras();
            int num1=datos.getInt("numero1");
            int num2=datos.getInt("numero2");
            // finalmente sumamos.
            int resultado=num1+num2;

            //Imprimimos en pantalla, no antes sin fundir a Textview
            TextView valor_resultado=(TextView)findViewById(R.id.texto_resultado);
            // Aparece en el recuadro Textview
            valor_resultado.setText("El Resultado es: "+resultado);
    }




}
