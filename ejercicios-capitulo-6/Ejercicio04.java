/**
 * Muestra 20 números enteros aleatorios entre 0 y 10
 * (ambos incluidos) separados por espacios.
 * 
 * Gonzalo Iván Chaparro Barese
 * Capítulo 6 - Ejercicio 4
 */
 
public class Ejercicio04 {
  public static void main(String[] args) {
    
    int numeros;
    
    System.out.print("20 números aleatorios entre 0 y 10: ");

    for(int i = 0; i < 20; i++) {
      numeros = (int)(Math.random() * 10);
      System.out.print(numeros + " ");
    }
  }
}
