/**
 * Escribe un programa que diga si un número introducido por teclado
 * es o no primo. Un número primo es aquel que sólo es divisible entre
 * él mismo y la unidad.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 16
 */  
 
public class Ejercicio16 {

  public static void main(String[] args) {
            
    System.out.print("Introduce un número entero y el programa dirá si es primo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    boolean esPrimo = true;
    
    for (int i = 2; i < numeroIntroducido; i++) {
      if ((numeroIntroducido % i) == 0) {
        esPrimo = false;
      }
    }
        
    if (esPrimo) {
      System.out.println("El número es primo.");
    } else {
      System.out.println("El número no es primo.");
    }

  }
}
