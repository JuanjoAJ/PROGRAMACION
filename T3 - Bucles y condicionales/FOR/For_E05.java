/*Dado dos enteros entre 0 y 5 (la base y el exponente), obtener la potencia del primero elevado al segundo sin utilizar el método “pow”.
 *Por ejemplo, base = 3 y exponente = 5, 35=3x3x3x3x3=243.
 *Casos particulares: 00 = Error y n0 = 1.(BaseExponente)
 */

import java.util.*;
public class For_E05 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce base: ");
        int base=teclado.nextInt();
        System.out.println("Introduce exponente: ");
        int expo=teclado.nextInt();
        int resul=base;
        if (base<=0 && expo<=0) {
            System.out.println("Error");
        }else if( expo==0) {
            System.out.println("El resultado de la base " + base + " elevado a " + expo + " es 1");
        }else{
            for(int i=1; i<expo; i++) {
                resul*=base;

            }
            System.out.println("El resultado de la base " + base + " elevado a " + expo + " es " + resul);
        }
    }
}