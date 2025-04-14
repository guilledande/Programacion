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

public class sistema3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número positivo (1 a 99): ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 9) {
            System.out.println("El número tiene un dígito.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El número tiene dos dígitos.");
        } else {
            System.out.println("Número inválido. Debe estar entre 1 y 99.");
        }

        scanner.close();
    }
}
