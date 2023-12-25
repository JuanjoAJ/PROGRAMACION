/*Pedir dos números y decir si son iguales o no.*/

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Introduce dos números");
        int a= s.nextInt();
        int b= s.nextInt();

        if (a==b) System.out.printf("Los números %d y %d son iguales",a,b);
        else System.out.printf("Los números %d y %d son distintos",a,b);


    }
}
