/**
 * Programa que calcule el salario semanal de un empleado
 * teniendo en cuenta las horas semanales trabajadas teniendo
 * en cuenta que las primeras 40 horas se pagan a 12€ y a
 * partir de 41 horas se pagan a 16€.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 4
 */

public class Ejercicio04 {
  public static void main(String[] args) {
         
    int sueldo;
    
    System.out.println("Introduce las horas trabajadas a la semana: ");
    
    int horas = Integer.parseInt(System.console().readLine());
        
    if (horas < 40) {
      sueldo = 12 * horas;
    } else {
      sueldo = (40 * 12) + ((horas - 40) * 16);    
    }
    System.out.println("El sueldo semanal obtenido es de " + sueldo + "€");
  }
}
