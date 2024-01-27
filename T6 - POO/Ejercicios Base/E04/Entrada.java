package E04;

import E03.Persona;
import java.util.Scanner;
/*En la clase entrada creada en el ejercicio 2 (se realizará una copia al ejercicio 4 para no modificar el 2)crear lo siguiente
La persona que tiene todos los datos (p1) muestra por pantalla su IMC
Según el IMC mostrado por pantalla, también se tendrá que mostrar por consola el estado físico de la persona. Para ello hay que tener en cuenta lo siguiente
- Peso inferior al normal		Menos de 18.5
- Normal		18.5 – 24.9
- Peso superior al normal		25.0 – 29.9
- Obesidad		Más de 30.0
*/
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
        imprimirIMC(personas[0].calculaIMC());
    }
    public static void imprimirIMC(double num) {
        if (num < 18.5 && num >= 0) {
            System.out.printf("Tiene un IMC de %.2f, lo que equivale a un peso inferior al normal", num);
        } else if (num > 18.5 && num < 24.9) {
            System.out.printf("Tiene un IMC de %.2f que equivale a un peso normal", num);
        } else if (num > 25.0 && num < 29.9) {
            System.out.printf("Según su IMC (que es de %.2f), usted tiene un peso superior al normal", num);
        } else if (num > 30.0) {
            System.out.printf("Según los estándares del IMC, un IMC de %.2f es catalogado como obesidad", num);
        } else {
            System.out.println("Perdone, no nos ha proporcionado los datos correctos");
        }
    }

}
