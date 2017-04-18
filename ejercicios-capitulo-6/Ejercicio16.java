/**
 * 
 * Realiza un simulador de máquina tragaperras simplificada
 * 
 * Gonzalo Iván Chaparro Barese
 * Ejercicio 16 - Capítulo 6
 * 
 */
 
public class Ejercicio16 {
  public static void main(String[] args) {

    int figura;
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;
    
    for (int i = 0; i < 3; i++) {
      figura = (int)(5 * Math.random());

      switch(figura) {
        case 0:
          System.out.print("corazón ");
          break;
        case 1:
          System.out.print("diamante ");
          break;
        case 2:
          System.out.print("herradura ");
          break;
        case 3:
          System.out.print("campana ");
          break;
        case 4:
          System.out.print("limón ");
          break;
        default:
      }
      
      switch(i) {
        case 0:
          figura1 = figura;
          break;
        case 1:
          figura2 = figura;
        break;
        case 2:
          figura3 = figura;
        break;
        default:
      }
    }

    if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
      System.out.println("\nLo siento, ha perdido.");
    } else if ((figura1 == figura2) && (figura2 == figura3)) {
      System.out.println("\nEnhorabuena, ha ganado 10 monedas.");
    } else {
      System.out.println("\nBien, ha recuperado su moneda.");
    }
  }
}
