/**
 * Programa que calcule la media de tres notas.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 7
 */

public class Ejercicio07 {
  
  public static void main(String[] args) {
         
    System.out.print("Introducea la primera nota: ");
    Double nota01 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la segunda nota: ");
    Double nota02 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la tercera nota: ");
    Double nota03 = Double.parseDouble(System.console().readLine());

    double media = (nota01 + nota02 + nota03) / 3;

    System.out.printf("La media es de %.2f\n", media);
    
  }
}
