/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author CS
 */
import java.util.Arrays;

public class ComparadorRendimiento {
    public static void comparar(int[] original) {
        int[] copia1 = Arrays.copyOf(original, original.length);
        int[] copia2 = Arrays.copyOf(original, original.length);

        long inicioBubble = System.nanoTime();
        ordenamiento.bubbleSort(copia1);
        long finBubble = System.nanoTime();

        long inicioSort = System.nanoTime();
        ordenamiento.ordenarConSort(copia2);
        long finSort = System.nanoTime();

        System.out.println("Tiempo Bubble Sort: " + (finBubble - inicioBubble) + " ns");
        System.out.println("Tiempo Arrays.sort(): " + (finSort - inicioSort) + " ns");
    }
}