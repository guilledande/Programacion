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

public class sistema2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ingresar las tres notas
        System.out.print("Ingrese la nota del primer parcial: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese la nota del segundo parcial: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese la nota del tercer parcial: ");
        double nota3 = scanner.nextDouble();

        // Calcular promedio
        double promedio = (nota1 + nota2 + nota3) / 3;

        // Mostrar promedio
        System.out.printf("Promedio: %.2f\n", promedio);

        // Verificar si promociona
        if (promedio >= 8) {
            System.out.println("El alumno está promocionado.");
        } else {
            System.out.println("El alumno no está promocionado.");
        }

        scanner.close();
    }
}