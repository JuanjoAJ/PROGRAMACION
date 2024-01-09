import java.util.Scanner;

/* DUF que calcule el valor máximo de una tabla de forma recursiva.*/
public class bol06e32 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el tamaño que quiere de tabla");
        int[] array=new int[scanner.nextInt()];
        rellenar(array);
        System.out.println("El valor máximo es de " + maximo(array, array.length-1));




    }

    //rellenar
    public static int[] rellenar( int[] array){
        int r;
        for (int i = 0; i < array.length; i++) {
            r = (int) (Math.random() * 100 + 1);
            while (repetido(r, array)) {
                r = (int) (Math.random() * 100 + 1);
            }
            array[i] = r;
        }
        return array;
    }

    //comprobar si está repetido
    public static boolean repetido(int r, int[] array){
        for (int i = 0; i < array.length; i++) {
            if (r==array[i]) return true;
        }
        return false;
    }

    //buscar el máximo

    public static int maximo(int[] array, int pos){
            int maximo = array[pos];
            if (pos > 0 && array[pos] < maximo(array, pos - 1))
                maximo = maximo(array, pos - 1);
            return maximo;
        }

}
