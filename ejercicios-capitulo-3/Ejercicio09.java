/**
 * Programa que calcule el volumen de un cono.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 3 - Ejercicio 9
 */


public class Ejercicio09 {
  
    static final double pi = 3.141592654;
  
  public static void main(String[] args) {

    System.out.println("Volumen de un cono = (1/3)πr^2h");
    System.out.print("Introduce la altura (cm): ");
    double h = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el radio (cm): ");
    double r = Double.parseDouble(System.console().readLine());
    double v = (1.0/3.0) * pi * r * r * h;
    System.out.println("El volumen del cono es de " +  v + "cm3");
  }
}
