import java.util.Scanner;

/*Leer 5 números y mostrarlos en orden inverso al introducido.*/
public class bol04E02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] num=new int[5];

        for (int i = 0; i <5 ; i++) {
            System.out.println("Introduce número");
            num[i]=s.nextInt();
        }
        for (int i = num.length-1; i >= 0 ; i--) {
            System.out.println("El número que has introducido es " + num[i]);
        }

    }
}
