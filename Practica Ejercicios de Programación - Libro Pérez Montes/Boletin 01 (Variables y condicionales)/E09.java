import java.util.Scanner;

/*Pedir dos números y mostrarlos ordenados de mayor a menor.*/
public class E09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos números");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a>b) System.out.println(a + " " + b);
        else System.out.println(b + " " + a);
    }
}
