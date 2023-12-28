import java.util.Scanner;

/* Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 números.
Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén
detrás.
*/
public class bol04e08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[10];
        int num, pos;
        for (int i = 0; i < 8; i++) {
            System.out.println("Introduce un número");
            array[i] = s.nextInt();
        }
        System.out.println("Introduce número");
        num = s.nextInt();
        System.out.println("y posición.");
        pos = s.nextInt();

        if (pos<0 || pos>8){
            System.out.println("Posición ingresada errónea");
            return;
        }else {
            for (int i = 7; i >= pos; i--) {
                array[i + 1] = array[i];

            }
            array[pos] = num;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
