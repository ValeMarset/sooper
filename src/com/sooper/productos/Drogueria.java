package com.sooper.productos;

import com.sooper.IProducto;
import com.sooper.enums.Categoria;

public class Drogueria extends Producto {

    public Drogueria(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.DROGUERIA;
    }

    @Override
    public boolean esCompatible(IProducto p) {
        return !Categoria.ALIMENTACION.equals(p.getCategoria()) && !Categoria.MASCOTA.equals(p.getCategoria()) ;
    }

}
