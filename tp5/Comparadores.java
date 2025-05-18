/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author CS
 */
import java.util.Comparator;

public class Comparadores {
    public static Comparator<Producto> porNombre = (Producto p1, Producto p2) -> p1.getNombre().compareTo(p2.getNombre());

    public static Comparator<Producto> porStock = (Producto p1, Producto p2) -> Integer.compare(p1.getStock(), p2.getStock());
}
