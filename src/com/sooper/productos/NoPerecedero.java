package com.sooper.productos;

import com.sooper.Caducable;

import java.time.LocalDate;

public class NoPerecedero extends Alimentacion implements Caducable {

    private static final int ANYOS_CADUCIDAD = 5;

    private LocalDate fechaFabricacion;

    public NoPerecedero(String referencia, int peso, int volumen, LocalDate fechaFabricacion) {
        super(referencia, peso, volumen);
        this.fechaFabricacion = fechaFabricacion;
    }

    @Override
    public boolean estaCaducado() {
        return LocalDate.now().isBefore(fechaFabricacion.plusYears(ANYOS_CADUCIDAD));
    }

}
