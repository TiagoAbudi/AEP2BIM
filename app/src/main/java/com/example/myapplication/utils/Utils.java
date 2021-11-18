package com.example.myapplication.utils;

import android.content.Context;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.R;

public class Utils {

    public static boolean isEmpty(EditText edtText) {
        return edtText.getText().toString().trim().length() <= 0;
    }

    public static void setaErroCampo(EditText edtText, String erro) {
        edtText.setError(erro);
    }

    public static void configuraErroCamposObrigatorios(EditText edtText, Context context) {
        edtText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (isEmpty(edtText)) {
                    setaErroCampo(edtText, context.getString(R.string.menssagem_de_erro_campo_obrigatorio));
                } else {
                    setaErroCampo(edtText, null);
                }
            }
        });
    }

}
