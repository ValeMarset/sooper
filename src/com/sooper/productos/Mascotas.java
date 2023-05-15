package com.sooper.productos;

import com.sooper.IProducto;
import com.sooper.enums.Categoria;


public class Mascotas extends Producto {

    public Mascotas(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.MASCOTA;
    }

    @Override
    public boolean esCompatible(IProducto p) {
        return !Categoria.DROGUERIA.equals(p.getCategoria());
    }

}
