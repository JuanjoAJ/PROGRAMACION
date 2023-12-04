/*Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego los muestre:
 * - en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * - en orden normal, es decir, el primero que se muestra es el primero que se ha introducido
 */
import java.util.*;
public class Arrays_03 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int vector[]=new int[10];
        for (int i=0; i<vector.length; i++) {
            System.out.println("Por favor introduzca un número: ");
            vector[i]=teclado.nextInt();
        }
        for(int j=9; j>=0;j--) {
            System.out.print(vector[j] + " \t");
        }
        System.out.println();
        for(int imprimir:vector) {
            System.out.print(imprimir + " \t");
        }
    }
}
