/*Realiza un programa que pida al usuario ingresar un carácter que represente una operación matemática (+, -, *, /)
 * y dos números. Luego, utiliza una sentencia switch para realizar la operación correspondiente y mostrar el resultado.
 */

import java.util.Scanner;
public class Switch_E08 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduce carácter matemático");

        char op= teclado.next().charAt(0);

        System.out.println("Introduce dos números");

        int num1= teclado.nextInt();
        int num2= teclado.nextInt();

        //Otra opción sería declarar: int result= 0;
        switch (op) {

            case '+':
                System.out.println("La suma de " + num1 + " + " + num2 + " = " + (num1+num2)); //opción 2 es: result= num1+num2;
                break;
            case '-':
                System.out.println("La resta de " + num1 + " -  " + num2 + " = " + (num1-num2)); //opción 2 es: result= num1-num2; etc.
                break;
            case '*':
                System.out.println("La multiplicación de " + num1 + " * " + num2 + " = " + (num1*num2));
                break;
            case '/':
                System.out.println("La división de " + num1 + " / " + num2 + " = " + (num1/num2));

        }


    }

}
