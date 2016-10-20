/**
 * Programa que nos diga el horóscopo a partir del mes y el día
 * especificados.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 10
 */
public class Ejercicio10 {

  public static void main(String[] args) {
    
    String horoscopo = "";

    System.out.println("Horóscopo.");
    System.out.print("Escriba su mes de nacimiento (1-12): ");
    int mes = Integer.parseInt(System.console().readLine());
    
    System.out.print("Escriba su día de nacimiento (1-31): ");
    int dia = Integer.parseInt(System.console().readLine());
  
    switch(mes) {
      case 1:
        if (dia < 21) {
          horoscopo = "Capricornio";
        } else {
          horoscopo = "Acuario";
        }
        break;
      case 2:
        if (dia < 20) {
          horoscopo = "Acuario";
        } else {
          horoscopo = "Piscis";
        }
        break;
      case 3:
        if (dia < 21) {
          horoscopo = "Piscis";
        } else {
          horoscopo = "Aries";
        }
        break;
      case 4:
        if (dia < 21) {
          horoscopo = "Aries";
        } else {
          horoscopo = "Tauro";
        }
        break;
      case 5:
        if (dia < 20) {
          horoscopo = "Tauro";
        } else {
          horoscopo = "Géminis";
        }
        break;
      case 6:
        if (dia < 22) {
          horoscopo = "Géminis";
        } else {
          horoscopo = "Cáncer";
        }
        break;
      case 7:
        if (dia < 22) {
          horoscopo = "Cáncer";
        } else {
          horoscopo = "Leo";
        }
        break;
      case 8:
        if (dia < 24) {
          horoscopo = "Leo";
        } else {
          horoscopo = "Virgo";
        }
        break;
      case 9:
        if (dia < 23) {
          horoscopo = "Virgo";
        } else {
          horoscopo = "Libra";
        }
        break;
      case 10:
        if (dia < 23) {
          horoscopo = "Libra";
        } else {
          horoscopo = "Escorpio";
        }
        break;
      case 11:
        if (dia < 23) {
          horoscopo = "Escorpio";
        } else {
          horoscopo = "Sagitario";
        }
        break;
      case 12:
        if (dia < 21) {
          horoscopo = "Sagitario";
        } else {
          horoscopo = "Capricornio";
        }
        break;
      default:
    }

    System.out.print("Su horóscopo es " + horoscopo);

  }
}
