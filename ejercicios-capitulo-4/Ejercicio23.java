/**
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno
 * si se muestran los valores correctos, aunque los números no estén tabulados.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 23
 */
public class Ejercicio23 {
  public static void main(String[] args) {

    System.out.print("Introduce la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce el tipo de IVA (general, reducido o superreducido): ");
    String tipoIVA = System.console().readLine();
    
    System.out.print("Introduce el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigoPromocional = System.console().readLine();
      
    int tipoIVANumerico = 0;
    
    switch(tipoIVA) {
      case "general":
        tipoIVANumerico = 21;
        break;
      case "reducido":
        tipoIVANumerico = 10;
        break;
      case "superreducido":
        tipoIVANumerico = 4;
        break;
      default:
        System.out.print("El tipo de IVA introducido no es correcto.");
    }
    
    double iva = baseImponible * tipoIVANumerico / 100;
    double precioSinDescuento = baseImponible + iva;
    
    
    double descuento = 0;
    
    switch(codigoPromocional) {
      case "nopro":
        break;
      case "mitad":
        descuento = precioSinDescuento / 2;
        break;
      case "meno5":
        descuento = 5;
        break;
      case "5porc":
        descuento = precioSinDescuento * 0.05;
        break;
      default:
        System.out.print("El código promocional introducido no es correcto.");
    }
    
    
    double total = precioSinDescuento - descuento;
    
    System.out.printf("Base imponible       %6.2f\n", baseImponible);
    System.out.printf("IVA (%2d%%)            %6.2f\n", tipoIVANumerico, iva);
    System.out.printf("Precio con IVA       %6.2f\n", precioSinDescuento);
    System.out.printf("Cód. promo. (%s) -%6.2f\n", codigoPromocional, descuento);
    System.out.printf("TOTAL                %6.2f", total);
  }
}
