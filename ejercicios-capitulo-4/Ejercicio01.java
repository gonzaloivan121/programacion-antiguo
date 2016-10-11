/**
 * Programa que pida un día de la semana y responda con la
 * asignatura que toca a primera hora.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 1
 */

public class Ejercicio01 {
  public static void main(String[] args) {
    
    System.out.println("Primera hora por día de la semana:");
    
    String dia;
    
    System.out.print("Escribe el día de la semana:");
    dia = (System.console().readLine());
    
    if (dia.equals("Lunes")) {
      System.out.println("Sistemas Informáticos");
      } else if (dia.equals("Martes")) {
        System.out.println("Programación");
      } else if (dia.equals("Miercoles")) {
        System.out.println("Programación");
      } else if (dia.equals("Jueves")) {
      System.out.println("Base de Datos");
      } else if (dia.equals("Viernes")) {
      System.out.println("Lenguaje de Marcas");
      }
   }  
}
