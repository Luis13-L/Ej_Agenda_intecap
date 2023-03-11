package com.intecap.agenda.models;

public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private String placa;
    private String anio;

    public Auto(String marca, String modelo, String color, String placa, String anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getanio() {
        return anio;
    }

    public void setanio(String anio) {
        this.anio = anio;
    }
}
