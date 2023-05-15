package com.sooper.productos;

import com.sooper.IProducto;
import com.sooper.enums.Categoria;

public class Alimentacion extends Producto{

    public Alimentacion(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.ALIMENTACION;
    }

    @Override
    public boolean esCompatible(IProducto p) {
        return false;
    }
}
