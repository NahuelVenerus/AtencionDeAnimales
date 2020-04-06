package com.company;

public abstract class Animales {

    double peso;
    boolean estaVacunada;
    boolean sed;

    abstract double comer(double comida);

    abstract double beber();

    abstract double caminar();

    abstract boolean vacunar();

    @Override
    public String toString() {
        return "Animales{" +
                "Cuanto pesa? " + peso +
                ", Esta Vacunada? " + estaVacunada +
                ", Tiene sed? " + sed +
                '}';
    }
}
