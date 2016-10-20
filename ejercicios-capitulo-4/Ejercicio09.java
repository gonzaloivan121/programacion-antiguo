/**
 * Programa que calcule una ecuación de segundo grado
 * (ax2 + bx + c = 0.)
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 9
 */

public class Ejercicio09 {
  
  public static void main(String[] args) {
    System.out.println("ax2 + bx + c = 0");
    double x;
    double x1;
    System.out.println("---------------------");
    System.out.print("Escribe el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Escribe el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.print("Escribe el valor de c: ");
    double c = Double.parseDouble(System.console().readLine());
    
    if (a == 0 && b != 0 && c != 0) {
      System.out.println("Estamos ante una ecuación de 1er grado.");
      System.out.println("x1 = x2 = " + (-c/b));
    } else if (a == 0 && b == 0 && c == 0) {
      System.out.print("Esta ecuación tiene infinitas soluciones.");
    } else if (c == 0) {
      x = -b/a;
      System.out.print("Las soluciones de la ecuación son: 0 y " + x);
    } else if ((b*b - 4*a*c) < 0) {
      System.out.print("Esta ecuación no tiene solucón (Se trata de una raíz negativa).");
    } else {
      x = (-b + Math.sqrt(b*b - (4*a*c))) / (2*a);
      x1 = (-b - Math.sqrt(b*b - (4*a*c))) / (2*a);
      System.out.print("Las soluciones de las ecuaciones son: " + x + " " + x1);
    }  
  }
}

