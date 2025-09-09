/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico7;

/**
 *
 * @author CS
 */
public class ContraseñaValida {
 
    //metodo para validar contraseña 
    public static void validarContraseña(String contraseña) throws ContraseñaInvalidaException{
    if (contraseña == null || contraseña.isEmpty())
        throw new ContraseñaInvalidaException("");
    
    
    //validar si yiene 8 caracteres
    if(contraseña.length() < 8){
throw new ContraseñaInvalidaException("La contraseña debe tener al menos 8 caracteres");
}
    
    
    //validar que contenga al menos un numero 
    boolean TieneNum= false;
    
    for(int i=0; i< contraseña.length();i++){
    
    if(Character.isDigit(contraseña.charAt(i))){
    TieneNum=true;
    break;
    }
    
    }
    
 if(!TieneNum){
throw new ContraseñaInvalidaException("La contraseña debe tener al menos 1 numero"); }
}
}

