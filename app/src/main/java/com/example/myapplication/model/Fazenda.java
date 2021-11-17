package com.example.myapplication.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.myapplication.interfaces.IDao;
import com.example.myapplication.interfaces.IModelo;

import java.util.List;

public class Fazenda implements IModelo<Fazenda> {

    private String idFazenda;

    @Override
    public boolean inserir(IDao<Fazenda> dao) {
        return false;
    }

    @Override
    public boolean alterar(IDao<Fazenda> dao) {
        return false;
    }

    @Override
    public boolean existe(IDao<Fazenda> dao) {
        return false;
    }

    @Override
    public boolean apagar(IDao<Fazenda> dao) {
        return false;
    }

    @Override
    public boolean apagarTodos(IDao<Fazenda> dao) {
        return false;
    }

    @Override
    public Fazenda buscar(IDao<Fazenda> dao) {
        return null;
    }

    @Override
    public Fazenda buscar(Fazenda obj, IDao<Fazenda> dao) {
        return null;
    }

    @Override
    public Fazenda buscar(Long id, IDao<Fazenda> dao) {
        return null;
    }

    @Override
    public List<Fazenda> buscarTodos(IDao<Fazenda> dao) {
        return null;
    }

    @Override
    public List<Fazenda> buscarTodos(Fazenda oj, IDao<Fazenda> dao) {
        return null;
    }

    @Override
    public List<Fazenda> buscarTodos(Long id, IDao<Fazenda> dao) {
        return null;
    }

    @Override
    public IDao<Fazenda> getDao(Context ctx, SQLiteDatabase db) {
        return null;
    }

    public String getIdFazenda() {
        return idFazenda;
    }

    public void setIdFazenda(String idFazenda) {
        this.idFazenda = idFazenda;
    }

}
