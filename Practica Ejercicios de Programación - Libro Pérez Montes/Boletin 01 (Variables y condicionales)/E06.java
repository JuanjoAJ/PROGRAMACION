/*Pedir dos números y decir si uno es múltiplo del otro*/

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce dos números");
        int a= scanner.nextInt();
        int b=scanner.nextInt();
        if(a%b==0) System.out.printf("Los números %d y %d son múltiplos",a,b);
        else System.out.println("No son múltiplos");


    }
}
