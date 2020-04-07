package com.company.estacionDeServicio;

import com.company.animal.Animal;
import com.company.dispositivoAtencionAutomatica.DispositivoAtencionAutomatica;

import java.util.List;

public class EstacionDeServicio {

    private List<DispositivoAtencionAutomatica> dispositivos;

    public EstacionDeServicio(List<DispositivoAtencionAutomatica> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public boolean puedeAtender(Animal animal) {
        return dispositivos.stream().anyMatch(dispositivo -> dispositivo.puedeAtender(animal));
    }
}
