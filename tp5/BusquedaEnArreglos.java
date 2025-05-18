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
import java.util.Scanner;

public class BusquedaEnArreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo de cadenas
        String[] nombres = {"Ana", "Guille", "Hugo", "Tomi", "Jose", "Maria", "Juan"};
        
        // Ordenar el arreglo alfabéticamente
        Arrays.sort(nombres);

        // Mostrar el arreglo ordenado
        System.out.println("Arreglo ordenado: " + Arrays.toString(nombres));

        // Solicitar al usuario una cadena para buscar
        System.out.print("Ingrese una cadena para buscar: ");
        String busqueda = scanner.nextLine();

        // Buscar la cadena usando binarySearch
        int posicion = Arrays.binarySearch(nombres, busqueda);

        // Mostrar resultado
        if (posicion >= 0) {
            System.out.println("Cadena encontrada en la posición: " + posicion);
        } else {
            System.out.println("Cadena no encontrada en el arreglo.");
        }

        scanner.close();
    }
}

