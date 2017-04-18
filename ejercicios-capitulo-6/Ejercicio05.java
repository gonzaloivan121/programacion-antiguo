/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 * 
 * Gonzalo Iván Chaparro Barese
 * Capítulo 6 - Ejercicio 5
 */
 
public class Ejercicio05 {
  public static void main(String[] args) {
    
    int numeros;
    int max = 100;
    int min = 199;
    int suma = 0;
    
    System.out.print("50 números aleatorios entre 100 y 199: \n");

    for(int i = 0; i < 50; i++) {
      numeros = (int)(Math.random() * 100) + 100;
      System.out.print(numeros + " ");
      suma += numeros;
      
      if (numeros < min) {
        min = numeros;
      }  
      
      if (numeros > max) {
        max = numeros;
      }  
    }
    
    System.out.println("\nEl mínimo es " + min + ". El máximo " + max + " y la media " + suma / 50);
  }
}
