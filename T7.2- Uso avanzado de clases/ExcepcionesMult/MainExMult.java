import modelExcepcionesMult.Persona;

import java.util.Scanner;

public class MainExMult {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
           System.out.println("Introduce nombre");
           String nombre= scanner.next();
           System.out.println("Introduce edad");
            int edad= scanner.nextInt();
            Persona persona=new Persona(nombre, edad);
           persona.validarDatos();
            Persona p=new Persona(null, 12);
            p.validarDatos();
        } catch (Persona.EdadInvalidaException e) {
            System.err.println("Error al introducir edad. " + e.getMessage());
        } catch (Persona.NombreInvalidoException e) {
            System.err.println("Error al introducir el nombre. " + e.getMessage());
        } catch (Exception e){
            System.err.println("DATOS INCORRECTOS");
           e.printStackTrace();
        }
        finally {
            System.out.println("Fin del programa");
        }



    }
}
