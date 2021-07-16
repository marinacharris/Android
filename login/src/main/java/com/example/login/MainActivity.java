package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextUsuario;
    private EditText editTextPass;
    private Button btLogin;
    private TextView tvMensaje;
    private TextView tvRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvRegistro = findViewById(R.id.textViewCrear);
        editTextUsuario = findViewById(R.id.editTextUsuario);
        editTextPass = findViewById(R.id.editTextPassword);
        btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);
        tvMensaje = findViewById(R.id.textMensaje);


    }
    String usuario1 = "gato123";
    String password = "g2";

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btLogin:
                String user = editTextUsuario.getText().toString();
                String pass = editTextPass.getText().toString();
                if(usuario1.equals(user) && password.equals(pass)){
                    Intent intent = new Intent(MainActivity.this, Bienvenida.class);
                    startActivity(intent);
                }else{
                    tvMensaje.setText("Usuario o contraseña no válidos");
                }
                break;


        }


    }
}