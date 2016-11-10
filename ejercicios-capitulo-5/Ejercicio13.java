/**
 * Escribe un programa que lea una lista de diez números y determine
 * cuántos son positivos, y cuántos son negativos.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 13
 */ 
 
public class Ejercicio13 {

  public static void main(String[] args) {
  
    System.out.println("Introduce 10 números enteros: ");

    int negativos = 0;
    int positivos = 0;
    
    for (int i = 0; i < 10; i++) {
      if (Integer.parseInt(System.console().readLine()) < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    
    System.out.println("Has introducido " + positivos + " positivos y " + negativos + " negativos.");

  }
}
