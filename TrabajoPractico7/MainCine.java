/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TrabajoPractico7;

/**
 *
 * @author CS
 */


    /**
     * @param args the command line arguments
     */
    
       import java.util.Scanner;

public class MainCine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidadorReservas gestor = new ValidadorReservas(5); // sala con 5 asientos

        while (true) {
            gestor.mostrarAsientos();
            System.out.print("Ingrese el número de asiento a reservar (0 para salir): ");
            String entrada = sc.nextLine();

            if (entrada.equals("0")) {
                System.out.println("Usted decidio  salir.");
                break;
            }

            try {
                int asiento = Integer.parseInt(entrada);
                gestor.reservarAsientos(asiento);
                System.out.println(" Asiento reservado correctamente.");
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un número.");
            } catch (AsientoInvalidoException | AsientoOcupadoException | SalaLlenaException e) {
                System.out.println("X " + e.getMessage());
            }
        }
   }
    }
    


    
    

