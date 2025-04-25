
package TrabajoPractico2;

/**
 *
 * @author Tomy Dande
 */
public class Calculadora {

double sumar(double a, double b){
return a + b; 
}

double restar(double a, double b){
return a - b; 
}

double multiplicar(double a, double b){
return a * b; 
}

double dividir(double a, double b){
if (b!=0){
return a / b; 
} else {
System.out.println("No se puede dividir en cero");
}
    return 0;


}
}
   