/**
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las
 * asignaturas que se imparten en el curso. Cada pregunta acertada
 * sumará un punto. El programa mostrará al final la califcación
 * obtenida.
 *
 * Gonzalo Iván Chaparro Barese
 * Capítulo 4 - Ejercicio 12
 */
public class Ejercicio12 {

  public static void main(String[] args) {
    
    int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO DE 1º DAW");
    
    System.out.println("1. ¿Qué significa las siglas de HTML?");
    System.out.println("a) Hidro Text Mailing List \nb) Hyper Text Mailing List\nc) Hyper Text Markup Language"); 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }

    System.out.println("2. Para insertar un archivo en una página se utiliza la etiqueta...");
    System.out.println("a) href\nb) head\nc) link"); 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }

    System.out.println("3. ¿En qué directorio se encuentra la carpeta del usuario en Linux?");
    System.out.println("a) /user\nb) /home\nc) /etc"); 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("4. ¿En qué directorio se encuentran los archivos de configuración de Linux?");
    System.out.println("a) /etc\nb) /config\nc) /cfg"); 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
    System.out.println("a) RAM\nb) EPROM\nc) ROM"); 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("6. ¿Qué significan las siglas HDD?");
    System.out.println("a) High Drive Disk\nb) Hard Drive Disk\nc) Hyper Drive Device"); 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("7. ¿Qué significan las siglas SSD?");
    System.out.println("a) Single-Side Drive\nb) Super-Solid Drive\nc) Solid-State Drive"); 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println("8. Para darle estilo a una página simple de HTML utilizamos...");
    System.out.println("a) Java\nb) CSS\nc) C++"); 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("9. ¿Cuáles son las principales marcas de CPUs actuales?");
    System.out.println("a) Intel y AMD\nb) Intel e IBM\nc) AMD e IBM"); 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("10. Al compilar un código de Java, el archivo que se nos crea es de extensión...");
    System.out.println("a) .javac\nb) .javacomp\nc) .class"); 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println("\n¡Has obtenido " + puntos + " puntos!");
  }
}
