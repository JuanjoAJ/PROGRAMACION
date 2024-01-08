import java.util.Scanner;

/*Escriba una función que decida si dos números enteros positivos son amigos. Dos números son
amigos, si la suma de sus divisores (distintos de ellos mismos) son iguales.*/
public class bol06e17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número");
        int n= scanner.nextInt();
        System.out.println("Introduce otro número");
        int nD= scanner.nextInt();

        if(amigos(n,nD)) System.out.printf("Los números %d y %d son amigos",n,nD);
        else System.out.printf("Los números %d y %d no son amigos",n,nD);

    }
    public static int sumaDivisores(int n) {
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
    public static boolean amigos(int a, int b) {
        return sumaDivisores(a) == b && sumaDivisores(b) == a;
    }

}
