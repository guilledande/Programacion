/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico4;

/**
 *
 * @author CS
 */
public class interesCompuesto {
    public static void main (String[] args){
    
    double inversion = 10000;
    double tasaAnual= 0.06; // 6/100
    int años= 5;
    
    double montoFinal = inversion * Math.pow(1+tasaAnual, años);
    double montoRedondeado = Math.round(montoFinal*100)/100;
    
    System.out.println("El monto final despues de 5 años es : $"+montoRedondeado);
    
    
    }
}
