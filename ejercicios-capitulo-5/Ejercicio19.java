/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura
 * se debe pedir por teclado. El carácter con el que se pinta la pirámide
 * también se debe pedir por teclado.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 19
 */  

public class Ejercicio19 {

  public static void main(String[] args) {
    
    System.out.print("Introduce la altura de que deseas que tenga la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce el carácter con el cual se va a rellenar: ");
    String relleno = System.console().readLine();
    
    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida-1;
    
    while (altura <= alturaIntroducida) {
      
      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      for (i = 1; i < altura * 2; i++) {
        System.out.print(relleno);
      }

      System.out.println();

      altura++;
      espacios--;
    }
  }
}
