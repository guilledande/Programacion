/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico6;

/**
 *
 * @author CS
 */


    public class lampara extends dispositivos {
    public lampara(String nombre){
        super(nombre);
        
    }
    
    @Override
    public void encender(){
        if(!estado){
            estado= true ;
            historial.add("La lampara se ha prendido ");
        }   
    }
    
    @Override
    public void apagar(){
        if(estado){
            estado= false ;
            historial.add("La lampara se ha apagado");   
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
