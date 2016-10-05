 /**
 * Programa que convierta de Mb a Kb.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 3 - Ejercicio 10
 */

public class Ejercicio10 {
  public static void main(String[] args) {

    System.out.print("Introduce el espacio en Mb: ");
    double mb = Double.parseDouble(System.console().readLine());
    System.out.println(mb + "Mb son " +  (mb * 1024) + "Kb.");
  }
}
