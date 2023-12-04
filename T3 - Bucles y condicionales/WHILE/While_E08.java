/*Modifica el ejercicio anterior para hacer una calculadora.
 *Nada más ejecutar se mostrarán las opciones disponibles
 *  - Bienvenido a la aplicación de calculos
 *  - Introduce operando uno:
 *  - Introduce operando dos:
 *  - 1. Sumar
 *  - 2. Restar
 *  - 3. Multiplicar
 *  - 4. Dividir
 *  - 5. Módulo
 *  - 6. Salir
 *  - Selecciona la operacion que quieres realizar.
 *  Al seleccionar una de las opciones el sistema realizará la operación correspondiente
 *  y mostrará el resultado por pantalla de la siguiente forma
 *  "El resultado de la operación es:".
 *  Una vez terminada la operación volverá a mostrar el menú y pedir dos números nuevos.
 *  (MenuCalculo)
 */

import java.util.Scanner;

public class While_E08 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num1,num2;
        int opcion=0;
        while (opcion!=6) {
            System.out.println("Bienvenido a la aplicación de calculos\n"
                    + " - Introduce operando uno:\n"
                    + " - Introduce operando dos:\n"
                    + " 1. Sumar\n"
                    + " 2. Restar\n"
                    + " 3. Multiplicar\n"
                    + " 4. Dividir\n"
                    + " 5. Módulo\n"
                    + " 6. Salir\n"
                    + " - Selecciona la operacion que quieres realizar.");
            num1=teclado.nextInt();
            num2=teclado.nextInt();
            opcion=teclado.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("El resultado de la operación es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("El resultado de la operación es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("El resultado de la operación es:" + (num1*num2));
                    break;
                case 4:
                    System.out.println("El resultado de la operación es: " + (num1/num2));
                    break;
                case 5:
                    System.out.println("El resultado de la operación es: " + (num1%num2));
                    break;
                case 6:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("La opción no está contemplada");
                    break;
            }
        }
    }
}