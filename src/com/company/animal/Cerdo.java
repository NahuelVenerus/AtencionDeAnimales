package com.company.animal;

public class Cerdo extends Animal {

    private double peso;
    private boolean sed;
    private boolean estaVacunada;
    private int vecesQueComioSinBeber = 0;
    private double cuantoComioLaVezQueMasComio = 0;
    private boolean hambre;

    public Cerdo(double peso, boolean sed, boolean hambre) {
        this.peso = peso;
        this.sed = sed;
        this.hambre = hambre;
    }

    @Override
    public void comer(double pesoComida) {
        if (pesoComida >= 0.2) {
            peso = peso + pesoComida - 0.2;
        }
        if (pesoComida > 1) {
            hambre = false;
        }
        cuantoComioLaVezQueMasComio = Math.max(cuantoComioLaVezQueMasComio, pesoComida);
        vecesQueComioSinBeber++;
        darSed();
    }

    void darSed() {
        if (vecesQueComioSinBeber > 3) {
            sed = true;
        }
    }

    @Override
    public void beber() {
        sed = false;
        hambre = true;
    }

    @Override
    public void vacunar() {
        estaVacunada = true;
    }

    @Override
    public boolean convieneVacunar() {
        return true;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isSed() {
        return sed;
    }

    public int getVecesQueComioSinBeber() {
        return vecesQueComioSinBeber;
    }

    public double getCuantoComioLaVezQueMasComio() {
        return cuantoComioLaVezQueMasComio;
    }

    public boolean isHambre() {
        return hambre;
    }

    @Override
    public boolean isEstaVacunada() {
        return estaVacunada;
    }

    @Override
    public String toString() {
        return "Cerdo{" +
                "peso=" + peso +
                ", sed=" + sed +
                ", vecesQueComioSinBeber=" + vecesQueComioSinBeber +
                ", cuantoComioLaVezQueMasComio=" + cuantoComioLaVezQueMasComio +
                ", hambre=" + hambre +
                '}';
    }
}
