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
import com.example.myapplication.model.Manejo;

public class CriaManejoActivity extends AppCompatActivity {

    private EditText edtIdRebanho;
    private EditText edtDataUltimaAlimentacao;
    private EditText edtDataUltimavacinacao;
    private EditText edtDistanciaPercorridaNoDia;
    private Button btnCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cria_manejo);
        recuperaLayout();
        configuraErroCamposObrigatorios(edtIdRebanho, this);
        configuraErroCamposObrigatorios(edtDataUltimaAlimentacao, this);
        configuraErroCamposObrigatorios(edtDataUltimavacinacao, this);
        configuraErroCamposObrigatorios(edtDistanciaPercorridaNoDia, this);
        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validaCadastro()) {
                    criaManejo();
                    finish();
                }
            }
        });
    }

    private void recuperaLayout() {
        edtIdRebanho = findViewById(R.id.tela_criar_manejo_id_rebanho_campo);
        edtDataUltimaAlimentacao = findViewById(R.id.tela_criar_manejo_data_ultima_alimentacao_campo);
        edtDataUltimavacinacao = findViewById(R.id.tela_criar_manejo_data_ultima_vacinacao_campo);
        edtDistanciaPercorridaNoDia = findViewById(R.id.tela_criar_manejo_distancia_percorrida_campo);
        btnCadastro = findViewById(R.id.tela_criar_manejo_botao_cadastra);
    }

    private boolean validaCadastro() {
        if (!isEmpty(edtIdRebanho) && !isEmpty(edtDataUltimaAlimentacao) && !isEmpty(edtDataUltimavacinacao) && !isEmpty(edtDistanciaPercorridaNoDia)) {
            return true;
        } else {
            if (isEmpty(edtIdRebanho))
                setaErroCampo(edtIdRebanho, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtDataUltimaAlimentacao))
                setaErroCampo(edtDataUltimaAlimentacao, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtDataUltimavacinacao))
                setaErroCampo(edtDataUltimavacinacao, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtDistanciaPercorridaNoDia))
                setaErroCampo(edtDistanciaPercorridaNoDia, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            return false;
        }
    }

    private void criaManejo() {
        String idRebanho = edtIdRebanho.getText().toString();
        String dataUltimaAlimentacao = edtDataUltimaAlimentacao.getText().toString();
        String dataUltimavacinacao = edtDataUltimavacinacao.getText().toString();
        String distanciaPercorridaNoDia = edtDistanciaPercorridaNoDia.getText().toString();

        new Manejo(idRebanho, dataUltimaAlimentacao, dataUltimavacinacao, distanciaPercorridaNoDia);
    }
}