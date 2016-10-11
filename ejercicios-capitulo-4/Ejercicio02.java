/**
 * Programa que pida una hora y responda con 
 * "Buenos días", "Buenas tardes" o "Buenas noches"
 * según la hora que sea.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 2
 */

public class Ejercicio02 {
  public static void main(String[] args) {
    
    System.out.println("Introduce la hora desada:");
    
    int hora = Integer.parseInt(System.console().readLine());
        
    if (hora >= 6 && hora <= 12) {
      System.out.println("¡Buenos días!");
    } else if (hora >= 13 && hora <= 20) {
      System.out.println("¡Buenas tardes!");
    } else if ((hora >= 21 && hora <=24) || (hora <=5 && hora >= 0)) {
      System.out.println("¡Buenas noches!");
    } else {
      System.out.println("Hora inexistente.");
    }
  }  
}
