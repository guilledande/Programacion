/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoPractico6;

/**
 *
 * @author CS
 */
public class MainTareas {
    public static void main(String[] args) {
        TareaUno t1 =new TareaUno(10 , 23 ,"Marta diaz", "Tarea 1");
        TareaDos t2 =new TareaDos(1 , 23 ,"Enzo Lopez","Tarea 2");
        TareaTres t3 =new TareaTres(23 , 28 ,"Roberto Villafañe", "Tarea 3");

        System.out.println("=== Informe del Proyecto ===" );//Tarea1
        t1.calcularTiempo();
        t1.obtenerInforme();
        t1.mostrarInforme();



        t2.calcularTiempo();
        t2.obtenerInforme();
        t2.mostrarInforme();

        t3.calcularTiempo();
        t3.obtenerInforme();
        t3.mostrarInforme();



}
}