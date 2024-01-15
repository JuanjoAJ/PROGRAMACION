import java.util.Random;
import java.util.Scanner;

/*DUF que  que consista en adivinar un número que la aplicación habrá generado aleatoriamente, por ejemplo entre 1 y 100. Usando la función de forma recursiva*/
public class AdivinarNumero {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(1, 101);
        int max = 100, min = 1;
        System.out.println("El número está entre 1 y 100");
        comprobarNumero(num, min, max);

    }

    public static void comprobarNumero(int random, int min, int max) {
        System.out.println("¿Cuál es el número?");
        int teclado = scanner.nextInt();
        if (random != teclado) {
            if (random < teclado) {
                max = teclado - 1;
                System.out.println("El número es menor. Prueba con un número entre " + min + " y " + max);
            } else {
                min = teclado + 1;
                System.out.println("El número es mayor. Prueba con un número entre " + min + " y " + max);
            }

            comprobarNumero(random, min, max);
        } else {
            System.out.println("Enhorabuena, el número era " + random);

        }


    }
}
