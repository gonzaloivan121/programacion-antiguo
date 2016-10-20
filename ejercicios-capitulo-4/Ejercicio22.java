/**
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y
 * una hora (horas y minutos), calcule cuántos minutos faltan para el fin de
 * semana. Se considerará que el fin de semana comienza el viernes a las 15:00h.
 * Se da por hecho que el usuario introducirá un día y hora correctos,
 * anterior al viernes a las 15:00h.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 22
 */
public class Ejercicio22 {
  public static void main(String[] args) {

    System.out.print("Escriba un día de la semana (de lunes a viernes): ");
    String dia = System.console().readLine();

    int diaEnNumero = 0;

    switch(dia) {
      case "lunes":
        diaEnNumero = 0;
        break;
      case "martes":
        diaEnNumero = 1;
        break;
      case "miércoles":
      case "miercoles":
        diaEnNumero = 2;
        break;
      case "jueves":
        diaEnNumero = 3;
        break;
      case "viernes":
        diaEnNumero = 4;
        break;
      default:
        System.out.print("El día introducido no es correcto.");
    }
    
    System.out.println("Escriba la hora en horas y minutos.");
    
    System.out.print("Hora: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int minutosEnTotal = (4 * 24 * 60) + (15 * 60);
    int minutosActuales = (diaEnNumero * 24 * 60) + (horas * 60) + minutos;
    
    System.out.print("Faltan " + (minutosEnTotal - minutosActuales) + " minutos para el fin de semana.");
  }
}
