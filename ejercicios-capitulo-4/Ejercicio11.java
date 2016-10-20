/**
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 11
 */
public class Ejercicio11 {

  public static void main(String[] args) {
    
    System.out.print("Se dispone a introducir las horas y minutos transcurridos del dia, ");
    System.out.println("primero irá la hora y luego los minutos.");
    
    System.out.print("Introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());  
    
    System.out.print("Introduzca los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());

    int segundosPasados = (hora * 3600) + (minutos * 60);
    int segundosRestantes = (24 * 3600) - segundosPasados;
            
    System.out.printf("Si la hora es %02d:%02d, faltan %d segundos para la medianoche.", hora, minutos, segundosRestantes);
  }
}
