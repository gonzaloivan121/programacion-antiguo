/**
 * Escribe un programa que diga cuál es la primera cifra de un número
 * entero introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 18
 */
public class Ejercicio18 {

  public static void main(String[] args) {
    
    int n, cifra = 0;
    
    System.out.print("Escriba un número entero de hasta 5 cifras: ");
    n = Integer.parseInt(System.console().readLine());
    
    if ( n < 10 ) {
      cifra = n;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      cifra = n / 10;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      cifra = n / 100;
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      cifra = n / 1000;
    }
    
    if ( n >= 10000 ) {
      cifra = n / 10000;
    }
    
    System.out.println("La primera cifra del número es: " + cifra);
  }
}
