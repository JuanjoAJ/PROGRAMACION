/* Modifica el ejercicio 9 para hacer una calculadora de cambios de base.
 * Nada más ejecutar se mostrarán las opciones disponibles
 *  - Bienvenido a la aplicación de cambios de base
 *  - Introduce el número que quieres cambiar de base:
 *  - Pasar a base2
 *  - Pasar a base8
 *  - Pasar a base16
 *  - Salir
 *  - Selecciona la base a la que quieres pasar
 *  Al introducir un número el sistema comprobará que es mayor que 0.
 *  En caso de no serlo mostrará el mensaje "No válido, introduce otro", esperando una nueva introducción de datos.
 *  Una vez introducido, al seleccionar una de las opciones el sistema realizará la conversión correspondiente
 *  y mostrará el resultado por pantalla de la siguiente forma
 *  "El número XX en base10 es igual que XX en baseXX".
 *  Una vez terminada la operación volverá a mostrar el menú y pedir un número.
 *  (MenuBases)
 */
import java.util.*;
public class While_E09 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num1,n;
        int opcion=0;
        String base2="";
        String base8="";
        String base16="";
        while (opcion!=4) {

            System.out.println("\nBienvenido a la aplicación de cambios de base\n"
                    + " Introduce el número que quieres cambiar de base:\n"
                    + " 1. Pasar a base2\n"
                    + " 2. Pasar a base8\n"
                    + " 3. Pasar a base16\n"
                    + " 4. Salir\n"
                    + " - Selecciona la base a la que quieres pasar.");
            num1=teclado.nextInt();
            n=num1;


            if (num1<=0) {
                System.out.println("No válido, introduce otro");
                num1=teclado.nextInt();}

            opcion=teclado.nextInt();

            switch(opcion) {
                case 1:
                    while(num1>0) {
                        base2=(num1%2)+base2;
                        num1/=2;
                    }
                    System.out.println("El número "+ n + " en base2 es igual que " + base2 + " en base2");
                    break;
                case 2:
                    while (num1>0) {
                        base8=(num1%8)+base8;
                        num1/=8;
                    }
                    System.out.println("El número "+ n + " en base8 es igual que " + base8 + " en base8");
                    break;
                case 3:
                    while (num1>0) {
                        base16=(num1%16)+base16;
                        num1/=16;
                    }
                    System.out.println("El número "+ n + " en base16 es igual que " + base16 + " en base16");
                    break;
                case 4:
                    System.out.println("Has salido del sistema");
                    break;
                default:
                    System.out.println("La opción no está contemplada");
                    break;
            }
        }
    }

}