/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico2;

/**
 *
 * @author Tomy Dande
 */
public class Maincalc {
     
    public static void main (String[] args){
        Calculadora calculadora = new Calculadora (); 
        
       double resultadoSuma = calculadora.sumar(26,4);
System.out.println("El resultado de la suma es: " +resultadoSuma);

double resultadoResta = calculadora.restar(2,4);
System.out.println("El resultado de la resta es: " +resultadoResta);

double resultadoMult = calculadora.multiplicar(4,4);
System.out.println("El resultado de la multiplicacion es: " +resultadoMult);        

double resultadoDivision = calculadora.dividir(36,9);
System.out.println("El resultado de la division es: " +resultadoDivision);

}
    }
    





