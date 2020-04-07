package com.company.dispositivoAtencionAutomatica;

import com.company.animal.Animal;

public abstract class DispositivoAtencionAutomatica {

    public boolean puedeAtender(Animal animal) {
        return !necesitaRecarga();
    }

    public void atender(Animal animal) {
    }

    public boolean necesitaRecarga() {
        return false;
    }

    public void recargar() {
    }

}
