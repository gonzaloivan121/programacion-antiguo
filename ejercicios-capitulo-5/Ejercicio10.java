/**
 * Escribe un programa que calcule la media de un conjunto de números
 * positivos introducidos por teclado.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 10
 */   

public class Ejercicio10 {

  public static void main(String[] args) {
    
    double numeros = 0;
    double numerosIntroducidos = 0;
    double suma = 0;

    System.out.println("Este programa calcula la media de los números positivos introducidos.");
    System.out.println("Introduzca los números deseados (puede parar introduciendo un número negativo):");

    while (numerosIntroducidos >= 0) {
      numerosIntroducidos = Integer.parseInt(System.console().readLine());
      numeros++;
      suma += numerosIntroducidos;
    }
    
    System.out.println("La media de los números positivos introducidos es " + (suma - numerosIntroducidos)/ (numeros - 1));

  }
}
