import java.util.Scanner;

/*Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
 */
public class E14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Indique la nota");
        int nota= scanner.nextInt();
        switch (nota){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("SUFICIENTE");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7:
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
            case 10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("Esa nota es errónea");
                break;
        }
    }



}
