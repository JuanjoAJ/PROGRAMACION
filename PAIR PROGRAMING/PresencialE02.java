import java.util.Scanner;

/*Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o
buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente.
Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado*/
public class PresencialE02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Indicamos la hora");
        int hora= scanner.nextInt();

        switch (hora){
            case 21:
            case 22:
            case 23:
            case 24:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Buenas noches");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Buenos dias");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("Buenas tardes");
                break;
            default:
                System.out.println("Hora no correcta");
                break;

        }
    }
}
