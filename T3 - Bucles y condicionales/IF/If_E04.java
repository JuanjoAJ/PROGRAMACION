/*Hágase un programa que compruebe si un año pedido por teclado es bisiesto. En la salida se mostrará o “Es bisiesto” o “No es bisiesto”,)

El algoritmo para obtener si un año es bisiesto es el siguiente: un año es bisiesto si es múltiplo de 4.
 */

import java.util.*;
public class If_E04 {
    public static void main(String[] args) {

        System.out.println("Introduzca año: ");

        Scanner teclado = new Scanner(System.in);

        int agno=teclado.nextInt();

        System.out.println((agno%4)==0 ? "Es bisiesto" : "No es bisiesto");

    }
}
