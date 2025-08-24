/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico6;

/**
 *
 * @author CS
 */
public class ProductoRopa extends Producto {
    private String talle;

    public ProductoRopa(String nombre, double precio, String talle) {
        super(nombre, precio);
        this.talle = talle;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Talle: " + talle);
    }
}

