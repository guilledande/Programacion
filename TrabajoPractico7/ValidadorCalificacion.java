/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico7;

/**
 *
 * @author CS
 */
public class ValidadorCalificacion {
    //mtetodo para validar la nota
    
    public static void validarCal(double calificacion) throws CalificacionInvalidaException{
        
        if(calificacion >10 || calificacion< 0)throw new CalificacionInvalidaException("Debe ser entre 0 y 10");
        
    }

}
