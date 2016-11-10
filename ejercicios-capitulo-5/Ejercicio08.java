/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 8
 */  
 
public class Ejercicio08 {

  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero y el programa le devolverá su tabla de multiplicar: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
        
    for (int i = 0; i <= 10; i++) {
      System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
    }

  }
}
