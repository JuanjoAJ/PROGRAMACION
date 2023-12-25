import java.util.Scanner;

/*Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.*/
public class E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0, cont=0;
        do {
            System.out.println("Introduce un número entre 0 y 9999");
            num= scanner.nextInt();
            if (num/1000>0)cont=4;
            else if (num/100>0)cont=3;
            else if (num/10>0)cont=2;
            else if(num>0) cont=1;

        }while (num<0 || num>9999 );
        System.out.printf("El número %d tiene %d cifras",num,cont);
    }
}


