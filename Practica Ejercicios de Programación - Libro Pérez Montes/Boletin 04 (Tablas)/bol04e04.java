/* Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el
penúltimo, el tercero, etc.*/

import java.util.Scanner;

public class bol04e04 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] array=new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce números");
            array[i]=s.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i] + " " + array[array.length-i-1]);
        }


    }
}
