package com.example.myapplication.activity;

import static com.example.myapplication.utils.Utils.isEmpty;
import static com.example.myapplication.utils.Utils.setaErroCampo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class LoginActivity extends AppCompatActivity {

    private Button btnEntrar;
    private EditText edtNome;
    private EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        recuperarLayout();
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validaLogin()) {
                    edtNome.setText("");
                    edtSenha.setText("");
                    vaiParaOMenu(v);
                }
            }
        });
    }

    private boolean validaLogin() {
        if (!isEmpty(edtNome) && !isEmpty(edtSenha)) {
            if (edtSenha.getText().toString().length() >= 5) {
                setaErroCampo(edtNome, null);
                setaErroCampo(edtSenha, null);
                return true;
            } else {
                setaErroCampo(edtSenha, getString(R.string.menssagem_de_erro_tamanho_senha));
                return false;
            }
        } else {
            if (isEmpty(edtNome))
                setaErroCampo(edtNome, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtSenha))
                setaErroCampo(edtSenha, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            return false;
        }
    }

    public void vaiParaOCadastro(View view) {
        Intent intent = new Intent(this, CriarContaActivity.class);
        startActivity(intent);
    }

    public void vaiParaOMenu(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    private void recuperarLayout() {
        btnEntrar = findViewById(R.id.tela_login_botao_entrar);
        edtNome = findViewById(R.id.tela_login_campo_nome);
        edtSenha = findViewById(R.id.tela_login_campo_senha);
    }

}