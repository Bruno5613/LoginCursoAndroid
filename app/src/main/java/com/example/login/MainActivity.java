package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    //Declaración de los elementos
    EditText edtxtNombre, edtxtApellido,edtxtTelefono,edtxtCorreo,edtxtContrasenha;
    Button btnRegistrar;

    //Atributos variables
    String nombre, apellido, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relación de los elementos java con su elemento xml
        edtxtNombre = findViewById(R.id.edtxt_nombre);
        edtxtApellido = findViewById(R.id.edtxt_apellido);
        edtxtTelefono = findViewById(R.id.edtxt_telefono);
        edtxtCorreo = findViewById(R.id.edtxtx_correo);
        edtxtContrasenha = findViewById(R.id.edtxtx_contrasenha);

        btnRegistrar = findViewById(R.id.btn_registrar);

        //Acción del botón
        btnRegistrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Todo lo que se hace si el usuario hace click
                //Toast makeText(contexto,"texto", duración)
                Toast.makeText(getApplicationContext(),"Usuario Registrado", Toast.LENGTH_LONG).show();

                //SnackBar
                //Snackbar.make(view, "Usuario Registrado :)", Snackbar.LENGTH_LONG).show();

                //Obtenemos el texto que introduce el usuario en los Edit Text
                nombre = edtxtNombre.getText().toString();
                apellido = edtxtApellido.getText().toString();
                correo = edtxtCorreo.getText().toString();

                //Se crea el intent
                //Intent(<dónde estamos>.this, <a dónde vamos>.class)
                Intent intentBienvenida = new Intent(MainActivity.this, BienvenidaActivity.class);

                //Se pasan datos para ocuparlos en la siguiente Activity
                intentBienvenida.putExtra("nombre",nombre);
                intentBienvenida.putExtra("apellido", apellido);
                intentBienvenida.putExtra("correo", correo);

                //Se inicia con la Activity
                startActivity(intentBienvenida);
            }
        });
    }
}