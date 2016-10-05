/**
 * Programa que calcule el area de un triángulo
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 3 - Ejercicio 6
 */

public class Ejercicio06 {
  public static void main(String[] args) {

    System.out.println("Calcular el área de un triángulo");
    System.out.print("Introduzca el valor de la base (cm): ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Inroduce la altura (cm): ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("El área del triángulo es " + (base * altura)/2 + "cm2");
  }
}
