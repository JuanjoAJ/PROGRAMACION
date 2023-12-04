/*Pedir una palabra por teclado y comprobar si es o con capicua. Una palabra es palíndromo cuando se lee igual de izquieda a derecha que de derecha a izquierda.
 * Por ejemplo ana, oro, radar. Para poder hacer la comprobacion no se tendrán en cuenta mayusculas ni acentos (CapicuaPalabra)
 */
import java.util.*;
public class For_E14 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String reves="";
        String palabra=teclado.next();
        for(int i=1; i<=palabra.length(); i++) {
            reves+=palabra.charAt(palabra.length()-i);
        }
        if(palabra.equalsIgnoreCase(reves)) {
            System.out.println(palabra + " es un palíndromo.");
        }else {
            System.out.println(palabra + " no es un palíndromo.");
        }
   }
}