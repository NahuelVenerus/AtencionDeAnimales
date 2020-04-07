package com.company.animal;

public class Vaca extends Animal {

    private double peso;
    private boolean estaVacunada;
    private boolean sed;

    public Vaca(double peso, boolean estaVacunada, boolean sed) {
        this.peso = peso;
        this.estaVacunada = estaVacunada;
        this.sed = sed;
    }

    public boolean isHambre() {
        return peso < 200;
    }

    @Override
    public void comer(double pesoComida) {
        peso = peso + pesoComida / 3;
        sed = true;
    }

    @Override
    public void beber() {
        sed = false;
        peso = peso - 0.5;
    }

    @Override
    public void vacunar() {
        if (convieneVacunar()) {
            estaVacunada = true;
        }
    }

    @Override
    public boolean convieneVacunar() {
        return !estaVacunada;
    }

    void caminar() {
        peso = peso - 3;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isEstaVacunada() {
        return estaVacunada;
    }

    public boolean isSed() {
        return sed;
    }

    @Override
    public String toString() {
        return "Vaca{" +
                "peso=" + peso +
                ", estaVacunada=" + estaVacunada +
                ", sed=" + sed + ", tiene hambre=" + isHambre() +
                '}';
    }
}
