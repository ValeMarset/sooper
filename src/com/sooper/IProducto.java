package com.sooper;

import com.sooper.contenedores.Contenedor;
import com.sooper.enums.Categoria;

public interface IProducto {

    String getReferencia();

    int getPeso();

    int getVolumen();

    Categoria getCategoria();

    boolean esCompatible(IProducto p);

    boolean tengoEspacio(IContenedor contenedor);

    void meter(IContenedor contenedor);
}

