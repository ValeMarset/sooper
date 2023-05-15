package com.sooper.productos;

import com.sooper.Caducable;

import java.time.LocalDate;

public class Congelado extends Alimentacion implements Caducable {

    private LocalDate caducidad;

    public Congelado(String referencia, int peso, int volumen, LocalDate caducidad) {
        super(referencia, peso, volumen);
    }

    @Override
    public boolean estaCaducado() {
        return caducidad.isBefore(LocalDate.now());
    }

}
