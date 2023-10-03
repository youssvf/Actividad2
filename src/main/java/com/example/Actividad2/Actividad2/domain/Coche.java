package com.example.Actividad2.Actividad2.domain;

public class Coche {
    public String matricula;
    public String marca;
    public String modelo;
    public int km;

    public Coche(String matricula, String marca, String modelo, int km) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
    }

    public String getMatricula() {
        return matricula;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getKm() {
        return km;
    }
    @Override
    public String toString() {
        return "Matrícula: " + matricula + "\n Marca: " + marca + "\n Modelo: " + modelo + "\n Km: " + km;
    }
}
