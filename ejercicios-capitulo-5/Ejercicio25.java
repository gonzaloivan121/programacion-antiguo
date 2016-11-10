/**
 * Realiza un programa que pida un número por teclado y que luego
 * muestre ese número al revés.
 * 
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 25
 */    
 
public class Ejercicio25 {

  public static void main(String[] args) {

    System.out.print("Introduce un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int numero = numeroIntroducido;
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    
    System.out.println("Si volteamos " + numeroIntroducido + " nos da " + volteado + ".");
  }
}
