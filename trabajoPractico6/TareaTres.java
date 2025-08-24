/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico6;

/**
 *
 * @author CS
 */

public class TareaTres extends Proyecto implements Informe {

    public TareaTres(int fechaInicio, int fechaFin, String responsable, String tarea) {
        super(fechaInicio, fechaFin, responsable, tarea);
    }

    @Override
    public int calcularTiempo() {
        return (this.fechaFin - this.fechaInicio) + 5; // Simulación: suma de 5 horas extra
    }

    @Override
    public String obtenerInforme() {
        return "Tarea: " + this.tarea + " | Responsable: " + this.responsable +
               " | Tiempo estimado: " + calcularTiempo() + " horas";
    }
}