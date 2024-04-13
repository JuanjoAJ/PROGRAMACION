/*(OperacionesArray) Crear un array con 10 posiciones y asígnale números enteros entre 0 y 9, ambos inclusive (de forma automática).
 * Se mostrarán los datos separados por una coma y un espacio.
 * Una vez hecho esto se modificará el array del de la manera indicada en cada apartado, y se mostrará de nuevo.
- Incrementar en 1 los valores pares y en -1 los impares.
- Duplicar los valores positivos menores que 5
- Sumar a cada valor un valor entero aleatorio entre -5 y 5.
- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
segundo al tercero, ..., y el último al primero).
- Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.
- Invertir el array
- Mostrar la posición del primer par y del último impar.

*hay que hacer to-do de golpe, pero opcionalmente se puede hacer un menú que indique cada una de las opciones**
*/

import java.util.*;

public class ArraysMult_05 {
    public static void imprimir() {
        for (int im : array) {
            System.out.print(im + " ");
        }
    }

    public static int[] array = new int[10];

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] += i;
        }

        for (int im : array) {
            System.out.print(im + " ");
        }
        System.out.println();
        System.out.println("\n \t Elija una de las opciones: \n"
                + "1- Incrementar en 1 los valores pares y en -1 los impares.\r\n"
                + "2- Duplicar los valores positivos menores que 5\r\n"
                + "3- Sumar a cada valor un valor entero aleatorio entre -5 y 5.\r\n"
                + "4- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el segundo al tercero, ..., y el último al primero).\r\n"
                + "5- Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.\r\n"
                + "6- Invertir el array\r\n" + "7- Mostrar la posición del primer par y del último impar.");
        int opcion = teclado.nextInt();
        switch (opcion) {

            case 1:
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 == 0) {
                        array[i] += 1;
                    } else {
                        array[i] -= 1;
                    }

                }
                imprimir();
                break;
            case 2:
                for (int i = 0; i < array.length; i++) {
                    if (array[i] < 5) {
                        array[i] *= 2;
                    }
                }
                imprimir();
                break;
            case 3:
                for (int i = 0; i < array.length; i++) {
                    Random r = new Random();
                    array[i] += r.nextInt(-5, 5);
                }
                imprimir();
                break;
            case 4:
                int aux;
                aux = array[array.length - 1];
                for (int i = array.length - 1; i > 0; i--) {
                    array[i] = array[i - 1];
                }
                array[0] = aux;
                imprimir();
                break;
            case 5:

                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 == 0) {
                        array[i] += 1;
                    } else {
                        array[i] -= 1;
                    }
                }
                imprimir();
                break;
            case 6:

                int n = array.length;

                for (int i = 0; i < n / 2; i++) {
                    int temp = array[i];

                    array[i] = array[n - i - 1];

                    array[n - i - 1] = temp;

                }
                imprimir();

                break;
            case 7:
                int pri = 0, ult = 0;
                for (int i = array.length - 1; i >= 0; i--) {
                    if (array[i] % 2 == 0) {
                        pri = array[i];
                    }
                }
                for (int j = 0; j < array.length; j++) {
                    if (array[j] % 2 != 0) {
                        ult = array[j];
                    }
                }
                System.out.printf("El primer par de la cadena es %d , mientras que el segundo es %d", pri, ult);
                break;
        }

    }
}
