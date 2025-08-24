/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico6;

/**
 *
 * @author CS
 */
import java.time.LocalDate;

public class ProductoAlimenticio extends Producto {
    private LocalDate fechaVencimiento;

    public ProductoAlimenticio(String nombre, double precio, LocalDate fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean estaProximoAVencer() {
        LocalDate hoy = LocalDate.now();
        int diasRestantes = fechaVencimiento.getDayOfYear() - hoy.getDayOfYear();
        return diasRestantes <= 5 && diasRestantes >= 0;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
        if (estaProximoAVencer()) {
            System.out.println("⚠️ ¡Este producto está próximo a vencer!");
        }
    }
}

