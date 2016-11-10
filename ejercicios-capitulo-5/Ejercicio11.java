/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y
 * el cubo de los 5 primeros números enteros a partir de uno que se
 * introduce por teclado.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 11
 */ 

public class Ejercicio11 {

  public static void main(String[] args) {
    
    System.out.print("Introduce un número: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      System.out.printf("%5d %7d %9d\n", i, i * i, i * i * i);
    }
  }
}
