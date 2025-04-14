/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

/**
 *
 * @author Tomy Dande
 */
import java.util.Scanner;

public class sistema1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la nota del alumno (1 a 10): ");
        int nota = scanner.nextInt();
        
        if (nota < 4) {
            System.out.println("El alumno desaprobó la materia.");
        } else if (nota >= 4 && nota < 10) {
            System.out.println("El alumno aprobó la materia.");
        } else if (nota == 10) {
            System.out.println("El alumno es sobresaliente.");
        } else {
            System.out.println("Nota inválida. Debe estar entre 1 y 10.");
        }
        
        scanner.close();
    }
}
