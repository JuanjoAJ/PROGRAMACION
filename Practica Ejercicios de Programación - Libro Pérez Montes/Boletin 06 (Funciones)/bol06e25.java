import javax.swing.*;
import java.util.Scanner;

/*DUF a la que se le pasa una tabla de enteros y un número. Debemos buscar el número en la tabla e
indicar si se encuentra o no.*/
public class bol06e25 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] t=new int[10];
        for (int i = 0; i < t.length; i++) {
            t[i]=(int) (Math.random()*100)+1;
        }
        System.out.println("Introduzca un número");
        int n= scanner.nextInt();
        if(esta(t, n)) System.out.println("El número está en la tabla");
        else System.out.println("El número no está en la tabla");
    }

    public static boolean esta (int []a, int n){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==n) return true;
        }

        return false;
    }
}
