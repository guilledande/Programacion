/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author CS
 */
import java.util.Scanner;

public class ManipArreglosMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pido cantidad de elementos
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        // cargo arreglo
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // uso métodos de la otra clase
        System.out.println("Suma de los elementos: " + ManipArreglos.calcularSuma(arreglo));
        System.out.println("Número mayor: " + ManipArreglos.encontrarMayor(arreglo));
        System.out.println("Número menor: " + ManipArreglos.encontrarMenor(arreglo));

        System.out.println("Arreglo invertido:");
        ManipArreglos.imprimirArregloInvertido(arreglo);

        scanner.close();
    }
}