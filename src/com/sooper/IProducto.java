package com.sooper;

import com.sooper.enums.Categoria;

public interface IProducto {

    String getReferencia();

    int getPeso();

    int getVolumen();

    Categoria getCategoria();

    boolean esCompatible(IProducto p);

    boolean tengoEspacio(IProducto p);

}
