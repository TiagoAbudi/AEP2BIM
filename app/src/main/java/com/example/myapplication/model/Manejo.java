package com.example.myapplication.model;

public class Manejo {

    private String idRebanho;
    private String dataUltimaAlimentacao;
    private String dataUltimavacinacao;
    private String distanciaPercorridaNoDia;

    public Manejo(String idRebanho, String dataUltimaAlimentacao, String dataUltimavacinacao, String distanciaPercorridaNoDia) {
        this.idRebanho = idRebanho;
        this.dataUltimaAlimentacao = dataUltimaAlimentacao;
        this.dataUltimavacinacao = dataUltimavacinacao;
        this.distanciaPercorridaNoDia = distanciaPercorridaNoDia;
    }

    public String getIdRebanho() {
        return idRebanho;
    }

    public void setIdRebanho(String idRebanho) {
        this.idRebanho = idRebanho;
    }

    public String getDataUltimaAlimentacao() {
        return dataUltimaAlimentacao;
    }

    public void setDataUltimaAlimentacao(String dataUltimaAlimentacao) {
        this.dataUltimaAlimentacao = dataUltimaAlimentacao;
    }

    public String getDataUltimavacinacao() {
        return dataUltimavacinacao;
    }

    public void setDataUltimavacinacao(String dataUltimavacinacao) {
        this.dataUltimavacinacao = dataUltimavacinacao;
    }

    public String getDistanciaPercorridaNoDia() {
        return distanciaPercorridaNoDia;
    }

    public void setDistanciaPercorridaNoDia(String distanciaPercorridaNoDia) {
        this.distanciaPercorridaNoDia = distanciaPercorridaNoDia;
    }
}
