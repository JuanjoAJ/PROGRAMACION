//Desarrolla un programa que reciba un número entero y, utilizando una sentencia switch, determine si es par o impar.

import java.util.*;
public class Switch_E03 {

    public static void main(String [] args) {

        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduzca número entero: ");

        int num=teclado.nextInt();

        switch (num%2) {

            case 0:
                System.out.println("El número es par");
                break;
            default:
                System.out.println("El número es impar");

        }

    }
}
