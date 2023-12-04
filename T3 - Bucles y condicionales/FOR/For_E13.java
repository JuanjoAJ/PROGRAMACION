/*Pedir una palabra por teclado y mostrar su contraria.
 *  Por ejemplo se introducirá la palabra programacion y se mostrará por consola la palara noicamargorp (InversaPalabra)
 */

import java.util.*;
public class For_E13 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Por favor introduzca una palabra: ");
        String word=teclado.next();
        String reves="";
        for(int i=1; i<=word.length();i++) {
            reves+=word.charAt(word.length()-i );
        }
        System.out.println(reves);
    }

}