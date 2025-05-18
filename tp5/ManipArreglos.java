/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author CS
 */
public class ManipArreglos {

    // método para calcular la suma
    public static int calcularSuma(int[] arre) {
        int suma = 0;
        for (int num : arre) {
            suma += num;
        }
        return suma;
    }

    // método para encontrar el número mayor
    public static int encontrarMayor(int[] arre) {
        int max = arre[0];
        for (int num : arre) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // método para encontrar el número menor
    public static int encontrarMenor(int[] arre) {
        int min = arre[0];
        for (int num : arre) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // método para invertir el arreglo
    public static void imprimirArregloInvertido(int[] arre) {
        for (int i = arre.length - 1; i >= 0; i--) {
            System.out.print(arre[i] + " ");
        }
        System.out.println(); // salto de línea
    }
}