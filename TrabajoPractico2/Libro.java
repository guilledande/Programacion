/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico2;

/**
 *
 * @author Tomy Dande
 */
public class Libro {
    
    String titulo;
    String autor;
    String isbn;
    boolean disp;
    
    Libro(String titulo, String autor, String isbn){
        
        this.titulo= titulo;
        this.autor= autor;
        this.isbn=isbn;
        this.disp= true;
        
    }
    
    
    //metodo para prestar
    
    void prestar(){
        if (disp){
            disp= false;
            System.out.println("Ahora esta prestado");
            
        }else {System.out.println("El libro ya esta prestado");
                }
    }
    
    //metodo para devolver
    void devolver(){
        if(!disp){
            disp=true;
             System.out.println("Ya lo devolvieron");
        }else {System.out.println("El libro ya esta disponible");
                }
    }
    
    
    //mostrar info
    void mostrarInfo(){
        String estado = disp ? "Disponible" : "Prestado";
         System.out.println("Titulo: " + titulo);
          System.out.println("Autor: " + autor);
           System.out.println("ISBN: " +isbn);
            System.out.println("Estado: " +estado);
         
    }
    
    
    
    public static void main (String[] args){
        Libro libro1 = new Libro ("HARRY POTTER","Guillermina","1111");
        
        libro1.mostrarInfo();
        libro1.prestar();
        libro1.mostrarInfo();
        libro1.devolver();
        libro1.mostrarInfo();
    }

            }