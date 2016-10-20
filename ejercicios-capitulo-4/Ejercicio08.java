/**
 * Programa que calcule la media de tres notas y la nota del boletín
 * (insuficiente, suficiente, bien, notable o sobresaliente).
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 8
 */

public class Ejercicio08 {
  
  public static void main(String[] args) {
         
    System.out.print("Introducea la primera nota: ");
    Double nota01 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la segunda nota: ");
    Double nota02 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la tercera nota: ");
    Double nota03 = Double.parseDouble(System.console().readLine());

    double media = (nota01 + nota02 + nota03) / 3;

    System.out.printf("La media es de %.2f\n", media);
    
    if (media < 5) {
      System.out.print("Insuficiente.");
    }
    
    if ((media >= 5) && (media < 6)) {
      System.out.print("Suficiente.");
    }
    
    if ((media >= 6) && (media < 7)) {
      System.out.print("Bien.");
    }
    
    if ((media >= 7) && (media < 9)) {
      System.out.print("Notable.");
    }
    
    if (media >= 9) {
      System.out.print("Sobresaliente.");
      
    }
  }
}
