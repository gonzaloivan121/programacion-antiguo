/**
 * Escribe un programa que pinte por pantalla una pirámide hueca.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 1 - Ejercicio 07
 */

public class Ejercicio07 {
  public static void main(String[] args) {

    System.out.println("\033[34m"); // azul
    
    System.out.println("    *");    
    System.out.println("   * *");
    System.out.println("  *   *");
    System.out.println(" *     *");
    System.out.println("*********");
    
    System.out.println("\033[37m"); // blanco
  }
}
