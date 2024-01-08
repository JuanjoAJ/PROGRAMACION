import java.util.Scanner;

/*Ídem con tres números.*/
public class bol06e15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número");
        int numUno= scanner.nextInt();
        System.out.println("Introduce otro número");
        int numDos= scanner.nextInt();
        System.out.println("Introduce el último número");
        int numTres= scanner.nextInt();
        int max=max(numUno,numDos,numTres);
        System.out.printf("El mínimo común múltiplo de %d, %d y %d es %d", numUno, numDos,numTres,mcm(max, numUno,numDos,numTres));
    }
    public static int max(int n, int nD, int nT){
        int max;
        if (n>nD && n>nT) max=n;
        else if (nD>n && nD>nT) max=nD;
        else max=nT;

        return max;
    }
    public static int mcm(int max, int a, int b, int c){
        int mcm=max;
        int i=1;
        while (mcm%a!=0 || mcm%b!=0 || mcm%c!=0){
            i++;
            mcm=max*i;

        }
        return mcm;
    }
}
