//Se leen tres enteros y un valor booleano para ordenarlos ascendentemente o descendentemente. Se mostrarán los valores leídos ordenados.
import java.util.*;
public class If_E11 {public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca 3 enteros: ");

    int num1 = teclado.nextInt();
    int num2 = teclado.nextInt();
    int num3 = teclado.nextInt();

    System.out.println("Si lo quiere en orden descendente: true");
    boolean a = teclado.hasNextBoolean();

    System.out.println(a);
    if (a == true) {
        if ((num1 > num2) && (num2 > num3)) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if ((num3 > num2) && (num2 > num1)) {
            System.out.println(num3 + " " + num2 + " " + num1);
        } else if ((num2 > num1) && (num1 > num3)) {
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if ((num2 > num3) && (num3 > num1)) {
            System.out.println(num2 + " " + num3 + " " + num1);
        } else if ((num1 > num3) && (num3 > num2)) {
            System.out.println(num1 + " " + num3 + " " + num2);
        } else {
            System.out.println(num3 + " " + num1 + " " + num2);
        }
    } else {
        if ((num1 < num2) && (num2 < num3)) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if ((num3 < num2) && (num2 < num1)) {
            System.out.println(num3 + " " + num2 + " " + num1);
        } else if ((num2 < num1) && (num1 < num3)) {
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if ((num2 < num3) && (num3 < num1)) {
            System.out.println(num2 + " " + num3 + " " + num1);
        } else if ((num1 < num3) && (num3 < num2)) {
            System.out.println(num1 + " " + num3 + " " + num2);
        } else {
            System.out.println(num3 + " " + num1 + " " + num2);
        }

    }
    }
}
