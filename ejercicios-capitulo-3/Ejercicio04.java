/**
 * Programa que sume, reste, multiplique y divida dos
 * números introducidos por teclado
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 3 - Ejercicio 4
 */

public class Ejercicio04 {
  public static void main(String[] args) {
    int x;
    int y;
    String linea;

    System.out.print("Introduce el primer número: ");
    linea = System.console().readLine();
    x = Integer.parseInt( linea );
    System.out.print("Introduzca el segundo: ");
    linea = System.console().readLine();
    y = Integer.parseInt( linea );
    
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));
    System.out.println("x / y = " + (x / y));
    System.out.println("x * y = " + (x * y));
  }
}
