 /**
 * Programa que calcule la nota que hace falta sacar en un segundo examen para obtener la
 * nota media deseada, teniendo en cuenta que la nota del primer examen cuenta el 40% y
 * la del segundo cuenta un 60%.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 3 - Ejercicio 12
 */


public class Ejercicio12 {
  public static void main(String[] args) {

    System.out.print("Introduce la nota obtenida en el primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("¿Qué nota deseas sacar en el trimestre? ");
    double notaFinal = Double.parseDouble(System.console().readLine());
    
    double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
    
    System.out.println("Para sacar un " + notaFinal + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen.");
  }
}
