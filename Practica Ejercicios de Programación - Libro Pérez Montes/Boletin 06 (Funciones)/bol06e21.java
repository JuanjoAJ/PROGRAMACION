import java.util.Scanner;

/* Escriba una función que sume los n primeros números impares.
 */
public class bol06e21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número");
        int n= scanner.nextInt();
        System.out.println("La suma de todos sus números impares es de " + impar(n));
    }

    public static int impar(int n){
        int suma=0;
        for (int i=1; i<=n; i+=2){
         suma+=i;
        }
        return suma;
    }
}
