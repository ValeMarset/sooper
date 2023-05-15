package com.sooper.productos;


import com.sooper.IProducto;

public abstract class Producto implements IProducto {
    private String referencia;
    private int peso;
    private int volumen;


    public Producto(String referencia, int peso, int volumen){
        this.referencia = referencia;
        this.peso = peso;
        this.volumen = volumen;
    }

    @Override
    public String getReferencia() {
        return null;
    }

    @Override
    public int getPeso() {
        return 0;
    }

    @Override
    public int getVolumen() {
        return 0;
    }

    @Override
    public boolean tengoEspacio(IProducto p) {
        return false;
    }
}
