/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author CS
 */
import java.util.*;

public class MainProductos {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Mouse", 1500, 20));
        productos.add(new Producto("Teclado", 2500, 10));
        productos.add(new Producto("Monitor", 35000, 5));
        productos.add(new Producto("Auriculares", 2200, 15));

        System.out.println("Orden por precio (Comparable):");
        Collections.sort(productos); // Orden por precio (Comparable)
        productos.forEach(System.out::println);

        System.out.println("\nOrden por nombre (Comparator):");
        Collections.sort(productos, Comparadores.porNombre);
        productos.forEach(System.out::println);

        System.out.println("\nOrden por stock (Comparator):");
        Collections.sort(productos, Comparadores.porStock);
        productos.forEach(System.out::println);
    }
}
