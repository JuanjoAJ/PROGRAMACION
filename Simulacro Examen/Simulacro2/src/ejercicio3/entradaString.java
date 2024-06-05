package ejercicio3;

import java.util.Scanner;

/*3.	Pedir una palabra por teclado (sin acentos). Transformar esta palabra para:
a.	Si su longitud es menor de 4, transformar todas sus letras en mayúsculas
b.	Si su longitud es mayor igual que 4 pero menor que 8, transformar sus letras en minúsculas
c.	Si su longitud es mayor igual que 8 pero menor que 11, todas las vocales deberán estar acentuadas
d.	Si la longitud es mayor igual a 11 se deberá dar la vuelta a la palabra
*/
public class entradaString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce una palabra sin acentos");
        String palabra= scanner.next();

        if (palabra.length()<4){
            palabra=palabra.toUpperCase();
            System.out.println(palabra);
        } else if ( palabra.length()<8) {
           palabra= palabra.toLowerCase();
            System.out.println(palabra);
        } else if ( palabra.length()<11) {
            palabra=palabra.replaceAll("a","á")
                    .replaceAll("e", "é")
                    .replaceAll("i", "í")
                    .replaceAll("o", "ó")
                    .replaceAll("u","ú");
            System.out.println(palabra);
        }else {
            String palabraAux="";
            for (int i = palabra.length()-1; i >= 0; i--) {
                palabraAux+=palabra.charAt(i);
            }
            palabra=palabraAux;
            System.out.println(palabra);
        }


    }
}
