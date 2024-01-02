import java.util.Scanner;

/*Los siguientes programas piden una serie de datos y tras procesarlos ofrecen unos resultados por
pantalla. Mostrar el resultado:
pagina 207
*/
public class bol05e10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i,m,a;
        int[] t=new int[5];
        for (int j = 0; j < t.length; j++) {
            t[j]=scanner.nextInt();
        }
        m=0;
        for (i=0; i< t.length; i++){
            if (t[i] > m ) m = t[i];
        }
        a = t[4-m];
        t[4-m] = t[m];
        t[m] = a;

        for(int item:t){
            System.out.println(item);
        }
    }

}
class bol05e10b{

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=10;
        int[] a=new int[10], b=new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i]=scanner.nextInt();
        }
        for (int i = 0; i < n/2; i++) {
            b[i]=a[n-1-i];
            b[n-1-i]=a[i];
        }
        for (int i = 0; i < n-1; i++) {
            if(i%2==0) System.out.println (a[i]);
            else System.out.println (b[i]);
        }
    }
}
