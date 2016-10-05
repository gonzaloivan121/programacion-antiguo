 /**
 * Conversor de euros a pesetas
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 3 - Ejercicio 2
 */

public class Ejercicio02 {
  public static void main(String[] args) {

    System.out.print("Introduce el valor en euros: ");
    double euros = Double.parseDouble(System.console().readLine());

    int pesetas = (int) (euros * 166.386);
    
    System.out.print(euros + "€ = " + pesetas + " pesetas.");
  }
}
