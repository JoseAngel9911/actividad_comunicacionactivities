package com.programacionandroid.actividad_comunicacionactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nombre;
    TextView rut;
    EditText edad;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.cptxtNombre);
        rut = findViewById(R.id.cptxtRut);
        edad = findViewById(R.id.cptxtEdad);
        boton = findViewById(R.id.btnEnviar);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                String nombreParametro = nombre.getText().toString();
                String rutParametro = rut.getText().toString();
                Integer edadParametro =  Integer.parseInt(edad.getText().toString());

                intent.putExtra("nombre",  nombreParametro);
                intent.putExtra("rut", rutParametro);
                intent.putExtra("edad",  edadParametro);
                startActivity(intent);
            }
        });


    }
}