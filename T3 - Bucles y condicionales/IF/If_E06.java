/*Introducir tres enteros entre -100 y 100.
 *  De cumplir los tres números la condición del rango, se obtendrá la suma de sus inversos (1/número).
 *  En el caso de no estar alguno de los números en el rango se mostrará el mensaje “Alguno de los números no está entre -100 y 100”.
 *  No se sumará el inverso de aquellos valores que sean 0.
 *  Por ejemplo, se introducen los enteros 20, -4 y 100, y se muestra el valor 1/20 + 1/-4 + 1/100 = -0.19000.
 *
 */

import java.util.*;
public class If_E06 {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);

        System.out.println("Intoduzca 3 enteros entre -100 y 100");

        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3= teclado.nextInt();


        if (num3>100 && num2>100 && num1>100 && num3<-100 && num2<-100 && num1<-100 && num3==0 && num2==0 && num1==0 ) {
            System.out.println("Alguno de los números no está entre -100 y 100");
        }else {

            double d1, d2, d3;
            d1=num1;
            d2=num2;
            d3=num3;
            double suma= 1/d1 + 1/d2 + 1/d3;

            System.out.println("La suma del valor inverso de " + num1 + " " + num2 + " " + num3 + " es " + suma);
        }

    }

}
