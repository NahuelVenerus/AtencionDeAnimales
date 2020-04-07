package com.company.animal;

public class Gallina extends Animal {

    private double peso = 4;
    private boolean hambre = true;
    private boolean sed = false;
    private boolean estaVacunada = false;
    private int vecesQueFueAComer = 0;

    public Gallina() {
    }

    @Override
    public void comer(double pesoComida) {
        vecesQueFueAComer++;
    }

    @Override
    public void beber() {
    }

    @Override
    public void vacunar() {
    }

    @Override
    public boolean convieneVacunar() {
        return false;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isHambre() {
        return hambre;
    }

    public boolean isSed() {
        return sed;
    }

    public boolean isVacunada() {
        return estaVacunada;
    }

    public int getVecesQueFueAComer() {
        return vecesQueFueAComer;
    }

    @Override
    public String toString() {
        return "Gallina{" +
                "peso=" + peso +
                ", hambre=" + hambre +
                ", sed=" + sed +
                ", vacunada=" + estaVacunada +
                ", vecesQueFueAComer=" + vecesQueFueAComer +
                '}';
    }
}
