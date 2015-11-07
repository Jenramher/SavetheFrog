package com.uva.moviles.savethefrog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Jennifer on 03/11/2015.
 */
public class pantallaInicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_inicio);

    }

    public void iniciarSimulacion(View view){
        Intent i = new Intent(this, Simulacion.class);
        startActivity(i);
    }

}
