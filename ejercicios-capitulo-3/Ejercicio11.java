 /**
 * Programa que convierta de Kb a Mb.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 3 - Ejercicio 11
 */

public class Ejercicio11 {
  public static void main(String[] args) {

    System.out.print("Introduce el espacio en Kb: ");
    double kb = Double.parseDouble(System.console().readLine());
    System.out.println(kb + "Kb son " +  (kb / 1024) + "Mb.");
  }
}
