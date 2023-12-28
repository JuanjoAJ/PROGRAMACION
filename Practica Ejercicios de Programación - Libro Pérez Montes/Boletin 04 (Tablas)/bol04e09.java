import java.util.Scanner;

/*Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia
abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a
ser el primero.*/
public class bol04e09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce número");
            array[i] = s.nextInt();
        }
        int auxiliar = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];

        }
        array[0] = auxiliar;
        for (int item : array) {
            System.out.print(item + " ");

        }

    }
}
