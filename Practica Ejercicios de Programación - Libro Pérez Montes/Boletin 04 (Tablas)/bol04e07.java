/*Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están
ordenados de forma creciente, decreciente, o si están desordenados.
*/

import java.util.Scanner;

public class bol04e07 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] array=new int[10];
        boolean creciente=false, decreciente=false;

        for (int i = 0; i <10; i++) {
            System.out.println("Introduce el número " + (i+1));
            array[i]=s.nextInt();
        }

        for (int i = 0; i <9 ; i++) {

            if(array[i]<array[i+1]){
                creciente=true;
            }
            else if(array[i]>array[i+1]){
                decreciente=true;
            }

        }

        if (creciente && decreciente) System.out.println("Están desordenados");
        else if (creciente) System.out.println("Está ordenado de forma creciente");
        else System.out.println("Está ordenado de forma decreciente");


    }
}
