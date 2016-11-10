/**
 * Realiza el control de acceso a una caja fuerte. La combinación
 * será un número de 4 cifras. El programa nos pedirá la combinación
 * para abrirla. Si no acertamos, se nos mostrará el mensaje
 * “Lo siento, esa no es la combinación” y si acertamos se nos dirá
 * “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
 * oportunidades para abrir la caja fuerte.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 5 - Ejercicio 7
 */  
 
public class Ejercicio07 {

  public static void main(String[] args) {
    
    int intentos = 4;
    int combinacion;
    boolean acertado = false;
    
    do {
      System.out.print("Escriba la combinación de la caja fuerte: ");
      combinacion = Integer.parseInt(System.console().readLine());
      
      if (combinacion == 1580) {
        acertado = true;
      } else {
        System.out.println("¡CLAVE ERRONEA!");
      }
      
      intentos--;
  
    } while((intentos > 0) && (!acertado));
    
    if (acertado) {
      System.out.println("la caja se ha abierto satisfactoriamente.");
    } else {
      System.out.println("Ha fallado 4 veces, así que se ha bloqueado.");
    }
  }
}
