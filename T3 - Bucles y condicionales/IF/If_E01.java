/*Hágase un programa que lea dos enteros y compruebe si el primero es o no mayor que el segundo.
En la salida se mostrará “El primero es mayor que el segundo” o “El primero no es mayor que el segundo”.*/

import java.util.*;

public class If_E01 {
    public static void main(String[] args) {


    Scanner teclado= new Scanner(System.in);

    System.out.println("Por favor, introduzca dos valores: ");

        int var1 = teclado.nextInt();
        int var2= teclado.nextInt();

    if (var1>var2) {

        System.out.println( "El primero es mayor que el segundo");
    }
    else if (var1<var2){
        System.out.println("El primero no es mayor que el segundo");
    }
    else {
        System.out.println("Son iguales");
    }

}

}