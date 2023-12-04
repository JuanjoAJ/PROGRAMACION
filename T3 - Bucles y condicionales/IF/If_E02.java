/*Hágase un programa que lea tres enteros positivos, y compruebe si alguno es suma de los otros dos.
 * En la salida se mostrará “Ninguno es suma de los otros dos”
 */

import java.util.*;
public class If_E02 {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);

		System.out.println("Por favor introduzca tres números enteros: ");

    int var1= teclado.nextInt();
    int var2 = teclado.nextInt();
    int var3 = teclado.nextInt();


		if ((var1==var2+var3)||(var2==var1+var3)||(var3==var1+var2)) {

        System.out.println("La suma de dos valores es igual a una de las variables");

    }
		else {
        System.out.println("La suma de dos valores no da como resultado la otra variable");
    }

}




}
