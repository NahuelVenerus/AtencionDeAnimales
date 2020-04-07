package com.company.dispositivoAtencionAutomatica.bebedero;

import com.company.dispositivoAtencionAutomatica.DispositivoAtencionAutomatica;
import com.company.animal.Animal;

public class Bebedero extends DispositivoAtencionAutomatica {

    private int animalesAtendidos = 0;

    @Override
    public boolean puedeAtender(Animal animal) {
        return super.puedeAtender(animal) && animal.isSed();
    }

    @Override
    public void atender(Animal animal) {
        if (puedeAtender(animal)) {
            animal.beber();
            animalesAtendidos++;
        }
    }

    @Override
    public boolean necesitaRecarga() {
        return animalesAtendidos == 20;
    }

    @Override
    public void recargar() {
        if (necesitaRecarga()) {
            animalesAtendidos = 0;
        }
    }
}
