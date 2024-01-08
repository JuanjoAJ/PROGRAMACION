import java.util.Scanner;

/*.Escribir una función que calcule el mínimo común múltiplo de dos números.
  el mínimo común múltiplo de dos números como la multiplicación de ambos
 divido por el mcd*/
public class bol06e14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número");
        int numUno= scanner.nextInt();
        System.out.println("Introduce otro número");
        int numDos= scanner.nextInt();

        int mcm=min(numUno,numDos);
        mcm=mcd(numUno,numDos,mcm);
        mcm=mcm(mcm, numUno,numDos);

        System.out.printf("El mínimo común múltiplo de %d y %d es %d",numUno,numDos,mcm);

    }
    public static int min(int n, int nD){
       int min;
        if (n>nD){
            min=nD;
        }else min=n;
        return min;
    }
    public static int mcd(int n, int nD, int min){
        int mcd=1;
        for (int i = 2; i < min; i++) {
            if(n%i==0 && nD%i==0) mcd=i;
        }
        return mcd;
    }
    public static int mcm(int mcd, int n, int nD){
        int mcm= (n*nD)/mcd;
        return mcm;
    }
}
