/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos números
 * introducidos por teclado y validados como distintos, el programa debe empezar por
 * el menor de los enteros introducidos e ir incrementando de 7 en 7.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 18
 */  

public class Ejercicio18 {

  public static void main(String[] args) {
    // indicamos las variables primero
    
    int primerNumero;
    int segundoNumero;
    
    // el programa nos va a pedir dos números y va a verificar que sean distintos
    do {
      System.out.print("Introduce un número entero: ");
      primerNumero = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce otro número entero distinto al anterior: ");
      segundoNumero = Integer.parseInt(System.console().readLine());
      
      if(primerNumero == segundoNumero) {
        System.out.println("Los números introducidos no son válidos, deben ser distintos.");
      }
    } while (primerNumero == segundoNumero);
    
    // si el primer número es mayor que el segundo, se intercambian los valores
    if (primerNumero > segundoNumero) {
      int aux = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = aux;
    }
    
    for(int i = primerNumero; i <= segundoNumero; i += 7) {
      System.out.print(i + " ");
    }
    
    System.out.println();
  }
}
