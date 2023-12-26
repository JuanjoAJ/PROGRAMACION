import java.util.Scanner;

/* Pedir números hasta que se introduzca uno negativo, y calcular la media.
 */
public class bol02E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media, num = 0, cont = 0, sum = 0;

        do {
            System.out.println("Introduce número");
            num = scanner.nextInt();
            if (num > -1) {
                sum += num;
                cont++;
            }
        } while (num >= 0);
        media = sum / cont;
        System.out.print("La media de todos los números introducidos es de " + media);

    }
}
