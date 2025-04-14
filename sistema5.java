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

public class sistema5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la coordenada X (distinta de 0): ");
        int x = scanner.nextInt();

        System.out.print("Ingrese la coordenada Y (distinta de 0): ");
        int y = scanner.nextInt();

        if (x == 0 || y == 0) {
            System.out.println("Las coordenadas no pueden ser cero.");
        } else if (x > 0 && y > 0) {
            System.out.println("El punto está en el PRIMER cuadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto está en el SEGUNDO cuadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto está en el TERCER cuadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("El punto está en el CUARTO cuadrante.");
        }

        scanner.close();
    }
}