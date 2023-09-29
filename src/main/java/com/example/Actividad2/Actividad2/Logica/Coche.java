package com.example.Actividad2.Actividad2.Logica;

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

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + "\n Marca: " + marca + "\n Modelo: " + modelo + "\n Km: " + km;
    }
}
