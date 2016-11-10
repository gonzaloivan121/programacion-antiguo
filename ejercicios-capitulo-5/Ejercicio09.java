/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 9
 */  
 
public class Ejercicio09 {

  public static void main(String[] args) {
    
    int numeroDeDigitos = 1, n, numeroIntroducido;

    System.out.print("Introduce un número entero y el programa devolverá el número de dígitos que tiene: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    n = numeroIntroducido;
    
    while (n > 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito(s).");

  }
}
