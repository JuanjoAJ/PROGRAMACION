/*(GeneradorPalabras) Crea un programa que cumpla los siguientes requisitos:
- Crear un arrays de chars con todas las letras del abecedario. +
- Crear un array de String con una longitud pedida por teclado +
- Pedir la longitud de cada una de las palabras que formarán parte del array del apartado 2.
 Tras pedir la longitud se creará una palabra de forma aleatoria con la longitud deseada
  (cada letra será una posición del array del apartado 1) y se guardará en el array del apartado 2
- Imprimir por pantalla las palabras generadas
*/
import java.util.*;

public class ArraysMult_06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        char[] letras = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o',
                'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        System.out.println("Introduce la cantidad de palabras");
        String palabra[] = new String[teclado.nextInt()];
        palabra[0] = "";
        int numLetra;

        for (int j = 0; j < palabra.length; j++) {
            do {
                System.out.println("Introduce la longitud de la palabra nº " + (j + 1));
                numLetra = teclado.nextInt();
            } while (numLetra <= 0);
            for (int i = 0; i < numLetra; i++) {
                palabra[j] += letras[r.nextInt(0, 27)];
            }
        }
        for (String im : palabra) {

            System.out.println(im);
        }

    }

}
