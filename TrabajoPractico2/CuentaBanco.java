
package TrabajoPractico2;

/**
 *
 * @author Tomy Dande
 */
public class CuentaBanco {
    
    String numCuenta;
    String nombre;
    double saldo;
    
    CuentaBanco(String numeroDecuenta, String nombreTitular, double saldoCuenta){
        
        numCuenta= numeroDecuenta;
        nombre= nombreTitular;
        saldo= saldoCuenta;
    }
 
//metodo para depositar
void deposito( double monto){
if (monto >0){
saldo += monto;
System.out.println("Deposito exitoso, su saldo actual es:" +saldo);
}else {
System.out.println("No puede ser cero:" );
}
}

void retiro( double monto){
if (monto >0){
if (saldo>= monto){
saldo-= monto;
System.out.println("Retiro exitoso, su saldo actual es:" +saldo );
}else{
System.out.println("Saldo insuficiente" );
}
}
}

double consultaSaldo(){
return 0;
}




public static void main (String[] args){

CuentaBanco persona = new CuentaBanco("55555","Guillermina",500.0);
System.out.println("El numero de cuenta es:");
System.out.println(persona.numCuenta);
System.out.println("El nombre del titular es:");
System.out.println(persona.nombre);
System.out.println("El saldo es:");
System.out.println(persona.saldo);


persona.deposito(200);
persona.retiro(100);


System.out.println("Su saldo actual es:" );
System.out.println(persona.saldo);
}


}