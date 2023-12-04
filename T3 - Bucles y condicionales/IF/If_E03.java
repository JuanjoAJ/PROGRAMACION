/*Léase un número entero. Se comprobará si dicho número es o no múltiplo de 20,
 y también se comprobará si está o no entre -100 y 100. En la salida se mostrará uno de los siguientes mensajes:

“Es múltiplo de 20 y está entre -100 y 100”.
“Es múltiplo de 20 y no está entre -100 y 100”.
“No es múltiplo de 20 y está entre -100 y 100”-
“No es múltiplo de 20 y no está entre -100 y 100”.
** Un número es múltiplo de otro cuando su resto es igual a 0 **
*/

import java.util.*;

public class If_E03 {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduzca un numero");

        int var1=teclado.nextInt();

        if ((var1>=-100)&&(var1%20==0)&&(var1<=100)) {

            System.out.println("Es múltiplo de 20 y está entre -100 y 100");

        }
        else if ((var1<-100)||(var1>100)&&(var1%20==0)) {

            System.out.println("Es múltiplo de 20 y no está entre -100 y 100");
        }

        else if ((var1<-100)||(var1>100)&&(var1%20!=0)) {

            System.out.println("No es múltiplo de 20 y no está entre -100 y 100");

        }
        else {

            System.out.println("No es múltiplo de 20 y está entre -100 y 100");

        }

    }


}
