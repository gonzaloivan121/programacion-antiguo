/**
 * Programa que realice una ecuación de primer grado:
 * (ax + b = 0).
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 5
 */

public class Ejercicio05 {
  public static void main(String[] args) {
         
    System.out.println("ax + b = 0");
    System.out.print("Introduce el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Inctroduce el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());

    if (a == 0) {
      System.out.println("Esta ecuación no tiene solución en números reales.");
    } else {
      System.out.println("x = " + (-b/a));
      
    }
  }
}
