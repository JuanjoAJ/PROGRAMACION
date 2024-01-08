import java.util.Arrays;
import java.util.Scanner;

/*DUF que ordene la tabla que se le pasa.*/
public class bol06e28 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] t=new int[10];
        for (int i = 0; i < t.length; i++) {
            System.out.println("Introduce número");
            t[i]=scanner.nextInt();
        }

        for (int imp:ordenDificil(t)){
            System.out.print(imp + " ");
        }

    }
    public static int[] ordenFacil(int[] a){
      Arrays.sort(a);
      return a;
    }

    public static int[] ordenDificil(int[]a){
        int aux;
        for (int j = 0; j < a.length; j++) {

            for (int i = 1; i < a.length; i++) {
                if (a[i] < a[i - 1]) {
                    aux = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = aux;
                }
            }
        }
        return a;
    }

}
