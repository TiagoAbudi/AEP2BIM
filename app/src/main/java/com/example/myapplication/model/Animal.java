package com.example.myapplication.model;

public class Animal {

    private String nomeAnimal;
    private String tipoAnimal;
    private String pesoAnimal;
    private String dataNascimentoAnimal;
    private String rebanhoAnimal;
    private String ultimaVacinaAnimal;

    public Animal(String nomeAnimal, String tipoAnimal, String pesoAnimal, String dataNascimentoAnimal, String rebanhoAnimal, String ultimaVacinaAnimal) {
        this.nomeAnimal = nomeAnimal;
        this.tipoAnimal = tipoAnimal;
        this.pesoAnimal = pesoAnimal;
        this.dataNascimentoAnimal = dataNascimentoAnimal;
        this.rebanhoAnimal = rebanhoAnimal;
        this.ultimaVacinaAnimal = ultimaVacinaAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getPesoAnimal() {
        return pesoAnimal;
    }

    public void setPesoAnimal(String pesoAnimal) {
        this.pesoAnimal = pesoAnimal;
    }

    public String getDataNascimentoAnimal() {
        return dataNascimentoAnimal;
    }

    public void setDataNascimentoAnimal(String dataNascimentoAnimal) {
        this.dataNascimentoAnimal = dataNascimentoAnimal;
    }

    public String getRebanhoAnimal() {
        return rebanhoAnimal;
    }

    public void setRebanhoAnimal(String rebanhoAnimal) {
        this.rebanhoAnimal = rebanhoAnimal;
    }

    public String getUltimaVacinaAnimal() {
        return ultimaVacinaAnimal;
    }

    public void setUltimaVacinaAnimal(String ultimaVacinaAnimal) {
        this.ultimaVacinaAnimal = ultimaVacinaAnimal;
    }
}
