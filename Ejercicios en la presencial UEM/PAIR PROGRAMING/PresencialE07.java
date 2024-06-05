import java.util.Scanner;

/*Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos
entre 0 y 500 (ambos incluidos).

A continuación el programa mostrará el array y preguntará si el usuario
quiere destacar el máximo o el mínimo.
Seguidamente se volverá a mostrar el array escribiendo el número
destacado entre dobles asteriscos.
Nota: para generar los números aleatorios podemos utilizar n = (int)(Math.random() * 501);*/
public class PresencialE07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = array();
        int contador;
        for (int imp : array) System.out.print(imp + " ");
        System.out.println("\nCual quieres destacar. \n 1) Máximo \n 2) Mínimo");
        String maxMin = scanner.next().toLowerCase();

        switch (maxMin) {
            case "1":
            case "máximo":
                contador = 0;
                for (int i = 0; i < array.length; i++) {
                    if (contador < array[i]) contador = array[i];
                }
                imprimir(contador, array);

                break;
            case "2":
            case "mínimo":
                contador = 600;
                for (int i = 0; i < array.length; i++) {
                    if (contador > array[i]) contador = array[i];
                }
                imprimir(contador, array);

                break;
            default:
                System.out.println("Opción no contemplada");
                break;


        }

    }

    public static int[] array() {
        int[] array = new int[100];
        int random;
        for (int i = 0; i < array.length; i++) {
            do {
                random = (int) (Math.random() * 501);
            } while (repetido(random, array));
            array[i] = random;
        }
        return array;
    }

    public static boolean repetido(int n, int[] array) {
        for (int comprobar : array) {
            if (n == comprobar) return true;
        }
        return false;
    }

    public static void imprimir(int contador, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (contador == array[i]) System.out.print("** " + array[i] + " ** ");
            else System.out.print(array[i] + " ");
        }
    }

}
