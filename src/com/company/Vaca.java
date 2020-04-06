package com.company;

public class Vaca extends Animales {

    private double peso;
    private boolean estaVacunada;
    boolean sed;

    public Vaca(double peso, boolean estaVacunada, boolean sed) {
        this.peso = peso;
        this.estaVacunada = estaVacunada;
        this.sed = sed;
    }

    public Vaca(double peso) {
        this.peso = peso;
    }


    boolean tieneHambre() {
        return peso < 200;
    }

    @Override
    double comer(double comida) {
        sed = true;
        peso = peso + comida/3;
        return peso;
    }

      @Override
    double beber() {
        if (sed = true) {
            sed = false;
            peso = peso - 0.5;
            return peso;
        }
        return 0;
    }

    @Override
    double caminar() {
        return peso - 3;
    }

    @Override
    boolean vacunar() {
        if (estaVacunada = true){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vaca{" +
                "peso=" + peso +
                ", estaVacunada=" + estaVacunada +
                ", sed=" + sed + ", tiene hambre=" + tieneHambre() +
                '}';
    }
}
