package com.example.myapplication.model;

public class Atividade {

    private String horaAtividade;
    private String descricaoAtividade;

    public Atividade(String horaAtividade, String descricaoAtividade) {
        this.horaAtividade = horaAtividade;
        this.descricaoAtividade = descricaoAtividade;
    }

    public String getHoraAtividade() {
        return horaAtividade;
    }

    public void setHoraAtividade(String horaAtividade) {
        this.horaAtividade = horaAtividade;
    }

    public String getDescricaoAtividade() {
        return descricaoAtividade;
    }

    public void setDescricaoAtividade(String descricaoAtividade) {
        this.descricaoAtividade = descricaoAtividade;
    }
}
