 /**
 * Programa que calcule el salario semanal de un empleado en base
 * a las horas trabajadas, a razón de 12 euros la hora.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 3 - Ejercicio 8
 */


public class Ejercicio08 {
  public static void main(String[] args) {

    System.out.print("Introduce el número de horas semanales: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    System.out.println("Su sueldo a la semana es de " + (horasTrabajadas * 12) + "€.");
  }
}
