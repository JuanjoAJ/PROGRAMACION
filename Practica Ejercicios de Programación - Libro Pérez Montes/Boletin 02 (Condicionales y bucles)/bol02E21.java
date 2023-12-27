/*. Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
 */

import java.util.Scanner;

public class bol02E21 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        boolean neg=false;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce número");
            n=s.nextInt();
            if (n<0) neg=true;
        }
        if (neg) System.out.println("Se ha introducido un número negativo");
        else System.out.println("No se ha introducido ningún número negativo");

    }
}
