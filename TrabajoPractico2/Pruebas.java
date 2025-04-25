/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TrabajoPractico2;

/**
 *
 * @author Tomy Dande
 */
public class Pruebas {
    
    String nombre;
    float peso;
    float altura;
    
    Pruebas(String nombreDepersona, float pesoPersona, float alturaPersona){
        
        nombre = nombreDepersona;
        peso = pesoPersona;
        altura = alturaPersona; 
    }
    
    public static void main (String[] args){
        
        Pruebas persona1 = new Pruebas("Guille", 68.5f, 1.70f); 
        Pruebas persona2 = new Pruebas ("Jose", 60, 1.67f);
        
        System.out.println(persona1.nombre);
         System.out.println(persona1.peso);
          System.out.println(persona1.altura);
          
          
           System.out.println(persona2.nombre);
         System.out.println(persona2.peso);
          System.out.println(persona2.altura);
        
    }
}

    

