/**
 * Programa que calcule el area de un rectangulo
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 3 - Ejercicio 5
 */

public class Ejercicio05 {
  public static void main(String[] args) {

    System.out.println("Calcular el área de un rectángulo");
    System.out.print("Introduce el valor de la base (cm): ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la altura (cm): ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.println("El área del rectángulo es " + (b * a) + "cm2");
  }
}
