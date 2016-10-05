/**
 * Programa que pida dos números y luego los multiplique.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 3 - Ejercicio 1
 */

public class Ejercicio01 {
  public static void main(String[] args) {
    int x;
    int y;
    String linea;

    System.out.print("Teclee el primer número: ");
    linea = System.console().readLine();
    x = Integer.parseInt( linea );
    System.out.print("Y ahora el segundo: ");
    linea = System.console().readLine();
    y = Integer.parseInt( linea );
    
    System.out.println(x + "*" + y + "=" + (x * y));
  }
}
