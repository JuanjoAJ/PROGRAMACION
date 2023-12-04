//Se lee un número entero. Dicho número se incrementará en una unidad si es par, y se decrementará en una unidad si es impar. Se muestra por consola el nuevo valor del número.

import java.util.*;
public class If_E10 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);

        System.out.println("Introduzca un valor");

        int num= teclado.nextInt();

        if ((num%2)==0) {
            num++;
        }else {
            num--;
        }

        System.out.println("El nuevo valor es " + num);

    }
}
