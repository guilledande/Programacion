/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico6;
 import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author CS
 */

   



public abstract class Proyecto {
    protected int fechaInicio;
    protected int fechaFin;
    protected String tarea;
    protected List<String> informe;
    protected String responsable;

    public Proyecto(int fechaInicio, int fechaFin, String responsable, String tarea) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.responsable = responsable;
        this.tarea = tarea;
        this.informe = new ArrayList<>();
        informe.add("El responsable: " + responsable + " cumplió con " + calcularTiempo() + " horas");
    }

    public abstract int calcularTiempo();
    public abstract String obtenerInforme();

    public void mostrarInforme() {
        System.out.println("Encargado de la " + tarea + " es " + responsable);
        for (String lista : informe) {
            System.out.println(lista);
        }
        System.out.println();
    }
}