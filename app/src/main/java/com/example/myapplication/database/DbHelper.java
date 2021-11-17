package com.example.myapplication.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    private Context mContext;

    public DbHelper(Context pContext) {
        super(pContext, AtributosBancoDados.BancoDados.NOME, null, AtributosBancoDados.BancoDados.VERSAO);
        this.mContext = pContext;
    }

    public static SQLiteDatabase getBancoEscrita(Context pContext, SQLiteDatabase pDb) {
        return getInstanceDb(pContext, TipoBanco.ESCRITA, pDb);
    }

    public static SQLiteDatabase getBancoEscrita(Context pContext) {
        return getBancoEscrita(pContext, null);
    }

    public static SQLiteDatabase getBancoLeitura(Context pContext, SQLiteDatabase pDb) {
        return getInstanceDb(pContext, TipoBanco.LEITURA, pDb);
    }

    private static SQLiteDatabase getInstanceDb(Context ctx, TipoBanco tipoBanco, SQLiteDatabase db) {
        if (db == null) {
            if (tipoBanco.equals(TipoBanco.ESCRITA)) {
                return new DbHelper(ctx).getWritableDatabase();
            } else if (tipoBanco.equals(TipoBanco.LEITURA)) {
                return new DbHelper(ctx).getReadableDatabase();
            }
        }
        return db;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public enum TipoBanco {

        LEITURA("Banco para leitura"), ESCRITA("Banco para escrita");

        private String descricao;

        private TipoBanco(String descricao) {
            this.descricao = descricao;
        }

        @Override
        public String toString() {
            return this.descricao;
        }
    }

}
