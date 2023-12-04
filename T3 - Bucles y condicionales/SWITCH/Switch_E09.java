/*Escribe un programa que solicite al usuario ingresar un número del 1 al 12
 *  y muestre la estación del año correspondiente (por ejemplo, "Primavera", "Verano", "Otoño", "Invierno") utilizando una sentencia switch.
 */

import java.util.Scanner;
public class Switch_E09 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduzca el número correspondiente al mes");

        int mes=teclado.nextInt();
        /*12 1 2 in
         * 3 4 5 pr
         * 6 7 8 ve
         * 9 10 11 ot*/

        switch (mes) {

            case 1:
                System.out.println("Invierno");
                break;
            case 2:
                System.out.println("Invierno");
                break;
            case 3:
                System.out.println("Primavera");
                break;
            case 4:
                System.out.println("Primavera");
                break;
            case 5:
                System.out.println("Primavera");
                break;
            case 6:
                System.out.println("Verano");
                break;
            case 7:
                System.out.println("Verano");
                break;
            case 8:
                System.out.println("Verano");
                break;
            case 9:
                System.out.println("Otoño");
                break;
            case 10:
                System.out.println("Otoño");
                break;
            case 11:
                System.out.println("Otoño");
                break;
            case 12:
                System.out.println("Invierno");
                break;
        }

    }

}