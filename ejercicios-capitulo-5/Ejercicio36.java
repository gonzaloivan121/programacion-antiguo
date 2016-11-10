/**
 * 
 * 
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 36
 */ 

public class Ejercicio36 {

  public static void main(String[] args) {

    System.out.print("Introduce un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    // Voltea el número introducido.
    long numero = numeroIntroducido;
    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    
    if (volteado == numeroIntroducido) {
      System.out.println("El número " + numeroIntroducido + " es capicúa.");
    } else {
      System.out.println("El número " + numeroIntroducido + " no es capicúa.");
    }
  }
}


