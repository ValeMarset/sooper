package com.sooper;

import com.sooper.enums.TipoContenedor;

import java.util.Set;

public interface IContenedor {

    String getReferencia();

    int getVolumen();

    int volumenDisponible();

    int getResistencia();

    Set<IProducto> getProductos();

    TipoContenedor getTipo();

    boolean meter(IProducto producto);

    boolean resiste(IProducto producto);

    int getSuperficie();

}
