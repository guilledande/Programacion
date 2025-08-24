/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoPractico6;

/**
 *
 * @author CS
 */
import java.time.LocalDate;

public class MainProducto {
    public static void main(String[] args) {
        ProductoInterface manzana = new ProductoAlimenticio("Manzana", 150, LocalDate.of(2025, 8, 28));
        ProductoInterface laptop = new ProductoElectronico("Coompu", 120000, 24);
        ProductoInterface camisa = new ProductoRopa("Remera", 45000, "M");

        System.out.println("ALIMENTICIO ");
        manzana.mostrarDetalles();

        System.out.println("\n ELECTRONICO ");
        laptop.mostrarDetalles();

        System.out.println("\n ROPA ");
        camisa.mostrarDetalles();
    }
}

