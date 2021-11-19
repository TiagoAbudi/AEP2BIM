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
import com.example.myapplication.model.Atividade;

public class CriaTarefaActivity extends AppCompatActivity {

    private EditText edtHora;
    private EditText edtAtividade;
    private Button btnCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cria_tarefa);
        recuperaLayout();
        configuraErroCamposObrigatorios(edtHora, this);
        configuraErroCamposObrigatorios(edtAtividade, this);
        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validaCadastro()) {
                    criaAtividade();
                    finish();
                }
            }
        });
    }

    private void criaAtividade() {
        String hora = edtHora.getText().toString();
        String atividade = edtAtividade.getText().toString();

        new Atividade(hora, atividade);
    }

    private boolean validaCadastro() {
        if (!isEmpty(edtHora) && !isEmpty(edtAtividade)) {
            return true;
        } else {
            if (isEmpty(edtHora))
                setaErroCampo(edtHora, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtAtividade))
                setaErroCampo(edtAtividade, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            return false;
        }
    }

    private void recuperaLayout() {
        edtHora = findViewById(R.id.tela_criar_tarefa_hora_campo);
        edtAtividade = findViewById(R.id.tela_criar_tarefa_atividade_campo);
        btnCadastro = findViewById(R.id.tela_criar_atividade_botao_cadastra);
    }
}