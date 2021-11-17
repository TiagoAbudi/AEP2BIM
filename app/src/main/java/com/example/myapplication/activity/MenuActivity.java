package com.example.myapplication.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void vaiParaAFazenda(View view) {
        Intent intent = new Intent(this, FazendaActivity.class);
        startActivity(intent);
    }

    public void vaiParaOManejo(View view) {
        Intent intent = new Intent(this, ManejoActivity.class);
        startActivity(intent);
    }

    public void vaiParaORebanho(View view) {
        Intent intent = new Intent(this, RebanhoActivity.class);
        startActivity(intent);
    }

    public void vaiParaOCronograma(View view) {
        Intent intent = new Intent(this, CronogramaActivity.class);
        startActivity(intent);
    }

    public void vaiParaOLogin(View view) {
        constroiDialog();
    }

    private void constroiDialog() {
        AlertDialog.Builder aBuilder = new AlertDialog.Builder(this);
        aBuilder.setTitle(" A T E N Ç Ã O ")
                .setMessage("Tem certeza que deseja sair?")
                .setCancelable(false).setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).show();
    }

}