/**
 * Conversor de pesetas a euros.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 3 - Ejercicio 3
 */

public class Ejercicio03 {
  public static void main(String[] args) {

    System.out.print("Introduce el valor en pesetas: ");
    int pesetas = Integer.parseInt(System.console().readLine());

    double euros = pesetas / 166.386;

    System.out.printf("%d pesetas = %.2f€.", pesetas, euros);
  }
}
