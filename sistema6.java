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

public class sistema6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de triángulos: ");
        int n = scanner.nextInt();

        int equiCount = 0;
        int isoCount = 0;
        int escaCount = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Triángulo " + i + ":");
            System.out.print("Lado 1: ");
            int lado1 = scanner.nextInt();
            System.out.print("Lado 2: ");
            int lado2 = scanner.nextInt();
            System.out.print("Lado 3: ");
            int lado3 = scanner.nextInt();

            // Clasificación
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un triángulo equilátero.");
                equiCount++;
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Es un triángulo isósceles.");
                isoCount++;
            } else {
                System.out.println("Es un triángulo escaleno.");
                escaCount++;
            }
        }

        // Mostrar cantidad de cada tipo
        System.out.println("\nResumen:");
        System.out.println("Equiláteros: " + equiCount);
        System.out.println("Isósceles: " + isoCount);
        System.out.println("Escalenos: " + escaCount);

        // Determinar tipo con menor cantidad
        String menorTipo;
        if (equiCount <= isoCount && equiCount <= escaCount) {
            menorTipo = "Equilátero";
        } else if (isoCount <= equiCount && isoCount <= escaCount) {
            menorTipo = "Isósceles";
        } else {
            menorTipo = "Escaleno";
        }

        System.out.println("El tipo de triángulo con menor cantidad es: " + menorTipo);

        scanner.close();
    }
}
