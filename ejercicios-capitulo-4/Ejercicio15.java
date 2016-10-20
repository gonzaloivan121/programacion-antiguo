/**
 * Escribe un programa que pinte una pirámide rellena con un carácter
 * introducido por teclado que podrá ser una letra, un número o un
 * símbolo. El programa debe permitir al usuario mediante un menú
 * elegir si el vértice de la pirámide está apuntando hacia arriba,
 * hacia abajo, hacia la izquierda o hacia la derecha.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 15
 */
public class Ejercicio15 {

	public static void main(String[] args) {
				
		System.out.println("Este programa pinta una pirámide.");
		System.out.print("Indique el carácter con el que desee rellenar la pirámide: ");
		String r = System.console().readLine();
		System.out.println("Elija un tipo de pirámide:");
		System.out.println("1. Apuntando hacia arriba");
		System.out.println("2. Apuntando hacia abajo");
		System.out.println("3. Apuntando a la izquierda");
		System.out.println("4. Apuntando a la derecha");
		int opcion = Integer.parseInt(System.console().readLine());

		switch(opcion) {
			case 1:
        System.out.println("  " + r);
        System.out.println(" " + r + r + r);
        System.out.println(r + r + r + r + r);
        break;
			case 2:
        System.out.println(r + r + r + r + r);
        System.out.println(" " + r + r + r);
        System.out.println("  " + r);
        break;
			case 3:
        System.out.println("    " + r);
        System.out.println("  " + r + " " + r);
        System.out.println(r + " " + r + " " + r);
        System.out.println("  " + r + " " + r);
        System.out.println("    " + r);
        break;
			case 4:
        System.out.println(r);
        System.out.println(r + " " + r);
        System.out.println(r + " " + r + " " + r);
        System.out.println(r + " " + r);
        System.out.println(r);
        break;
      default:
		}
	}
}
