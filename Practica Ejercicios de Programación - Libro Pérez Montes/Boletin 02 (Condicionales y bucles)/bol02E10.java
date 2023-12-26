import java.util.Scanner;

/*Pedir 15 números y escribir la suma total.
 */
public class bol02E10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num=0;
        for(int i=0; i<15; i++){
            System.out.println("Introduzca número");
            num+=scanner.nextInt();
        }
        System.out.println("La suma total es de " + num);
    }
}
