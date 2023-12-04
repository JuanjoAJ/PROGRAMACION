/*Calcúlese el mínimo común múltiplo de dos números entre 1 y 100. Para obtener el mcm se tomará uno de los valores introducidos y se irá multiplicando por 1, 2, 3, etc,
 *hasta que el valor obtenido sea múltiplo del otro número, que sería el valor buscado. (MinimoComunMultiplo)
 */
import java.util.*;
public class While_E02 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        int num1, num2, mcm, rest;
        mcm=1;
        rest=1;
        System.out.println("Introduce dos números enteros entre 1 a 100");

        num1=teclado.nextInt();
        num2=teclado.nextInt();

        while (mcm%num2!=0) {


            mcm=(rest++)*num1;


        }
        System.out.println("Para " + num1 + " y " + num2 + " el minimo común múltiplo es " + mcm);

    }
}