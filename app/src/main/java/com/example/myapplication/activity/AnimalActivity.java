package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.R;

public class AnimalActivity extends AppCompatActivity {

    private EditText edtNomeAnimal1;
    private EditText edtTipoAnimal1;
    private EditText edtPesoAnimal1;
    private EditText edtDataNascimentoAnimal1;
    private EditText edtRebanhoAnimal1;
    private EditText edtUltimaVacinaAnimal1;

    private EditText edtNomeAnimal2;
    private EditText edtTipoAnimal2;
    private EditText edtPesoAnimal2;
    private EditText edtDataNascimentoAnimal2;
    private EditText edtRebanhoAnimal2;
    private EditText edtUltimaVacinaAnimal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        recuperaLayout();
        populaCampos();
    }

    private void populaCampos() {
        edtNomeAnimal1.setText(R.string.touro_bandido);
        edtTipoAnimal1.setText(R.string.bovino);
        edtPesoAnimal1.setText(R.string.peso);
        edtDataNascimentoAnimal1.setText(R.string.data_nascimento_1);
        edtRebanhoAnimal1.setText(R.string.bois_mansos);
        edtUltimaVacinaAnimal1.setText(R.string.vacina_1);

        edtNomeAnimal2.setText(R.string.shawn);
        edtTipoAnimal2.setText(R.string.ovinos);
        edtPesoAnimal2.setText(R.string.peso_2);
        edtDataNascimentoAnimal2.setText(R.string.data_nascimento_2);
        edtRebanhoAnimal2.setText(R.string.shawn_o_carneiro);
        edtUltimaVacinaAnimal2.setText(R.string.vacina_2);
    }

    private void recuperaLayout() {
        edtNomeAnimal1 = findViewById(R.id.nome_animal_1);
        edtTipoAnimal1 = findViewById(R.id.tipo_animal_1);
        edtPesoAnimal1 = findViewById(R.id.peso_animal_1);
        edtDataNascimentoAnimal1 = findViewById(R.id.data_nascimento_animal_1);
        edtRebanhoAnimal1 = findViewById(R.id.rebanho_animal_1);
        edtUltimaVacinaAnimal1 = findViewById(R.id.ultima_vacina_animal_1);

        edtNomeAnimal2 = findViewById(R.id.nome_animal_2);
        edtTipoAnimal2 = findViewById(R.id.tipo_animal_2);
        edtPesoAnimal2 = findViewById(R.id.peso_animal_2);
        edtDataNascimentoAnimal2 = findViewById(R.id.data_nascimento_animal_2);
        edtRebanhoAnimal2 = findViewById(R.id.rebanho_animal_2);
        edtUltimaVacinaAnimal2 = findViewById(R.id.ultima_vacina_animal_2);
    }

    public void vaiParaOCadastroAnimal(View view) {
        Intent intent = new Intent(this, CriaAnimalActivity.class);
        startActivity(intent);
    }
}