import java.util.Scanner;

/*. Pedir un número y calcular su factorial.
 */
public class bol02E12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca un número");
        int n= scanner.nextInt();
        long factorial=1;

        for (int i=1; i<=n; i++){
            factorial*=i;

        }
        System.out.println(factorial);

    }
}
