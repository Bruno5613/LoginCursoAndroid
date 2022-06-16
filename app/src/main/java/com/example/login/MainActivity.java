package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

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
                Snackbar.make(view, "Usuario Registrado :)", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}