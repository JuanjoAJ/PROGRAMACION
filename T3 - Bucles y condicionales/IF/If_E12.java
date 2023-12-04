/*Leer un número entero, se realizarán las siguientes acciones:
 * incrementará en 2 unidades si es par
 * en 3 unidades si es múltiplo de 3
 * en 5 unidades si es múltiplo de 5
 * en el caso de no cumplirse ninguna de las anteriores, se incrementará en una unidad.
 * Sólo se realiza un incremento.
 * Mostrar por consola el valor del número obtenido*/

import java.util.Scanner;

public class If_E12 {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduce un entero ");

        int num= teclado.nextInt();

        if(num%2==0) {
            num+=2;
        }else if(num%3==0){
            num+=3;
        }else if(num%5==0) {
            num+=5;
        }else {
            num++;
        }
        System.out.println("El valor obtenido es " + num);

    }
}
