import java.util.Scanner;
public class Ejercicio4conResto {

    public static void main(String[] args) {
        Scanner segundos = new Scanner(System.in);

        System.out.println("Introduce segundos: ");

        int valor= segundos.nextInt();

        int hora, rest, min, rest2, seg;

        hora= valor/3600;

        rest= valor%3600;

        min= rest/60;

        rest2=rest%60;

        seg= rest2;

        System.out.println("Número de segundos: " + valor + "\n" + "Horas: " + hora + "\n" + "Minutos: " + min + "\n" + "Segundos: " + seg);


    }
}
