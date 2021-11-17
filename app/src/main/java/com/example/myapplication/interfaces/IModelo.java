package com.example.myapplication.interfaces;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

public interface IModelo<T> {
    boolean inserir(IDao<T> dao);

    boolean alterar(IDao<T> dao);

    boolean existe(IDao<T> dao);

    boolean apagar(IDao<T> dao);

    boolean apagarTodos(IDao<T> dao);

    T buscar(IDao<T> dao);

    T buscar(T obj, IDao<T> dao);

    T buscar(Long id, IDao<T> dao);

    List<T> buscarTodos(IDao<T> dao);

    List<T> buscarTodos(T oj, IDao<T> dao);

    List<T> buscarTodos(Long id, IDao<T> dao);

    IDao<T> getDao(Context ctx, SQLiteDatabase db);
}