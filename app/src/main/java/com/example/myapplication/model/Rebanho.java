package com.example.myapplication.model;

public class Rebanho {

    private String tipoRebanho;
    private String nomeRebanho;
    private String quantidadeRebanho;
    private String idFazendaRebanho;

    public Rebanho(String tipoRebanho, String nomeRebanho, String quantidadeRebanho, String idFazendaRebanho) {
        this.tipoRebanho = tipoRebanho;
        this.nomeRebanho = nomeRebanho;
        this.quantidadeRebanho = quantidadeRebanho;
        this.idFazendaRebanho = idFazendaRebanho;
    }

    public String getTipoRebanho() {
        return tipoRebanho;
    }

    public void setTipoRebanho(String tipoRebanho) {
        this.tipoRebanho = tipoRebanho;
    }

    public String getNomeRebanho() {
        return nomeRebanho;
    }

    public void setNomeRebanho(String nomeRebanho) {
        this.nomeRebanho = nomeRebanho;
    }

    public String getQuantidadeRebanho() {
        return quantidadeRebanho;
    }

    public void setQuantidadeRebanho(String quantidadeRebanho) {
        this.quantidadeRebanho = quantidadeRebanho;
    }

    public String getIdFazendaRebanho() {
        return idFazendaRebanho;
    }

    public void setIdFazendaRebanho(String idFazendaRebanho) {
        this.idFazendaRebanho = idFazendaRebanho;
    }
}
