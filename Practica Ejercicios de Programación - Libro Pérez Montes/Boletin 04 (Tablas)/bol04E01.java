import java.util.Scanner;

/*Leer 5 números y mostrarlos en el mismo orden introducido.*/
public class bol04E01 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] n=new int[5];
        for (int i=0; i<5; i++){
            System.out.println("Introduce número");
            n[i]=s.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Has introducido el " + n[i]);
        }
    }

}
