import java.util.Scanner;

/* Diseñar una función que tenga como parámetros dos números, y que calcule el máximo. */
public class bol06e02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numUno, numDos;
        System.out.println("Introduce número");
        numUno= scanner.nextInt();
        System.out.println("Introduce otro número");
        numDos=scanner.nextInt();

        System.out.println("El número más grande es " + maximo(numUno,numDos));
    }

    public static int maximo(int num, int numD){
        if (num>numD) return num;
        return numD;

    }


}
