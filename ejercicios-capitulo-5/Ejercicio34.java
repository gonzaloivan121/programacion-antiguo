/**
 * 
 * 
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 34
 */ 

public class Ejercicio34 {

  public static void main(String[] args) {

    // Lectura de dos números por teclado //////////////////////////////////////
    System.out.print("Introduzca un primer número: ");
    long numeroIntroducido1 = Long.parseLong(System.console().readLine());

    System.out.print("Introduce el segundo número: ");
    long numeroIntroducido2 = Long.parseLong(System.console().readLine());

    // Voltea el primer número y calcula la longitud ///////////////////////////
    // Se da por hecho que los dos números introducidos tienen la misma longitud.
    long numero = numeroIntroducido1;
    long volteado1 = 0;
    int longitud = 0;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado1 = (volteado1 * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } // while

    // Voltea el segundo número ////////////////////////////////////////////////
    numero = numeroIntroducido2;
    long volteado2 = 0;
    
    while (numero > 0) {
      volteado2 = (volteado2 * 10) + (numero % 10);
      numero /= 10;
    } // while

    // Recorre los dos números volteados para formar los dos resultados ////////
    long resultadoPares = 0;
    long resultadoImpares = 0;
    int digito;
    
    for (int i = 0; i < longitud; i++) {

      digito = (int)(volteado1 % 10);

      if ((digito % 2) == 0) {
        resultadoPares = resultadoPares * 10 + digito;
      } else {
        resultadoImpares = resultadoImpares * 10 + digito;
      }

      digito = (int)(volteado2 % 10);

      if ((digito % 2) == 0) {
        resultadoPares = resultadoPares * 10 + digito;
      } else {
        resultadoImpares = resultadoImpares * 10 + digito;
      }

      volteado1 /= 10;
      volteado2 /= 10;
    }
    
    // Muestra el resultado ////////////////////////////////////////////////////
    System.out.println("El número formado por los dígitos pares es " + resultadoPares + ".");
    System.out.println("El número formado por los dígitos impares es " + resultadoImpares + ".");
  }
}

