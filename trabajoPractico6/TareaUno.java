/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico6;



public class TareaUno extends Proyecto implements Informe {

    public TareaUno(int fechaInicio, int fechaFin, String responsable, String tarea) {
        super(fechaInicio, fechaFin, responsable, tarea);
    }

    @Override
    public int calcularTiempo() {
        return this.fechaFin - this.fechaInicio; // cálculo simple
    }

    @Override
    public String obtenerInforme() {
        return "Tarea: " + this.tarea + " | Responsable: " + this.responsable +
               " | Tiempo estimado: " + calcularTiempo() + " horas";
    }
}