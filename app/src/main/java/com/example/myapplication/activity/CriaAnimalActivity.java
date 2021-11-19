package com.example.myapplication.activity;

import static com.example.myapplication.utils.Utils.configuraErroCamposObrigatorios;
import static com.example.myapplication.utils.Utils.isEmpty;
import static com.example.myapplication.utils.Utils.setaErroCampo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;
import com.example.myapplication.model.Animal;
import com.example.myapplication.model.Manejo;

public class CriaAnimalActivity extends AppCompatActivity {

    private EditText edtNomeAnimal;
    private EditText edtTipoAnimal;
    private EditText edtPesoAnimal;
    private EditText edtDataNascimentoAnimal;
    private EditText edtRebanhoAnimal;
    private EditText edtUltimaVacinaAnimal;
    private Button btnCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cria_animal);
        recuperaLayout();
        configuraErroCamposObrigatorios(edtNomeAnimal, this);
        configuraErroCamposObrigatorios(edtTipoAnimal, this);
        configuraErroCamposObrigatorios(edtPesoAnimal, this);
        configuraErroCamposObrigatorios(edtDataNascimentoAnimal, this);
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
        edtNomeAnimal = findViewById(R.id.tela_criar_animal_nome_campo);
        edtTipoAnimal = findViewById(R.id.tela_criar_animal_tipo_campo);
        edtPesoAnimal = findViewById(R.id.tela_criar_animal_peso_campo);
        edtDataNascimentoAnimal = findViewById(R.id.tela_criar_animal_data_nascimento_campo);
        edtRebanhoAnimal = findViewById(R.id.tela_criar_animal_rebanho_campo);
        edtUltimaVacinaAnimal = findViewById(R.id.tela_criar_animal_ultima_vacina_campo);
        btnCadastro = findViewById(R.id.tela_criar_animal_botao_cadastra);
    }

    private boolean validaCadastro() {
        if (!isEmpty(edtNomeAnimal)
                && !isEmpty(edtTipoAnimal)
                && !isEmpty(edtPesoAnimal)
                && !isEmpty(edtDataNascimentoAnimal)
                && !isEmpty(edtRebanhoAnimal)
                && !isEmpty(edtUltimaVacinaAnimal)) {
            return true;
        } else {
            if (isEmpty(edtNomeAnimal))
                setaErroCampo(edtNomeAnimal, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtTipoAnimal))
                setaErroCampo(edtTipoAnimal, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtPesoAnimal))
                setaErroCampo(edtPesoAnimal, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtDataNascimentoAnimal))
                setaErroCampo(edtDataNascimentoAnimal, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtRebanhoAnimal))
                setaErroCampo(edtRebanhoAnimal, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            if (isEmpty(edtUltimaVacinaAnimal))
                setaErroCampo(edtUltimaVacinaAnimal, getString(R.string.menssagem_de_erro_campo_obrigatorio));
            return false;
        }
    }

    private void criaManejo() {
        String nomeAnimal = edtNomeAnimal.getText().toString();
        String tipoAnimal = edtTipoAnimal.getText().toString();
        String pesoAnimal = edtPesoAnimal.getText().toString();
        String dataNascimentoAnimal = edtDataNascimentoAnimal.getText().toString();
        String rebanhoAnimal = edtRebanhoAnimal.getText().toString();
        String ultimaVacinaAnimal = edtUltimaVacinaAnimal.getText().toString();

        new Animal(nomeAnimal, tipoAnimal, pesoAnimal, dataNascimentoAnimal, rebanhoAnimal, ultimaVacinaAnimal);
    }
}