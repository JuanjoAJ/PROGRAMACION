import java.util.Scanner;

/* Ídem, desplazar N posiciones (N es introducido por el usuario).*/
public class bol04e10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce número");
            array[i] = s.nextInt();
        }
        System.out.println("Cuantas posiciones quieres desplazar");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int auxiliar = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];

            }
            array[0] = auxiliar;
        }
        for (int item : array) {
            System.out.print(item + " ");

        }
    }
}
