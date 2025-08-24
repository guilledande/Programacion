/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico6;

/**
 *
 * @author CS
 */

    public class televisor extends dispositivos {
    public televisor(String nombre){
        super(nombre);
        
    }
    @Override
    public void encender(){
        if(!estado){
            estado= true ;
            historial.add("Televisor se ha encendido ");
        }   
    }
    
    @Override
    public void apagar(){
        if(estado){
            estado= false ;
            historial.add("Televisor se ha apagado");   
        }
    }
    
    @Override
    public String obtenerEstado(){
        if(estado){
            return "Encendido";
            
        }else{
            return "Apagado";
        
        }
    }
    
}

