package com.example.myapplication.model;

public class Fazenda {

    private String idFazenda;
    private String nomeFazenda;
    private String enderecoFazenda;
    private String tamanhoFazenda;

    public Fazenda(String idFazenda, String nomeFazenda, String enderecoFazenda, String tamanhoFazenda) {
        this.idFazenda = idFazenda;
        this.nomeFazenda = nomeFazenda;
        this.enderecoFazenda = enderecoFazenda;
        this.tamanhoFazenda = tamanhoFazenda;
    }

    public String getNomeFazenda() {
        return nomeFazenda;
    }

    public void setNomeFazenda(String nomeFazenda) {
        this.nomeFazenda = nomeFazenda;
    }

    public String getEnderecoFazenda() {
        return enderecoFazenda;
    }

    public void setEnderecoFazenda(String enderecoFazenda) {
        this.enderecoFazenda = enderecoFazenda;
    }

    public String getTamanhoFazenda() {
        return tamanhoFazenda;
    }

    public void setTamanhoFazenda(String tamanhoFazenda) {
        this.tamanhoFazenda = tamanhoFazenda;
    }

    public String getIdFazenda() {
        return idFazenda;
    }

    public void setIdFazenda(String idFazenda) {
        this.idFazenda = idFazenda;
    }

}
