import java.util.Scanner;

/*Realizar una función, a la que se le pase como parámetro un número N, y muestre por pantalla N
veces, el mensaje: “Módulo ejecutándose”
*/
public class bol06e01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("Introduzca un número");
        n=scanner.nextInt();
        muestra(n);

    }
    public static void muestra(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("Módulo ejecutándose");
        }
    }
}
