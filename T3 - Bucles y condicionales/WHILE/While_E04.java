//Introducir un entero no negativo, y convertirlo a binario, octal y hexadecimal. (BinarioOctalHexadecimal)

import java.util.*;
public class While_E04 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduce un número entero no negativo");

        int numero=teclado.nextInt(), b, c;
        String base2="", base8="", base16="";
        System.out.print("La conversión de " + numero);
        b=numero;
        c=numero;

        while(b>0) {
            base2=(b%2)+base2;
            b/=2;
        }
        while(numero>0) {
            base8=(numero%8)+base8;
            numero/=8;
        }

        while(c>0) {

            base16=(c%16)+base16;
            c/=16;
        }

        System.out.print(" en binario es: " + base2 + " en octal: " + base8 + " en hexadecimal: " + base16);

    }

}
