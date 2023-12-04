//Ejercicio 2. Hágase un programa que lea 5 variables enteras y haga lo siguiente:
//
//a) Las muestre en una línea separadas por un espacio.
//
//b) Rote los valores hacia la izquierda (la primera variable tome el valor de la segunda; la segunda, la de la tercera; la tercera, la de la cuarta; la cuarta, la de la quinta; y la quinta, la de la primera.
//
//c) Se muestren de nuevo el valor de las cinco variables de la misma forma que en el apartado a).

import java.util.Scanner;
public class Ejercicio2 {

    // Tiene que ser con metodo Scanner
    public static int var1= 1;
    public static int var2=2;
    public static int var3=3;
    public static int var4=4;
    public static int var5=5;

    public static void main(String[] args) {

        System.out.println("Los valores asignados son: " + var1 + ", " + var2 + ", " + var3 + ", " + var4 + ", "
                + var5 + ".");

        int aux1, aux2, aux3;
        aux1= 0;
        aux2=0; //no necesarios tantos auxiliares
        aux3=0;

        aux1=var4;

        var4=var5;

        aux2=var3;

        var3=aux1;

        aux3=var1;

        var1=var2;

        var5=aux3;

        var2=aux2;

        System.out.println("Los nuevos valores son: " + var1 + " " + var2 + " " + var3 + " " + var4 + " " + var5);

        inicio();


    }

    public static void inicio() {
        System.out.print("Los valores iniciales eran: " + var1 + ", " + var2 + ", " + var3 + ", " + var4 + ", "
                + var5 + "."); //no se imprime pantalla fuera del metodo main (ya se verá en clase)

    }
}