/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico4;

/**
 *
 * @author CS
 */
public class tweets {
     public static void main (String[] args){
     
         String tweet = "Me gustaria saber cantar";
     System.out.println("Longitud: " +tweet.length());
     if (tweet.length() <= 280){
     System.out.println("Tweet valido");
     } else {
     System.out.println("Tweet demasiado largo");
     }
     
     String nuevoTweet = tweet.concat("#");
     System.out.println(nuevoTweet);
     
     String user= "@guille " +tweet;
     String arroba= user.substring(0,7);
     System.out.println(arroba);
     
          StringBuilder nuevo= new StringBuilder();
          nuevo.append(" Soy @Guille y");
            nuevo.append(" espero aprobar programacion");
     nuevo.append(" #java");
     
     System.out.println("El nuevo tweet es:" +nuevo.toString());
     
     }
}
