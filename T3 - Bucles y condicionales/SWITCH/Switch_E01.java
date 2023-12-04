//Escribe un programa en Java que solicite al usuario ingresar un número del 1 al 7 y muestre el día de la semana correspondiente utilizando una sentencia switch.

import java.util.*;
public class Switch_E01 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner (System.in);
        System.out.println("Introduce numero del 1 al 7");
        int fecha=teclado.nextInt();

        switch (fecha) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Valor no válido");
        }


    }

}