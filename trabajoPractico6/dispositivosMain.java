/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoPractico6;

/**
 *
 * @author CS
 */
public class dispositivosMain {

    



    
    public static void main(String[] args) {
        lampara Lampara = new lampara("Lampara");
        televisor Televisor= new televisor("Televisor");
                camara Camara= new camara("Camara");

        //lampara
              System.out.println("LAMPARA");
        Lampara.encender();
        Lampara.apagar();
        Lampara.encender();
        Lampara.apagar();
        Lampara.encender();
                System.out.println(Lampara.historial);
                System.out.println("ESTADO ACTUAL " + Lampara.obtenerEstado());
                

        
        //televisor
              System.out.println("TELEVISOR");
       Televisor.apagar();
       Televisor.encender();
       Televisor.encender();
       Televisor.apagar();
       Televisor.encender();
               System.out.println(Televisor.historial);   
               System.out.println("ESTADO ACTUAL " + Televisor.obtenerEstado());

               
      //camara
      System.out.println("CAMARA");
      Camara.encender();
      Camara.apagar();
      Camara.encender();
      Camara.apagar();
       System.out.println(Camara.historial);
                      System.out.println("ESTADO ACTUAL " + Camara.obtenerEstado());

       
        
      

       

        
        
        
    }
    
}
