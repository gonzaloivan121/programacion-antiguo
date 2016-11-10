/**
 * 
 * 
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 46
 */ 

public class Ejercicio46 {
  public static void main(String[] args) {

    System.out.print("Introduce la anchura del rectángulo (como mínimo 2): ");
    int anchura = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce la altura (como mínimo 2): ");
    int altura = Integer.parseInt(System.console().readLine());

    if ((anchura < 2) || (altura < 2)) {

      System.out.print("Los datos introducidos no son correctos, ");
      System.out.println(" el valor mínimo para la anchura y la altura es 2.");

    } else {
    
      // Línea superior ////////////////////////////////////////////////////////
      for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
      }
      
      // Parte intermedia //////////////////////////////////////////////////////
      System.out.print("\n*");
      for (int espacios = 2; espacios < anchura; espacios++) {
        System.out.print(" ");
      }
      System.out.println("*");

      // Línea inferior ////////////////////////////////////////////////////////
      for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
      }
    } // else
  }
}
