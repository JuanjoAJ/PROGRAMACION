import java.util.Scanner;

/*Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca
un 0.*/
public class bol02E02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double num=1;
        do{
            System.out.println("Introduzca un número");
            num= s.nextDouble();
            if(num<0) System.out.println("Es negativo");
            else System.out.println("Es positivo");
        }while(num!=0);

    }

}
