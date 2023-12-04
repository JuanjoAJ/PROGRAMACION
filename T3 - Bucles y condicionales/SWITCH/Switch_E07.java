/*Desarrolla un programa que solicite al usuario ingresar una nota del 1 al 5
 *  y muestre un mensaje de calificación utilizando una sentencia switch (por ejemplo, "Suspenso", "Aprobado", "Notable", "Sobresaliente", etc.).*/

import java.util.*;
public class Switch_E07 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduzca valor del 1 al 5");

        int nota=teclado.nextInt();

        switch (nota) {
            case 1:
                System.out.println("Suspenso");
                break;
            case 2:
                System.out.println("Aprobado");
                break;
            case 3:
                System.out.println("Notable");
                break;
            case 4:
                System.out.println("Sobresaliente");
                break;
            case 5:
                System.out.println("Matricula de honor");
                break;
        }
    }
}
