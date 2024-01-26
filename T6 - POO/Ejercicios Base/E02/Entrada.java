package E02;

import java.util.Scanner;
import E01.Persona;
/*2. Crear una clase llamada entrada que tenga un método main el cual:
    - Mediante un scanner pida nombre, apellido, dni edad peso y altura de una persona
    - Cree la persona asociada a los datos leídos por teclado (p1)
    - Cree una persona con un nombre y un apellido que se introduzca a mano (sin scanner)
    - Crear una persona sin datos asociados
    - Mostrar los datos de todas las personas
    - Modificar la edad de todas las personas a 20*/
public class Entrada {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca nombre, apellido, dni, edad, altura y peso de una persona");
        Persona[] personas=new Persona[3];
        personas[0]=new Persona(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        personas[1]=new Persona("Juanjo", "Avila");
        personas[2]=new Persona();
        for (Persona imp:personas){
            imp.mostrarDatos();
        }
        for (Persona set:personas){
            set.setEdad(20);
        }
    }
}
