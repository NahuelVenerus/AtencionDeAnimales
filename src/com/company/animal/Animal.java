package com.company.animal;

public abstract class Animal {

    double peso;
    boolean estaVacunada;
    boolean sed;
    boolean hambre;

    public abstract void comer(double pesoComida);

    public abstract void beber();

    public abstract void vacunar();

    public abstract boolean convieneVacunar();

    public double getPeso() {
        return peso;
    }

    public boolean isEstaVacunada() {
        return estaVacunada;
    }

    public boolean isSed() {
        return sed;
    }

    public boolean isHambre() {
        return hambre;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Cuanto pesa? " + peso +
                ", Esta Vacunada? " + estaVacunada +
                ", Tiene sed? " + sed +
                '}';
    }
}
