package com.example.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class RebanhoActivity extends AppCompatActivity {

    private EditText edtTipoRebanhoDashboard1;
    private EditText edtNomeRebanhoDashboard1;
    private EditText edtQuantidadeRebanhoDashboard1;
    private EditText edtIdRebanhoFazendaDashboard1;
    private EditText edtTipoRebanhoDashboard2;
    private EditText edtNomeRebanhoDashboard2;
    private EditText edtQuantidadeRebanhoDashboard2;
    private EditText edtIdRebanhoFazendaDashboard2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rebanho);
        recuperaLayout();
        populaCampos();
    }

    private void populaCampos() {
        edtTipoRebanhoDashboard1.setText("Ovelhas");
        edtNomeRebanhoDashboard1.setText("Shawn O Carneiro");
        edtQuantidadeRebanhoDashboard1.setText("43");
        edtIdRebanhoFazendaDashboard1.setText("1");

        edtTipoRebanhoDashboard2.setText("Bois");
        edtNomeRebanhoDashboard2.setText("Bois Mansos");
        edtQuantidadeRebanhoDashboard2.setText("33");
        edtIdRebanhoFazendaDashboard2.setText("4");
    }

    private void recuperaLayout() {
        edtTipoRebanhoDashboard1 = findViewById(R.id.tipo_rebanho_1);
        edtNomeRebanhoDashboard1 = findViewById(R.id.nome_rebanho_1);
        edtQuantidadeRebanhoDashboard1 = findViewById(R.id.quantidade_rebanho_1);
        edtIdRebanhoFazendaDashboard1 = findViewById(R.id.id_rebanho_fazenda_1);

        edtTipoRebanhoDashboard2 = findViewById(R.id.tipo_rebanho_2);
        edtNomeRebanhoDashboard2 = findViewById(R.id.nome_rebanho_2);
        edtQuantidadeRebanhoDashboard2 = findViewById(R.id.quantidade_rebanho_2);
        edtIdRebanhoFazendaDashboard2 = findViewById(R.id.id_rebanho_fazenda_2);
    }

    public void vaiParaOCadastroRebanho(View view) {
        Intent intent = new Intent(this, CriaRebanhoActivity.class);
        startActivity(intent);
    }
}