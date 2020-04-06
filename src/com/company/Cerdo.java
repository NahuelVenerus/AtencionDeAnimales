package com.company;

public class Cerdo extends Animales {

    /*
    Cuando come, aumenta el peso en lo que comio - 200g. Si come menos de eso, no aumenta nada.
    Si come mas de 1 kg se le va el hambre, sino no.
    Quiero saber, para cada cerdo, cuanto comio la vez que comio.
    Siempre conviene vacunarlo.
    Cuando bebe se le va la sed y le da hambre.
    Al comer mas de 3 veces le da sed.
     */

    double peso;
    boolean sed;
    int contadorSed;
    boolean hambre;

    public Cerdo(double peso, boolean sed, boolean hambre) {
        this.peso = peso;
        this.sed = sed;
        this.hambre = hambre;
    }

    @Override
    double comer(double comida) {
        contadorSed++;
        if (comida < 0.2){
            return peso;
        } if (comida > 1){
            hambre = false;
            return peso = peso + comida;
        }
        return peso = peso + comida;
    }

    @Override
    double beber() {
        sed = false;
        hambre = true;
        return 0;
    }

    @Override
    double caminar() {
        return 0;
    }

    @Override
    boolean vacunar() {
        return estaVacunada = true;
    }

    @Override
    public String toString() {
        return "Cerdo{" +
                "peso=" + peso +
                ", estaVacunada=" + estaVacunada +
                ", sed=" + sed + "tiene hambre?" + hambre +
                '}';
    }
}
