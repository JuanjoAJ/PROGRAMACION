/* Crea un programa que pida 10 palabras por consola y las guarde en un array de String.
 *  Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
 * - Ver todas las palabras: mostrarla todas las palabras del array
 * - Obtener una palabra al azar: mostrará una palabra de las que existen en el array
 * - Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
 * - Ver media de letras: mostrará el número medio de letras entre todas las palabas
 * - Ver palabra con más letras
 * - Ver palabra con menos letras
 */
import java.util.*;
public class Arrays_07 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String [] palabras=new String[10];
        int p=10;
        for (int i=0; i<palabras.length ;i++) {
            System.out.println("Por favor, introduzca la palabra número " + p + ":");
            p--;
            palabras[i]=teclado.next();
            if(palabras[i]== null ) {
                while(palabras[i]== null ) {
                    System.out.println("Lo siento debe introducir una palabra");
                    palabras[i]=teclado.next();
                }
            }
        }
        System.out.println("Elija una de las siguientes opciones: \n 1) Ver todas las palabras: \n 2) Obtener una palabra al azar: \n 3) Ver número de letras:  \n 4) Ver media de letras: "
                + "\n 5) Ver palabra con más letras: \n 6) Ver palabra con menos letras");

        int opcion=teclado.nextInt();

        switch(opcion) {
            case 1:
                for(String imprimir:palabras) {
                    System.out.print(imprimir + " ");}
                break;

            case 2:
                int r=(int)(Math.random()*10);
                System.out.println(palabras[r]);
                break;

            case 3:
                int sum=0;
                for (int j=0; j<palabras.length; j++) {
                    sum+=palabras[j].length();
                }
                System.out.println("La suma de letras entre todas las palabras es de " + sum);
                break;

            case 4:
                int medi=0;
                for (int j=0; j<palabras.length; j++) {
                    medi+=palabras[j].length();
                }
                System.out.println("La media de letras entre todas las palabras es de " + medi/palabras.length);
                break;

            case 5: //Ver palabra con más letras

                Arrays.sort(palabras);
                System.out.println(palabras[palabras.length-1]);

                break;

            case 6:

                Arrays.sort(palabras);
                System.out.println(palabras[0]);
                break;

        }

    }

}