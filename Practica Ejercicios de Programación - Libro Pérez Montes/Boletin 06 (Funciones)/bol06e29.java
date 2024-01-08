import java.util.Random;
import java.util.Scanner;

/*DUF que toma como parámetros dos tablas. La primera con los 6 números de una apuesta de la
primitiva, y la segunda con los 6 números ganadores. La función debe devolver el número de
aciertos.
*/
public class bol06e29 {
    public static void main(String[] args) {
        int [] apuesta=new int[6], ganador=new int[6];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < apuesta.length; i++) {
            System.out.println("Introduce número para la primitiva: ");
            apuesta[i]= scanner.nextInt();
        }
        rellenar(ganador);
        imprimir(ganador, apuesta);
    }

    public static int[] rellenar(int[] aciertos) {
        int aleatorio;
        Random r = new Random();
        for (int i = 0; i < aciertos.length; i++) {
            aleatorio = r.nextInt(1, 50);
            do {
                aciertos[i] = aleatorio;

            } while (!repetido(aleatorio, aciertos));
            System.out.println(aciertos[i]);
        }
        return aciertos;
    }
    public static boolean repetido(int aleatorio, int[] array) {

        for (int j : array) {
            if (aleatorio == j) {
                return true;
            }
        }
        return false;

    }
    public static int acierto(int[] array, int[] arrayD){
        int aciertos=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i]==arrayD[j]) aciertos++;
            }
        }
        return aciertos;
    }
    public static void imprimir(int[]ganador, int[] apuesta){
        System.out.println("Los números de la primitiva son ");
        for (int item:ganador) {
            System.out.print(item + " ");
        }
        System.out.println("\nLos números de tu apuesta son: ");
        for (int item:apuesta) {
            System.out.print(item +" ");
        }
        System.out.println("\nEl número de aciertos es " + acierto(ganador, apuesta));
    }
}
