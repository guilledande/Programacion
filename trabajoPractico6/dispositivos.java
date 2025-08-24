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

    


public abstract class dispositivos{
   protected String nombre ;
   protected boolean estado ;
   protected List <String> historial ; 
   
   public dispositivos(String nombre){
       this.nombre= nombre;
       this.estado= false ;
       this.historial= new ArrayList<>();
       this.historial.add("Dispositivo : "+ nombre + " esta apagado");
       
   }
   public abstract void encender();
      public abstract void apagar();
         public abstract String obtenerEstado();
   
   public void mostrarHistorial(){
       System.out.println("Historial del dispositivo :" + nombre);
       for(String lista :historial ){
           System.out.println(lista);
       }
   }
      
} //clase madre

