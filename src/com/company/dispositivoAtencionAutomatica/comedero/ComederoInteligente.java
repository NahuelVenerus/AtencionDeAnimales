package com.company.dispositivoAtencionAutomatica.comedero;

import com.company.dispositivoAtencionAutomatica.DispositivoAtencionAutomatica;
import com.company.animal.Animal;

public class ComederoInteligente extends DispositivoAtencionAutomatica {

    private int capacidadMaxima;
    private int kilosDeComida;

    public ComederoInteligente(int capacidadMaxima, int kilosDeComida) {
        this.capacidadMaxima = capacidadMaxima;
        this.kilosDeComida = kilosDeComida;
    }

    @Override
    public void atender(Animal animal) {
        if (puedeAtender(animal)) {
            animal.comer(animal.getPeso() / 100);
        }
    }

    @Override
    public boolean puedeAtender(Animal animal) {
        return super.puedeAtender(animal) && animal.isHambre();
    }

    @Override
    public void recargar() {
        if (necesitaRecarga()) {
            kilosDeComida = capacidadMaxima;
        }
    }

    @Override
    public boolean necesitaRecarga() {
        return kilosDeComida < 15;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getKilosDeComida() {
        return kilosDeComida;
    }
}
