import java.util.Scanner;

/*Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.*/
public class bol02E03 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=0;
        do{
            System.out.println("Introduzca un número");
            num= s.nextInt();
            if(num%2==0) System.out.println("Es par");
            else System.out.println("Es impar");
        }while (num!=0);

    }
}
