//Crea un programa que permita al usuario ingresar un carácter y luego determine si es una vocal o una consonante utilizando una sentencia switch.

import java.util.*;
public class Switch_E02 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduce un carácter en mayúsculas");

        char letra= teclado.next().charAt(0);


        switch (letra) {

            case 'A':
                System.out.println("Vocal");
                break;
            case 'E':
                System.out.println("Vocal");
                break;
            case 'I':
                System.out.println("Vocal");
                break;
            case 'O':
                System.out.println("Vocal");
                break;
            case 'U':
                System.out.println("Vocal");
                break;
            default:
                System.out.println("Consonante");
        }

    }

}
