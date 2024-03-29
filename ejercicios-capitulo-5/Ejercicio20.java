/**
 * Igual que el ejercicio anterior pero esta vez se debe pintar una
 * pirámide hueca.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 20
 */ 
 
public class Ejercicio20 {

  public static void main(String[] args) {
    
    System.out.print("Introduce la altura de que deseas que tenga la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce el carácter con el cual se va a rellenar: ");
    String relleno = System.console().readLine();
    
    int altura = 1;
    int i = 0;
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosInternos = 0;
    
    while (altura < alturaIntroducida) {
      
      // inserta espacios delante
      for (i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      
      // pinta la línea
      System.out.print(relleno);
      for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
      }
      
      if (altura>1) {
        System.out.print(relleno);
      }
      
      System.out.println();
      altura++;
      espaciosPorDelante--;
      espaciosInternos += 2;
    } // while ////////////////////////////
    
    // base de la pirámide
    for (i = 1; i < altura*2; i++) {
      System.out.print(relleno);
    }
  }
}
