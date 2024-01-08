import java.util.Scanner;

/*DUF que calcule an.*/
public class bol06e19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número");
        int a= scanner.nextInt();
        System.out.println("A cuanto quieres elevarlo");
        int n= scanner.nextInt();
        System.out.printf("El número %d elevado a %d es %d",a,n,pow(a,n));
    }
    public static int pow(int n, int a){
        int pow=(int) Math.pow(n,a);
        return pow;
    }
}
