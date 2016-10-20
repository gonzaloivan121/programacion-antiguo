/**
 * Haz un programa que diga si un número introducido por teclado
 * es par y/o divisible entre 5.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 14
 */
public class Ejercicio14 {

  public static void main(String[] args) {
        
    System.out.print("Escriba un número entero: ");
    int n = Integer.parseInt(System.console().readLine());

    if ((n % 2) == 0) {
      System.out.print("El número es par");
    } else {
      System.out.print("El número es impar");
    }

    if ((n % 5) == 0) {
      System.out.println(" y divisible entre 5.");
    } else {
      System.out.println(" y no divisible entre 5.");
    }
  }
}
