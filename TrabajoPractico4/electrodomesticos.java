/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico4;

/**
 *
 * @author CS
 */
public class electrodomesticos {
    
     public static void main (String[] args){
     
         double reduccion = 64;
         
         double ahorro = Math.sqrt(reduccion);
         System.out.println("AHORRO:" + ahorro );
     
         //consumo de electrodomesticos
         double comsumo1= 69.9;
         double consumo2= 54.3;
         double consumo3= 3.9;
         
         //se calcula el max y min
         double max= Math.max(comsumo1, Math.max(consumo2, consumo3));
         double min= Math.min(comsumo1, Math.min(consumo2, consumo3));
    
     System.out.println("El consumo maximo es:" +max );
     System.out.println("El consumo minimo es:" + min );
  
     }
}
