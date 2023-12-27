import java.util.Scanner;

/*Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º
de B, el 2º de A, el 2º de B, etc.
*/
public class bol04e05 {
    public static void main(String[] args) {
        int[] arrayUno = new int[10], arrayDos = new int[10], arrayTres = new int[20];
        array(arrayUno);
        array(arrayDos);
        int j = 0;
        int k = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                arrayTres[i] = arrayUno[j];
                j++;
            } else {
                arrayTres[i] = arrayDos[k];
                k++;
            }
        }

        System.out.println("La tabla mezclada es:");
        for (int i = 0; i < 20; i++) {
            System.out.print(arrayTres[i] + " ");
        }

    }

    public static int[] array(int[] array) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Inserte el número " + (i + 1));
            array[i] = s.nextInt();
        }
        return array;


    }
}
