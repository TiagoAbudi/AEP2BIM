package com.example.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class ManejoActivity extends AppCompatActivity {

    private EditText edtIdRebanho1;
    private EditText edtDataUltimaAlimentacao1;
    private EditText edtDataUltimaVacinacao1;
    private EditText edtDistanciaPercorridaNoDia1;
    private EditText edtIdRebanho2;
    private EditText edtDataUltimaAlimentacao2;
    private EditText edtDataUltimaVacinacao2;
    private EditText edtDistanciaPercorridaNoDia2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manejo);
        recuperaLayout();
        populaCampos();
    }

    private void populaCampos() {
        edtIdRebanho1.setText("1");
        edtDataUltimaAlimentacao1.setText(R.string.data_alimentacao_1);
        edtDataUltimaVacinacao1.setText(R.string.data_vacinacao_1);
        edtDistanciaPercorridaNoDia1.setText(R.string.distancia_1);

        edtIdRebanho2.setText("2");
        edtDataUltimaAlimentacao2.setText(R.string.data_alimentacao_2);
        edtDataUltimaVacinacao2.setText(R.string.data_vacinacao_2);
        edtDistanciaPercorridaNoDia2.setText(R.string.distancia_2);
    }

    private void recuperaLayout() {
        edtIdRebanho1 = findViewById(R.id.id_rebanho_1);
        edtDataUltimaAlimentacao1 = findViewById(R.id.data_ulima_alimentacao_1);
        edtDataUltimaVacinacao1 = findViewById(R.id.data_ulima_vacinacao_1);
        edtDistanciaPercorridaNoDia1 = findViewById(R.id.distancia_percorrida_1);

        edtIdRebanho2 = findViewById(R.id.id_rebanho_2);
        edtDataUltimaAlimentacao2 = findViewById(R.id.data_ulima_alimentacao_2);
        edtDataUltimaVacinacao2 = findViewById(R.id.data_ulima_vacinacao_2);
        edtDistanciaPercorridaNoDia2 = findViewById(R.id.distancia_percorrida_2);
    }

    public void vaiParaOCadastroManejo(View view) {
        Intent intent = new Intent(this, CriaManejoActivity.class);
        startActivity(intent);
    }

}