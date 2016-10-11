/**
 * Programa que, teniendo en cuenta un número del 1 al 7,
 * nos devuelva el día de la semana al que corresponda.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 3
 */

public class Ejercicio03 {
  public static void main(String[] args) {
    
    String dia;
    
    System.out.println("Introduce el número del día desado:");
    
    int num = Integer.parseInt(System.console().readLine());
        
    switch(num) {
      case 1:
        dia = "Lunes";
        break;
      case 2:
        dia = "Martes";
        break;
      case 3:
        dia = "Miércoles";
        break;
      case 4:
        dia = "Jueves";
        break;
      case 5:
        dia = "Viernes";
        break;
      case 6:
        dia = "Sábado";
        break;
      case 7:
        dia = "Domingo";
        break;
      default:
        dia = "Error. El número introducido debe estar comprendido entre el 1 y el 7.";
    }
    
    System.out.println(dia);
    
  }  
}
