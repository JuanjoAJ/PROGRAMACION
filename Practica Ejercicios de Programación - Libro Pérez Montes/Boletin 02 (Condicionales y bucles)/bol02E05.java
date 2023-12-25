import java.util.Scanner;

/*Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
cuando el usuario acierta.*/
public class bol02E05 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int random=(int) ((Math.random()*100)+1);
        int num=0;
        do{
            System.out.println("Introduzca un número: ");
            num=s.nextInt();

            if(random>num) System.out.println("Mayor");
            else if (random<num) System.out.println("Menor");
            else System.out.println("Acertaste, el número era " + random);

        }while (random!=num);

    }
}
