//Se leen tres enteros y se comprobará si son o no consecutivos. Se mostrará en la salida “Son consecutivos” o “No son consecutivos”.

import java.util.*;
public class If_E09 {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);

        System.out.println("Introduzca tres enteros");

        int num1, num2, num3;

        num1= teclado.nextInt();
        num2= teclado.nextInt();
        num3= teclado.nextInt();


        System.out.println((++num1==num2)&&(++num2==num3) ? "Son consecutivos" : "No son consecutivos");

    }
}
