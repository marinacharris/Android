package com.example.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //declaración
    private Button botonCambiar;
    private Button botonLimpiar;
    private TextView TextoMostar;
    private EditText TextoCambiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enlace con los objetos de la vista
        botonCambiar = findViewById(R.id.ButtonCambiar);
        botonLimpiar = findViewById(R.id.ButtonLimpiar);
        TextoMostar = findViewById(R.id.TextVprueba);
        TextoCambiar = findViewById(R.id.EditTprueba);

        botonCambiar.setOnClickListener(this);
        botonLimpiar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ButtonCambiar:
                TextoMostar.setText(TextoCambiar.getText());
                break;
            case R.id.ButtonLimpiar:
                TextoCambiar.setText("");
                break;
        }


    }
}