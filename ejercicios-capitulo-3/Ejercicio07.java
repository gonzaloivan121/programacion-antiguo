/**
 * Programa que calcule el total de una factura a partir de la base imponible
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 3 - Ejercicio 7
 */

public class Ejercicio07 {
  public static void main(String[] args) {

    System.out.print("Introduce la base imponible (precio sin IVA): ");
    double baseImponible = Double.parseDouble(System.console().readLine());

    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
    System.out.printf("-----------------------\n");
    System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));
  }
}
