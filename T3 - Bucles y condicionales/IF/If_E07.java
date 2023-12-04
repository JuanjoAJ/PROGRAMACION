/* Un número de 3 cifras es un número de Armstrong si la suma de sus dígitos elevado a 3 coincide con dicho número.
        *  Por ejemplo, 153 = 1+125+27.
        *  Dado un número de 3 cifras determinar si es o no un número Armstrong.
        *   Se comprobará previamente que el número introducido tiene 3 dígitos.
        *    En la salida se mostrará uno de los siguientes mensajes:
        *    “El número no tiene 3 dígitos”
        *    "Es un número Armstrong”
        *    "No es un número Armstrong".
        */

import java.util.*;
public class If_E07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número de 3 dígitos");

        int armstrong = teclado.nextInt();

        if (armstrong >= 100 && armstrong <= 999) {

            int num1, num2, num3;

            num1 = armstrong / 100;
            num2 = (armstrong % 100) / 10;
            num3 = (armstrong % 100) % 10;

            int po1 = (int) Math.pow(num1, 3);
            int po2 = (int) Math.pow(num2, 3);
            int po3 = (int) Math.pow(num3, 3);

            if (po1 + po2 + po3 == armstrong) {

                System.out.println("Es un número Armstrong");
            } else {
                System.out.println("No es un número Armstrong");
            }


        } else {
            System.out.println("El número no tiene 3 dígitos.");
        }

    }

}