package com.example.myapplication.activity;

import static com.example.myapplication.utils.Utils.configuraErroCamposObrigatorios;
import static com.example.myapplication.utils.Utils.isEmpty;
import static com.example.myapplication.utils.Utils.setaErroCampo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.model.Usuario;

public class CriarContaActivity extends AppCompatActivity {

    private EditText edtNome;
    private EditText edtSenha;
    private EditText edtConfirmacaoSenha;
    private Button btnCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);
        recuperaLayout();
        configuraErroCamposObrigatorios(edtNome, this);
        configuraErroCamposObrigatorios(edtSenha, this);
        configuraErroCamposObrigatorios(edtConfirmacaoSenha, this);
        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validaCadastro()) {
                    criaUsuario();
                    finish();
                }
            }
        });
    }

    private boolean validaCadastro() {
        if (!isEmpty(edtNome) && !isEmpty(edtSenha) && !isEmpty(edtConfirmacaoSenha)) {
            if (!edtSenha.getText().toString().equals(edtConfirmacaoSenha.getText().toString())) {
                setaErroCampo(edtSenha, getString(R.string.menssagem_de_erro_campos_iguais));
                setaErroCampo(edtConfirmacaoSenha, getString(R.string.menssagem_de_erro_campos_iguais));
                return false;
            } else {
                if (edtSenha.getText().toString().length() >= 5) {
                    setaErroCampo(edtNome, null);
                    setaErroCampo(edtSenha, null);
                    setaErroCampo(edtConfirmacaoSenha, null);
                    return true;
                } else {
                    setaErroCampo(edtSenha, getString(R.string.menssagem_de_erro_tamanho_senha));
                    setaErroCampo(edtConfirmacaoSenha, getString(R.string.menssagem_de_erro_tamanho_senha));
                    return false;
                }
            }
        } else {
            if (isEmpty(edtNome))
                setaErroCampo(edtNome, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtSenha))
                setaErroCampo(edtSenha, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtConfirmacaoSenha))
                setaErroCampo(edtConfirmacaoSenha, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            return false;
        }
    }

    private void criaUsuario() {
        String nome = edtNome.getText().toString();
        String senha = edtSenha.getText().toString();
        new Usuario(nome, senha);
    }

    private void recuperaLayout() {
        edtNome = findViewById(R.id.tela_criar_conta_campo_nome);
        edtSenha = findViewById(R.id.tela_criar_conta_campo_senha);
        edtConfirmacaoSenha = findViewById(R.id.tela_criar_conta_corfirmacao_campo_senha);
        btnCadastro = findViewById(R.id.tela_criar_conta_botao_cadastra);
    }

}