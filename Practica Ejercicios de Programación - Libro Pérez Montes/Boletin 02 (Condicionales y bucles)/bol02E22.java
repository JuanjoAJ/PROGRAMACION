import java.util.Scanner;

/*Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
 */
public class bol02E22 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n;
        boolean sus=false;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce nota");
            n=s.nextInt();
            if (n<5) sus=true;
        }
        if (sus) System.out.println("Hay algún suspenso");
        else System.out.println("Todos han aprobado");

    }
}
