package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class LoginActivity extends AppCompatActivity {

    private Button btnEntrar;
    private EditText edtNome;
    private EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recuperarLayout();
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNome.setText("");
                edtSenha.setText("");
                vaiParaOMenu(v);
            }
        });
    }
    public void vaiParaOMenu(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
    private void recuperarLayout(){
        setContentView(R.layout.activity_login);
        btnEntrar = findViewById(R.id.tela_login_botao_entrar);
        edtNome = findViewById(R.id.tela_login_campo_nome);
        edtSenha = findViewById(R.id.tela_login_campo_senha);
    }

}