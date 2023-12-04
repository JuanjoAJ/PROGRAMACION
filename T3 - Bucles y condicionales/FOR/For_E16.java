/*Calcular el factorial de un número entre 0 y 20.
 * El factorial de un número se define del siguiente modo: F(0) = 1; F(1) = 1; F(n) = n(n-1)(n-2) ... 1 siendo n>1. (Factorial)
 */ //720
import java.util.*;
public class For_E16 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número entre 0 y 20");

        int n=teclado.nextInt();
        long factorial=n;
        if(n<=20 && n>=0) {
            for(int i=1; i<n; i++) {

                factorial*=i;
            }if(n==0) {
                System.out.println("El factorial de 0 es: 1");
            }else {
                System.out.printf("El factorial de %d es: %d",n, factorial);
            }
        }else {
            System.out.println("No es un número entre 0 y 20");
        }
    }

}