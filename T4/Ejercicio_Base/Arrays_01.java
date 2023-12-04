//Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación se mostrará el contenido de ese array junto al índice (0 – 9)
import java.util.*;
public class Arrays_01 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int arrays[]=new int[10];
        int f=1;

        for(int i=0; i<arrays.length; i++) {
            System.out.println("Por favor introduce el número "+ f + " : " );
            arrays[i]=teclado.nextInt();
            f++;
        }

        for(int a=0; a<arrays.length; a++) {
            System.out.println("El número correspondiente al índice " + a + " es: " + arrays[a]);
        }
    }

}