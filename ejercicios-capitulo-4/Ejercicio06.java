/**
 * Programa que calcule el tiempo que tarda en caer un objeto desde
 * una altura h
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 6
 */

public class Ejercicio06 {
  
  final static double g = 9.81;
  
  public static void main(String[] args) {
         
    System.out.println("Tiempo de caída de un objeto.");
    System.out.print("Introduce la altura desde la que el objeto es soltado: ");
    Double h = Double.parseDouble(System.console().readLine());

    double s = Math.sqrt(2*h/g);

    System.out.printf("El objeto tardará %.2f segundos en caer.\n", s);
    
  }
}
