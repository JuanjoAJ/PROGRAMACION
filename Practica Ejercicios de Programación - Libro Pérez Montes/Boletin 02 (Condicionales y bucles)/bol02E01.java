import java.util.Scanner;

/*Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
negativo.
*/
public class bol02E01 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=0;
        do {
            System.out.println("Introduzca un número");
            num=s.nextInt();
            System.out.println("El cuadrado de " + num + " es " + Math.pow(num,2));
        }while (num>=0);
    }
}
