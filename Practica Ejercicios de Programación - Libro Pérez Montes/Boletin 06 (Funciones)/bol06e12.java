import java.util.Scanner;

/*Ídem con tres números.*/
public class bol06e12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numUno, numDos, numTres,min;
        System.out.println("Introduce el primer número");
        numUno= scanner.nextInt();
        System.out.println("Introduce el segundo número");
        numDos= scanner.nextInt();
        System.out.println("Introduce el tercer número");
        numTres= scanner.nextInt();
        min= min(numUno, numDos,numTres);
        System.out.printf("El máximo común divisor entre %d, %d y %d es %d",numUno,numDos,numTres,mcd(numUno,numDos,numTres,min));

    }
    public static int min(int numUno, int numDos, int numTres){
        int min=0;
        if (numUno > numDos) {
            if (numDos > numTres) {
                min = numTres;
            } else if (numTres > numDos) {
                min = numDos;
            }
        } else if (numDos > numUno) {
            if (numTres < numUno) {
                min = numTres;
            }
            else {
                min = numUno;
            }
        } else {
            min = numUno;
        }
        return min;
    }
    public static int mcd(int a, int b, int c, int min){
        int mcd=1;
        for (int i = 2; i < min; i++) {
            if(a%i==0 && b%i==0 && c%i==0) mcd=i;
            }
        return mcd;
    }

}
