//Leer números enteros hasta introducir un 0. El programa obtendrá la suma de todos los números positivos. (SumarPositivos)

import java.util.*;
public class While_E01 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        int num, suma;
        num=1;
        suma=0;
        System.out.println("Introduce numero enteros. Para terminar la suma por favor introduzca 0");

        do {

            num =teclado.nextInt();
            if(num>0) {
                suma+=num;
            }
        }
        while (num!=0);
        System.out.println("La suma de los números introducidos es: " + suma);
    }

}
