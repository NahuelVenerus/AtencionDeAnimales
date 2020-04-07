package com.company.dispositivoAtencionAutomatica.comedero;

import com.company.dispositivoAtencionAutomatica.DispositivoAtencionAutomatica;
import com.company.animal.Animal;

public class ComederoNormal extends DispositivoAtencionAutomatica {

    private double cantidadComida;
    private double pesoMaximoSoportado;
    private int raciones;

    public ComederoNormal(double cantidadComida, double pesoMaximoSoportado, int raciones) {
        this.cantidadComida = cantidadComida;
        this.pesoMaximoSoportado = pesoMaximoSoportado;
        this.raciones = raciones;
    }

    @Override
    public void atender(Animal animal) {
        if (puedeAtender(animal)) {
            animal.comer(cantidadComida);
        }
    }

    @Override
    public boolean puedeAtender(Animal animal) {
        return super.puedeAtender(animal) && animal.isHambre() && animal.getPeso() < pesoMaximoSoportado;
    }

    @Override
    public void recargar() {
        if (necesitaRecarga()) {
            raciones = raciones + 30;
        }
    }

    @Override
    public boolean necesitaRecarga() {
        return raciones < 10;
    }

    public double getCantidadComida() {
        return cantidadComida;
    }

    public double getPesoMaximoSoportado() {
        return pesoMaximoSoportado;
    }

    public int getRaciones() {
        return raciones;
    }
}
