/*Dibuja un cuadrado de n elementos de lado utilizando *.  */

import java.util.Scanner;

public class bol03E04 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Introduce numero");
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
