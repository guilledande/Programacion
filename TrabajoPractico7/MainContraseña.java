/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TrabajoPractico7;

/**
 *
 * @author CS
 */


   import java.util.Scanner;
public class MainContraseña {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una contraseña: ");
        String contraseña = scanner.nextLine();

        try {
            ContraseñaValida.validarContraseña(contraseña);
            System.out.println("Contraseña válida ");
        } catch (ContraseñaInvalidaException e) {
            System.out.println("Error  "+ e.getMessage() );
        }
    }
}

