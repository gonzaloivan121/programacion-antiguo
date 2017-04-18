/**
 * Escribe un programa que muestre por pantalla 100 números enteros separa-
 * dos por un espacio. Los números deben estar generados de forma aleatoria
 * en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
 * 
 * Gonzalo Iván Chaparro Barese
 * Ejercicio 25 - Capítulo 6
 * 
 */
 
public class Ejercicio25 {
  public static void main(String[] args) {

    for (int i = 0; i < 100; i++) {
      int numero = (int)(Math.random() * 191) + 10;

      // Comprueba si el número es primo
      boolean esPrimo = true;
      for (int j = 2; j < numero; j++) {
        if ((numero % j) == 0) {
          esPrimo = false;
        }
      }
      
      if (esPrimo) {
        System.out.print(" #" + numero + "# ");
      } else if ((numero % 5) == 0) {// múltiplo de 5
        System.out.print(" [" + numero + "] ");
      } else {
        System.out.print(" " + numero + " ");
      }
    } // for
  }
}
