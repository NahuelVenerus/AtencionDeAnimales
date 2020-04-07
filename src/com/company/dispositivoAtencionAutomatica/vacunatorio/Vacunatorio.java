package com.company.dispositivoAtencionAutomatica.vacunatorio;

import com.company.dispositivoAtencionAutomatica.DispositivoAtencionAutomatica;
import com.company.animal.Animal;

public class Vacunatorio extends DispositivoAtencionAutomatica {

    private int cantidadVacunas;

    @Override
    public boolean puedeAtender(Animal animal) {
        return super.puedeAtender(animal) && animal.convieneVacunar();
    }

    @Override
    public void atender(Animal animal) {
        if (puedeAtender(animal)) {
            animal.vacunar();
        }
    }

    @Override
    public boolean necesitaRecarga() {
        return cantidadVacunas == 0;
    }

    @Override
    public void recargar() {
        if (necesitaRecarga()) {
            cantidadVacunas = 50;
        }
    }
}
