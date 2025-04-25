
package TrabajoPractico2;

/**
 *
 * @author Tomy Dande
 */

public class Ejemplo {

    // Método para sumar dos números e imprimir el resultado
    public void sumar(double a, double b) {
        System.out.println("Suma: " + (a + b));
    }

    // Método para restar dos números e imprimir el resultado
    public void restar(double a, double b) {
        System.out.println("Resta: " + (a - b));
    }

    // Método para multiplicar dos números e imprimir el resultado
    public void multiplicar(double a, double b) {
        System.out.println("Multiplicación: " + (a * b));
    }

    // Método para dividir dos números e imprimir el resultado
    public void dividir(double a, double b) {
        if (b != 0) {
            System.out.println("División: " + (a / b));
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.sumar(5, 3);          
        calculadora.restar(10, 4);        
        calculadora.multiplicar(6, 7);    
        calculadora.dividir(10, 2);      
        
    }
}