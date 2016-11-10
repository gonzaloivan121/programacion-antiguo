/**
 * 
 * 
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 43
 */ 

public class Ejercicio43 {
  public static void main(String[] args) {

    System.out.print("Introduce un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    System.out.print("Introduce la posición a partir de la cual quiere partir el número: ");
    long posicion = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;

    // calcula la longitud del número
    int longitud = 0;
    
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);
    
    // parte izquierda
    long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
    
    // parte derecha
    long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion + 1));

    System.out.print("Los números partidos son el " + parteIzquierda + " y  el " + parteDerecha + ".");
  }
}
