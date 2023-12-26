import java.util.Scanner;

/*Pedir un número N, y mostrar todos los números del 1 al N.*/
public class bol02E08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número");
        int n= scanner.nextInt();
        System.out.print("Hasta llegar al número " + n +" antes están ");
        for (int i=1; i<n; i++ ){
            System.out.print(i + " ");
        }
    }
}
