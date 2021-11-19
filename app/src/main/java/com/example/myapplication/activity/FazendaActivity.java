package com.example.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class FazendaActivity extends AppCompatActivity {

    private EditText edtIdDashboard1;
    private EditText edtNomeDashboard1;
    private EditText edtEnderecoDashboard1;
    private EditText edtTamanhoDashboard1;
    private EditText edtIdDashboard2;
    private EditText edtNomeDashboard2;
    private EditText edtEnderecoDashboard2;
    private EditText edtTamanhoDashboard2;
    private EditText edtIdDashboard3;
    private EditText edtNomeDashboard3;
    private EditText edtEnderecoDashboard3;
    private EditText edtTamanhoDashboard3;
    private EditText edtIdDashboard4;
    private EditText edtNomeDashboard4;
    private EditText edtEnderecoDashboard4;
    private EditText edtTamanhoDashboard4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fazenda);
        recuperaLayout();
        populaCampos();
    }

    private void populaCampos() {
        edtIdDashboard1.setText("1");
        edtNomeDashboard1.setText(R.string.nome_fazenda_1);
        edtEnderecoDashboard1.setText(R.string.endereco_fazenda_1);
        edtTamanhoDashboard1.setText(R.string.tamanho_fazenda_1);
        edtIdDashboard2.setText("2");
        edtNomeDashboard2.setText(R.string.nome_fazenda_2);
        edtEnderecoDashboard2.setText(R.string.endereco_fazenda_2);
        edtTamanhoDashboard2.setText(R.string.tamanho_fazenda_2);
        edtIdDashboard3.setText("3");
        edtNomeDashboard3.setText(R.string.nome_fazenda_3);
        edtEnderecoDashboard3.setText(R.string.endereco_fazenda_3);
        edtTamanhoDashboard3.setText(R.string.tamanho_fazenda_3);
        edtIdDashboard4.setText("4");
        edtNomeDashboard4.setText(R.string.nome_fazenda_4);
        edtEnderecoDashboard4.setText(R.string.endereco_fazenda_4);
        edtTamanhoDashboard4.setText(R.string.tamanho_fazenda_4);
    }

    private void recuperaLayout() {
        edtIdDashboard1 = findViewById(R.id.id_fazenda);
        edtNomeDashboard1 = findViewById(R.id.nome_fazenda);
        edtEnderecoDashboard1 = findViewById(R.id.endereco_fazenda);
        edtTamanhoDashboard1 = findViewById(R.id.tamanho_fazenda);
        edtIdDashboard2 = findViewById(R.id.id_fazenda2);
        edtNomeDashboard2 = findViewById(R.id.nome_fazenda2);
        edtEnderecoDashboard2 = findViewById(R.id.endereco_fazenda2);
        edtTamanhoDashboard2 = findViewById(R.id.tamanho_fazenda2);
        edtIdDashboard3 = findViewById(R.id.id_fazenda3);
        edtNomeDashboard3 = findViewById(R.id.nome_fazenda3);
        edtEnderecoDashboard3 = findViewById(R.id.endereco_fazenda3);
        edtTamanhoDashboard3 = findViewById(R.id.tamanho_fazenda3);
        edtIdDashboard4 = findViewById(R.id.id_fazenda4);
        edtNomeDashboard4 = findViewById(R.id.nome_fazenda4);
        edtEnderecoDashboard4 = findViewById(R.id.endereco_fazenda4);
        edtTamanhoDashboard4 = findViewById(R.id.tamanho_fazenda4);
    }

    public void vaiParaOCadastroFazenda(View view) {
        Intent intent = new Intent(this, CriaFazendaActivity.class);
        startActivity(intent);
    }

}