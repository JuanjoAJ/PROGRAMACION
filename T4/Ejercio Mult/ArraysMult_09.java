/*(MenuArray)Crear un programa que mediante un menú permita:
    - Crear un array de números enteros con n posiciones pedidas.
    - Rellenar el array creado con números aleatorios.
    - Rellenar el array creado con números pedidos por consola.
    - Ordenar el array de mayor a menor
    - Clonar el array con una una mayor longitud. Para ello pedir al usuario la nueva longitud (si esta es inferior a la que la existe continuar pidiendo)
    - Mover todas las posiciones (pedir al usuario que seleccione la orientación)
    - Mostrar por pantalla el array según está
*/

import java.util.*;

public class ArraysMult_09 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Por favor introduzca el tamaño del array");
        int[] array = new int[teclado.nextInt()];
        boolean salir = false;
        do {
            System.out.println("Elija las siguientes opciones del menú:\r\n"
                    + "   1) Rellenar el array creado con números aleatorios.\r\n"
                    + "   2) Rellenar el array creado con números pedidos por consola.\r\n"
                    + "   3) Ordenar el array de mayor a menor\r\n"
                    + "   4) Clonar el array con una una mayor longitud. Para ello pedir al usuario la nueva longitud (si esta es inferior a la que la existe continuar pidiendo)\r\n"
                    + "   5) Mover todas las posiciones (pedir al usuario que seleccione la orientación)\r\n"
                    + "   6) Mostrar por pantalla el array según está\r\n" + "   7) Salir");
            int menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    for (int i = 0; i < array.length; i++) {
                        array[i] = r.nextInt();
                    }
                    imprimir(array);
                    break;
                case 2:
                    for (int i = 0; i < array.length; i++) {
                        System.out.println("Introduzca el número de la posición " + (i + 1));
                        array[i] = teclado.nextInt();
                    }
                    imprimir(array);
                    break;
                case 3:
                    System.out.println("Elija ordenadr de mayor a menor o viceversa:" + "\n 1) De menor a mayor."
                            + "\n 2) De mayor a menor. ");
                    int orden = teclado.nextInt();

                    switch (orden) {
                        case 1:
                            Arrays.sort(array);
                            break;
                        case 2:
                            int n = array.length;

                            for (int i = 0; i < n / 2; i++) {
                                int temp = array[i];

                                array[i] = array[n - i - 1];

                                array[n - i - 1] = temp;

                            }
                            imprimir(array);

                            break;

                        default:
                            System.out.println("El número introducido no es correcto");
                    }

                    imprimir(array);
                    break;
                case 4:
                    boolean menor;
                    int[] nuevoArray;
                    do {
                        menor = false;
                        System.out.println("Introduzca longitud de nuevo array");
                        int n = teclado.nextInt();
                        if (n < array.length) {
                            System.out.println("El nuevo array no puede ser menor");
                            menor = true;
                        } else {
                            nuevoArray = new int[n];
                        }
                    } while (menor);
                    nuevoArray = array.clone();
                    imprimir(nuevoArray);
                    break;

                case 5:
                    int[] arrays = { 1, 2, 3, 4, 5, 6, 7 };
                    System.out.println("Indique hacia donde quiere desplazar su arrays:" + "\n 1) Hacia la izquierda"
                            + "\n 2) Hacia la derecha");
                    int direccion = teclado.nextInt();

                    switch (direccion) {
                        case 1:
                            int var = array[0];
                            for (int i = 0; i > array.length; i++) {
                                array[i - 1] = arrays[i];
                            }
                            array[array.length] = var;
                            imprimir(array);
                            break;
                        case 2:
                            var = array[array.length - 1];
                            for (int i = array.length - 1; i > 0; i--) {
                                array[i] = arrays[i - 1];
                            }
                            array[0] = var;
                            imprimir(array);
                            break;
                        default:
                            System.out.println("El número introducido no es correcto");
                            break;
                    }

                    break;
                case 6:
                    imprimir(array);
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    salir = true;
                    break;

            }
        } while (!salir);
        System.out.println("El programa ha finalizado");
    }

    public static void imprimir(int[] vector) {
        for (int im : vector) {
            System.out.println(im);
        }
    }
}
