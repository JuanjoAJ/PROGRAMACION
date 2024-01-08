import java.util.Scanner;

/*Ídem una versión que calcule el máximo de 3 números.*/
public class bol06e03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numUno, numDos,numTres;
        System.out.println("Introduce número");
        numUno= scanner.nextInt();
        System.out.println("Introduce otro número");
        numDos=scanner.nextInt();
        System.out.println("Introduce el último número");
        numTres=scanner.nextInt();

        System.out.println("El número más grande es " + maximo(numUno,numDos,numTres));
    }

    public static int maximo(int num, int numD, int numT){
        if (num>numD && num>numT) return num;
        else if (numD>num && numD>numT) return numD;
        return numT;
    }
}
