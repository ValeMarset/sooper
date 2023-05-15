package com.sooper;

import com.sooper.contenedores.Bolsa;
import com.sooper.contenedores.Caja;
import com.sooper.productos.Congelado;
import com.sooper.productos.Fresco;
import com.sooper.productos.Higiene;

public class Supermercado {
    public static void main(String[] args){
    IPedido miPedido = new Pedido("pedido001");

    IContenedor bolsa1 = new Bolsa("B1", 40, 25);
    IContenedor caja1 = new Caja("C1", 30, 50, 75);
    miPedido.addContenedor(bolsa1);
    miPedido.addContenedor(caja1);
    System.out.println("Mi pedido con contenedores: " + miPedido);

    IProducto manzanas = new Fresco("Manzana", 1000, 1500);
    IProducto helado = new Congelado("Helado", 800, 1000);
    IProducto papelHigienico = new Higiene("PPC", 500, 2500);
    IProducto peras = new Fresco ("Pera", 800, 1200);

    IContenedor contManzanas = miPedido.addProducto(manzanas);
    IContenedor contHelado = miPedido.addProducto(helado);
    IContenedor contPapelHigienico = miPedido.addProducto(papelHigienico);
    IContenedor contPeras = miPedido.addProducto(peras);
    System.out.println("Mi pedido con productos: " + miPedido);
    }
}
