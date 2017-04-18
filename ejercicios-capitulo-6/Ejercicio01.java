/**
 * Escribe un programa que muestre la tirada de tres dados.
 * Se debe mostrar también la suma total (los puntos que suman
 * entre los tres dados).
 * 
 * Gonzalo Iván Chaparro Barese
 * Capítulo 6 - Ejercicio 1
 */
 
public class Ejercicio01 {
  public static void main(String[] args) {
    
    int tirada;
    int suma = 0;
    
    System.out.print("Tirada de tres dados: ");

    for(int i = 0; i < 3; i++) {
      tirada = (int)(Math.random() * 6) + 1;
      System.out.print(tirada + " ");
      suma += tirada;
    }

    System.out.println("\nSuma: " + suma);
  }
}
