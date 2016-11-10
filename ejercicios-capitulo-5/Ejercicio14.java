/**
 * Escribe un programa que pida una base y un exponente (entero positivo)
 * y que calcule la potencia.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 14
 */ 
 
public class Ejercicio14 {

  public static void main(String[] args) {
    
    System.out.println("Calcular una potencia a partir de la base y el exponente.");
    
    System.out.print("Introduce la base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());

    double potencia = 1;
        
    if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      
      potencia = 1/potencia;
    }

    System.out.println(base + "^" + exponente + " = " + potencia);
  }
}
