/**
 * Escribe un programa que muestre por pantalla  todos  los números enteros positivos menores
 * a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.
 * 
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 29
 */   
 
public class Ejercicio29 {

  public static void main(String[] args) {

    System.out.print("Introduce un número entero positivo (relativamente grande): ");
    int numeroGrande = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce otro número (relativamente pequeño): ");
    int numeroPequeno = Integer.parseInt(System.console().readLine());

    System.out.print("Los números enteros positivos menores que " + numeroGrande );
    System.out.println(" que no son divisibles entre " + numeroPequeno + " son los siguientes: ");

    int cuenta = 0;
    int suma = 0;

    for (int i = 1; i < numeroGrande; i++) {
      if ((i % numeroPequeno) != 0) {
        System.out.print(i + " ");
      }
    }
  }
}
