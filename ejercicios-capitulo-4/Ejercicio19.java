/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número
 * entero que puede ser positivo o negativo. Se permiten números de
 * hasta 5 dígitos.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 19
 */
public class Ejercicio19 {

  public static void main(String[] args) {
    
    int n, cifras = 0;
    
    System.out.print("Escriba un número entero de hasta 5 cifras: ");
    n = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if ( n < 10 ) {
      cifras = 1;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      cifras = 2;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      cifras = 3;
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      cifras = 4;
    }
    
    if ( n >= 10000 ) {
      cifras = 5;
    }
    
    System.out.println("El número tiene " + cifras + " cifra(s).");
  }
}
