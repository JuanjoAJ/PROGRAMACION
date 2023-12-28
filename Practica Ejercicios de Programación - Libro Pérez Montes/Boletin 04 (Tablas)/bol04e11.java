
import java.util.Scanner;

/*Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos los guardaremos en una
tabla de tamaño 10. Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada.
*/
public class bol04e11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] array=new int[10];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce número de la posición " + i);
            array[i]=s.nextInt();

        }
        System.out.println("Introduce otro número");
        int num=s.nextInt();
        for (int i = 4; i >= 0; i--) {
            if (array[i] > num) {
                array[i + 1] = array[i];
                array[i] = num;
            } else if (num > array[i]) {
                array[i + 1] = num;
                break;
            }
        }

        for (int item:array) System.out.print(item + " ");

    }
}
