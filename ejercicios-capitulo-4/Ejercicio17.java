/**
 * Escribe un programa que diga cuál es la última cifra de un número
 * entero introducido por teclado.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 17
 */
public class Ejercicio17 {

  public static void main(String[] args) {
    
    System.out.print("Escriba un número entero: ");
    int n = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número es: " + (n % 10));
  }
}
