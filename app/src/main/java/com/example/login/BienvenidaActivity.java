package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BienvenidaActivity extends AppCompatActivity {

    TextView txtvBienvenida, txtvCorreo;
    Button btnRegresar;

    String nombre, apellido, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        txtvBienvenida = findViewById(R.id.txtv_bienvenida);
        txtvCorreo = findViewById(R.id.txtv_correo);
        btnRegresar = findViewById(R.id.btn_regresar);

        //Obtenemos los datos guardados en el Intent
        nombre = getIntent().getStringExtra("nombre");
        apellido = getIntent().getStringExtra("apellido");
        correo = getIntent().getStringExtra("correo");

        //Se cambia texto de los TextView
        txtvBienvenida.setText("Bienvenido " + nombre + " " + apellido);
        txtvCorreo.setText("Tu correo es: " + correo);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRegresar = new Intent(BienvenidaActivity.this, MainActivity.class);
                startActivity(intentRegresar);
            }
        });

        //Toast.makeText(getApplicationContext(), nombre, Toast.LENGTH_LONG).show();
    }
}