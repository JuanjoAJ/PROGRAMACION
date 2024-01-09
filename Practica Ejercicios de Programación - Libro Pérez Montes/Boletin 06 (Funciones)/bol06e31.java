/*Calcular el factorial de n recursivamente. */

import java.util.Scanner;

public class bol06e31 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("Introduzca el número");
        num= scanner.nextInt();
        System.out.println("El factorial recursivo es " + factorial(num));

    }
    public static int factorial(int num){
        int res;
        if(num<=0) res=1;
        else res=num*factorial(num-1); //usamos el método de forma recursiva

        return res;
    }
}
