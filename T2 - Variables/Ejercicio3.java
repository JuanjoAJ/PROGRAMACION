/*Ejercicio 3. Hágase un programa que lea dos variables enteras y obtenga las siguientes operaciones:

        a) Suma

        b) Resta

        c) Multiplicación

        d) División entera

        e) Resto entero*/


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner ejercicio = new Scanner(System.in);

        System.out.println("Por favor, introduzca la primera variable entera: ");

        int var1 = ejercicio.nextInt();

        System.out.println("Por favor, introduzca la segunda variable entera: ");

        int var2 = ejercicio.nextInt();

        int sum = var1 + var2;

        int rest = var1 - var2;

        int multi = var1 * var2;

        int div = var1 / var2;

        int restEn = var1 % var2;

        System.out.println("Los resultados de las operaciones de  " + var1 + " y " + var2 + " son:" + "\n" +
                "a) Suma: " + sum + "\n" + "b) Resta: " + rest + "\n" + "c) Multiplicación: " + multi + "\n" +
                "c) División: " + div + "\n" + "d) Resto entero: " + restEn);




    }



}
