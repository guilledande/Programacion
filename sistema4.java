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

public class sistema4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir día, mes y año
        System.out.print("Ingrese el día: ");
        int dia = sc.nextInt();

        System.out.print("Ingrese el mes (1 al 12): ");
        int mes = sc.nextInt();

        System.out.print("Ingrese el año: ");
        int año = sc.nextInt();

        // Mostrar la fecha
        System.out.println("Fecha ingresada: " + dia + "/" + mes + "/" + año);

        // Mostrar el trimestre
        if (mes >= 1 && mes <= 3) {
            System.out.println("Corresponde al Primer Trimestre.");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("Corresponde al Segundo Trimestre.");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("Corresponde al Tercer Trimestre.");
        } else if (mes >= 10 && mes <= 12) {
            System.out.println("Corresponde al Cuarto Trimestre.");
        } else {
            System.out.println("Mes inválido.");
        }

        sc.close();
    }
}
