/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico2;

/**
 *
 * @author Tomy Dande
 */
public class Reloj {
    // Atributos
     int hora;
     int minutos;
     int segundos;

    // Método para establecer la hora
    public void establecerHora(int h, int m, int s) {
        if (s>=60){
            s-=60;
            m++;
        }
        if (m>=60){
            m-=60;
            h++;
        }
        
        if (h>=24){
            h-=24;
           
        }
            hora = h;
            minutos = m;
            segundos = s;
        
    }

    // Método para mostrar la hora en formato HH:MM:SS
    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d\n", hora, minutos, segundos);
    }

    // Método para avanzar un segundo
    public void avanzarSegundo() {
        segundos ++;
       if ( segundos == 60 ){
           segundos =0; 
           minutos++;
           if(minutos ==60){
               minutos =0;
               hora++;
               if (hora ==24){
                   hora =0;
               }
           }
       }
    }

    // Método principal 
    public static void main(String[] args) {
        Reloj miReloj = new Reloj();
        miReloj.establecerHora(8, 61, 43);
        miReloj.mostrarHora();  // Muestra: 10:30:45

        miReloj.avanzarSegundo();
        miReloj.mostrarHora();  // Muestra: 10:30:46

        
    }
}
