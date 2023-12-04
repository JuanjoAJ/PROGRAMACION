/*Determinar si un número natural de 4 dígitos (entre 1000 y 9999) es capicúa.
 Se comprobará previamente que el número introducido tiene 4 dígitos.
 En la salida se mostrará uno de los siguientes mensajes:
“El número no tiene 4 dígitos”;
“Es capicúa”
“No es capicúa”.
 Un número es capicúa cuando se lee igual de izquierda a derecha que de derecha a izquierda **

 */

import java.util.*;
public class If_E05 {
    public static void main(String[] args) {

    Scanner teclado= new Scanner(System.in);

    System.out.println("Introduzca un número natural de 4 dígitos");

    int num= teclado.nextInt();

    int var1, var2, var3, var4, resto;

    var1= num/1000;

    var2= (num%1000)/100;

    resto=((num%1000)%100);

    var3= resto/10;

    var4=resto%10;

    if ((num<=9999) && (num>=1000)) {




        if ((var1 == var4) && (var2 == var3)) {

            System.out.println("Es capicúa");
        }
        else {
            System.out.println("No es capicúa ");
        }
    }else {
        System.out.println("No es un número natural de cuatro dígitos");
    }
}
}
