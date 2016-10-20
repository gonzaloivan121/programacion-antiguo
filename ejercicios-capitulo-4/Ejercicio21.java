/**
 * Calcula la nota de un trimestre de la asignatura Programación.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 21
 */
public class Ejercicio21 {
  public static void main(String[] args) {

    System.out.println("Este programa calcula tu nota media de Programación a partir de la nota de los dos examenes y, si los has suspendido, tiene en cuenta la recuperación.");
    System.out.print("Nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("Nota del segundo examen: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2) / 2;
    
    if (media < 5) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      String recuperacion = System.console().readLine();
      if (recuperacion.equals("apto")) {
        media = 5;
      }
    }
    
    System.out.print("Tu nota es " + media);
  }
}
