/**
 * Muestra los números múltiplos de 5 de 0 a 100
 * utilizando un bucle do-while.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 3
 */ 

public class Ejercicio03 {

  public static void main(String[] args) {
    
    int i = 0;
    
    do {
      System.out.println(i);
      i+=5;
    } while(i <= 100);
  }
}
