
//Realiza un programa que pida 8 números enteros, los guarde en un array y que luego muestre esos números junto con la palabra “par” o “impar” según proceda.

import java.util.*;
public class Arrays_05 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int parImpar[]=new int[8];

        for (int i=0; i<parImpar.length;i++) {
            System.out.println("Por favor, introduzca un número entero: ");
            parImpar[i]=teclado.nextInt();
        }
        for(int imprimir:parImpar) {
            if(imprimir%2==0) {
                System.out.println("El número " + imprimir + " es par.");
            }else {
                System.out.println("El número " + imprimir + " es impar.");
            }

        }

    }

}
