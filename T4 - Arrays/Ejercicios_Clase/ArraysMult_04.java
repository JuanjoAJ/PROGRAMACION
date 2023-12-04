/*(PosicionesArray) Crea una aplicación que:
   - pida por teclado la longitud de un array
   - cree el array de enteros de la longitud introducida
   - pida al usuario que introduzca todos los datos del array
   - mueva una posición todos los elementos. el elemento de la posición 0 pasa a la posición 1 y así sucesivamente. El elemento que está en la última posición pasa a la primera
   - realizar la tarea anterior pero al contrario. El elemento que está en la primera posición pasa a la última y así sucesivamente*/
import java.util.*;
public class ArraysMult_04 {
    public static int aux;
    public static int[] array;

    public static void imprimir() {
        for (int imp : array) {
            System.out.print(imp + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca la longitud de la cadena");
        array = new int[teclado.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Por favor, introduzca el valor de la posición " + (i + 1));
            array[i] = teclado.nextInt();
        }
        imprimir();
        aux = array[array.length - 1];
        for (int z = array.length - 1; z > 0; z--) {
            array[z] = array[z - 1];
        }
        array[0] = aux;

        imprimir();

        aux = array[0];
        for (int j = 1; j < array.length; j++) {
            array[j - 1] = array[j];
        }
        array[array.length - 1] = aux;

        imprimir();


    }

}
