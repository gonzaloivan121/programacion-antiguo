/**
 * Colorea el ejercicio anterior.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 1 - Ejercicio 05
 */

public class Ejercicio05 {
  public static void main(String[] args) {

    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";

    System.out.println(naranja + "Lunes\tMartes\tMiérc.\tJueves.\tViernes");
    System.out.println("======\t=======\t======\t======\t======");
    System.out.println(naranja + "S.INF" + verde + "\tPROG\tPROG" + celeste + "\tBDATO" + morado + "\tLM");
    System.out.println(naranja + "S.INF" + verde + "\tPROG\tPROG" + celeste + "\tBDATO" + morado + "\tLM");
    System.out.println(naranja + "S.INF" + verde + "\tPROG" + morado + "\tLM" + celeste + "\tBDATO" + blanco + "\tED");
    System.out.println(rojo + "FOL" + celeste + "\tBDATO" + morado + "\tLM" + verde + "\tPROG" + naranja + "\tS.INF");
    System.out.println(rojo + "FOL" + celeste + "\tBDATO" + blanco + "\tED" + verde + "\tPROG" + naranja + "\tS.INF");
    System.out.println(rojo + "FOL" + celeste + "\tBDATO" + blanco + "\tED" + verde + "\tPROG" + naranja + "\tS.INF");
  }
}
