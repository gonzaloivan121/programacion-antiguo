/**
 * Calcular el precio total a partir de la base imponible.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 2 - Ejercicio 6
 */

public class Ejercicio06 {
  public static void main(String[] args) {

    double baseImponible;
    baseImponible = 250;

    double iva;
    iva = 0.21;

  
    System.out.println("El total de la factura es: " + ((baseImponible *iva) + baseImponible));
  }
}
