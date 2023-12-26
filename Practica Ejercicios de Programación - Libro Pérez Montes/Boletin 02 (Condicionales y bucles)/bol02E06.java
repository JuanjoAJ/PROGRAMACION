import java.util.Scanner;

/*Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
 */
public class bol02E06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=0, sum=0;
        do{
            System.out.println("Introduzca número");
            num= scanner.nextInt();
            sum+=num;
        }while (num!=0);
        System.out.println("La suma de todos los número es de " + sum);
    }
}
