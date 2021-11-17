package com.example.myapplication.interfaces;

import android.content.ContentValues;
import android.database.Cursor;

import java.util.List;

public interface IDao<T> {
    boolean inserir(T obj);

    boolean alterar(T obj);

    boolean existe();

    boolean existe(T obj);

    boolean apagar(T obj);

    boolean apagarTodos();

    T buscar();

    T buscar(T obj);

    T buscar(Long id);

    List<T> buscarTodos();

    List<T> buscarTodos(T obj);

    List<T> buscarTodos(Long id);

    ContentValues getContentValues(T obj);

    T getObjetoPreenchido(Cursor c);
}