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
import com.example.myapplication.model.Rebanho;

public class CriaRebanhoActivity extends AppCompatActivity {

    private EditText edtTipoRebanho;
    private EditText edtNomeRebanho;
    private EditText edtQuantidadeRebanho;
    private EditText edtIdFazendaRebanho;
    private Button btnCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cria_rebanho);
        recuperaLayout();
        configuraErroCamposObrigatorios(edtTipoRebanho, this);
        configuraErroCamposObrigatorios(edtNomeRebanho, this);
        configuraErroCamposObrigatorios(edtQuantidadeRebanho, this);
        configuraErroCamposObrigatorios(edtIdFazendaRebanho, this);
        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validaCadastro()) {
                    criaRebanho();
                    finish();
                }
            }
        });
    }

    private void criaRebanho() {
        String tipoRebanho = edtTipoRebanho.getText().toString();
        String nomeRebanho = edtNomeRebanho.getText().toString();
        String quantidadeRebanho = edtQuantidadeRebanho.getText().toString();
        String idFazendaRebanho = edtIdFazendaRebanho.getText().toString();

        new Rebanho(tipoRebanho, nomeRebanho, quantidadeRebanho, idFazendaRebanho);
    }

    private boolean validaCadastro() {
        if (!isEmpty(edtTipoRebanho) && !isEmpty(edtNomeRebanho) && !isEmpty(edtQuantidadeRebanho) && !isEmpty(edtIdFazendaRebanho)) {
            return true;
        } else {
            if (isEmpty(edtTipoRebanho))
                setaErroCampo(edtTipoRebanho, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtNomeRebanho))
                setaErroCampo(edtNomeRebanho, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtQuantidadeRebanho))
                setaErroCampo(edtQuantidadeRebanho, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtIdFazendaRebanho))
                setaErroCampo(edtIdFazendaRebanho, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            return false;
        }
    }

    private void recuperaLayout() {
        edtTipoRebanho = findViewById(R.id.tela_criar_rebanho_tipo_rebanho_campo);
        edtNomeRebanho = findViewById(R.id.tela_criar_rebanho_nome_rebanho_campo);
        edtQuantidadeRebanho = findViewById(R.id.tela_criar_rebanho_quantidade_rebanho_campo);
        edtIdFazendaRebanho = findViewById(R.id.tela_criar_rebanho_id_fazenda_campo);
        btnCadastro = findViewById(R.id.tela_criar_rebanho_botao_cadastra);
    }
}