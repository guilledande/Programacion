/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TrabajoPractico7;

/**
 *
 * @author CS
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class MainCalificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        
        
        try{
             System.out.println("Ingrese la calificacion");
        double calificacion= scanner.nextDouble();
        
        ValidadorCalificacion.validarCal(calificacion);
        System.out.println("Calificacion valida");
        }catch (InputMismatchException  e){
        System.out.println("Error, debe ingresar un numero valido");
        }catch (CalificacionInvalidaException e) {
            System.out.println("Error  "+ e.getMessage() );
        }
    }
}
    