/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico2;

/**
 *
 * @author Tomy Dande
 */
public class Empleados {
    int legajo;
    String nombre;
    double salario;
    
    static int totalEmpleados = 0;  // Cuenta total de empleados
    static int siguienteLegajo = 1; // Para asignar legajos únicos

    // Constructor: asigna nombre, salario y un legajo único
    public Empleados(String nombre, double salario) {
        this.legajo = siguienteLegajo++;
        this.nombre = nombre;
        this.salario = salario;
        totalEmpleados++;
    }

    // Aumenta el salario en un cierto porcentaje y muestra el motivo
    public void aumentarSalarioPorcentaje(double porcentaje, String motivo) {
        salario += salario * (porcentaje / 100);
        System.out.println("Aumento del " + porcentaje + "% por " + motivo);
    }

    // Aumenta el salario en un monto fijo y muestra el motivo
    public void aumentarSalarioMonto(double monto, String motivo) {
        salario += monto;
        System.out.println("Aumento fijo de " + monto + " por " + motivo);
    }

    // Muestra la información del empleado
    public void mostrarInfo() {
        System.out.println("Legajo: " + legajo + ", Nombre: " + nombre + ", Salario: " + salario);
    }

    public static void main(String[] args) {
        Empleados e1 = new Empleados("Juan", 1000);
        Empleados e2 = new Empleados("Guille", 1200);

        e1.mostrarInfo();
        e2.mostrarInfo();
        
        e1.aumentarSalarioPorcentaje(5, "Buen trabajo mensual");
        e2.aumentarSalarioMonto(100, "Mensual establecido");

        e1.mostrarInfo();
        e2.mostrarInfo();

        System.out.println("Total de empleados: " + totalEmpleados);
    }
}
