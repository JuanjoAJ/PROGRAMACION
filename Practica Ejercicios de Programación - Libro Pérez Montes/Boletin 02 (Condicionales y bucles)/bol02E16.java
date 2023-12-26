import java.util.Scanner;

/*. Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.*/
public class bol02E16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=0;
        do{
            System.out.println("Introduzca el número del que quiere la tabla");
            num=scanner.nextInt();
        }while (num>10 || num<0);
        System.out.println("Esta es la tabla del " + num);

        for (int i=1; i<=10; i++){
            System.out.println(num +" x "+ i+ " = "+(num*i) );
        }

    }
}
