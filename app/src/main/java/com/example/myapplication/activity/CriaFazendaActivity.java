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
import com.example.myapplication.model.Fazenda;

public class CriaFazendaActivity extends AppCompatActivity {

    private EditText edtId;
    private EditText edtNome;
    private EditText edtEndereco;
    private EditText edtTamanho;
    private Button btnCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cria_fazenda);
        recuperaLayout();
        configuraErroCamposObrigatorios(edtId, this);
        configuraErroCamposObrigatorios(edtNome, this);
        configuraErroCamposObrigatorios(edtEndereco, this);
        configuraErroCamposObrigatorios(edtTamanho, this);
        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validaCadastro()) {
                    criaFazenda();
                    finish();
                }
            }
        });
    }

    private void criaFazenda() {
        String id = edtId.getText().toString();
        String nome = edtNome.getText().toString();
        String endereco = edtEndereco.getText().toString();
        String tamanho = edtTamanho.getText().toString();
        new Fazenda(id, nome, endereco, tamanho);
    }

    private boolean validaCadastro() {
        if (!isEmpty(edtId) && !isEmpty(edtNome) && !isEmpty(edtEndereco) && !isEmpty(edtTamanho)) {
            return true;
        } else {
            if (isEmpty(edtId))
                setaErroCampo(edtId, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtNome))
                setaErroCampo(edtNome, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtEndereco))
                setaErroCampo(edtEndereco, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtTamanho))
                setaErroCampo(edtTamanho, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            return false;
        }
    }

    private void recuperaLayout() {
        edtId = findViewById(R.id.tela_criar_fazenda_campo_id);
        edtNome = findViewById(R.id.tela_criar_fazenda_campo_nome);
        edtEndereco = findViewById(R.id.tela_criar_fazenda_campo_endereco);
        edtTamanho = findViewById(R.id.tela_criar_fazenda_campo_tamanho);
        btnCadastro = findViewById(R.id.tela_criar_fazenda_botao_cadastra);
    }
}