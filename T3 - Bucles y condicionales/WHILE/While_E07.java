/*Realizar un menú de 4 opciones, donde se mostrará por pantalla el siguiente formato
 * - Bienvenido a la aplicación del menú
 * - 1. Opción1
 * - 2. Opción2
 * - 3. Opción3
 * - 4. Opción4
 * - 5. Salir
 * - Introduce la opción seleccionada
 * Una vez mostrado la última línea, el sistema esperará a que el usuario introduzca un dato.
 * Dependiendo de la opción seleccionada aparecerá un mensaje por pantalla que ponga
 * "La opción seleccionada es X". En el caso de meter una diferente pondrá "opción no contemplada".
 * El programa se repetiría hasta que introduzca el 5
 * (MenuSimple)
 */
import java.util.*;
public class While_E07 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        System.out.println("Realizar un menú de 4 opciones, donde se mostrará por pantalla el siguiente formato \r\n"
                + " - Bienvenido a la aplicación del menú \r\n"
                + " 1. Opción1\n"
                + " 2. Opción2\n"
                + " 3. Opción3\n"
                + " 4. Opción4\n"
                + " 5. Salir \n"
                + " - Introduce la opción seleccionada");

        int opcion=0;
        while (opcion!=5) {
            opcion=teclado.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("La opción seleccionada es " + opcion);
                    break;
                case 2:
                    System.out.println("La opción seleccionada es " + opcion);
                    break;
                case 3:
                    System.out.println("La opción seleccionada es " + opcion);
                    break;
                case 4:
                    System.out.println("La opción seleccionada es " + opcion);
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("La opción no está contemplada" );
                    break;
            }


        }


    }

}
