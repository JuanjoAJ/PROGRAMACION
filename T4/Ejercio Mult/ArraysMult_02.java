/*(MayorArray) Crea una aplicación que realice lo siguiente:
    - pida por pantalla la longitud del array de enteros
    - crea el array de enteros con la longitud introducida
    - pida al usuario que introduzca todos los datos del array
    - saque por pantalla el elemento mayor y el elemento menor
 */
import java.util.*;
public class ArraysMult_02 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Por favor determine el valor del arrays");
        int vector[]=new int[teclado.nextInt()];

        for(int i=0; i<vector.length;i++){
            System.out.printf("Introduce el número de la posición %d del vector \n",i);
            vector[i]=teclado.nextInt();
        }
        Arrays.sort(vector);
        System.out.printf("El número mayor del Array es %d mientras que el menor es %d", vector[vector.length-1], vector[0] );

    }

}
