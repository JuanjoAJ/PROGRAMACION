import java.util.Scanner;

/*(GeneradorPalabras) Crea un programa que cumpla los siguientes requisitos:
- Crear un arrays de chars con todas las letras del abecedario. +
- Crear un array de String con una longitud pedida por teclado +
- Pedir la longitud de cada una de las palabras que formarán parte del array del apartado 2.
 Tras pedir la longitud se creará una palabra de forma aleatoria con la longitud deseada
  (cada letra será una posición del array del apartado 1) y se guardará en el array del apartado 2
- Imprimir por pantalla las palabras generadas
*/
public class ArrayMetodo06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce la longitud del array");
        for (String imp:cadenaPalabra(scanner.nextInt(), scanner)) System.out.println(imp );
    }
public static char[] letras(){
    char[] abc = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o',
            'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    return abc;
    }
public static String palabraCreada(int longitud, char[] letras){
    String palabraCreada="";
    for (int i = 0; i < longitud; i++) palabraCreada += letras[(int) (Math.random() * 23)];
    return palabraCreada;
}
public static String[] cadenaPalabra(int n, Scanner teclado){
        String[] cadenaPalabra=new String[n];
    for (int i = 0; i < n; i++) {
        System.out.println("Introduce la longitud de la palabra");
        cadenaPalabra[i]=palabraCreada(teclado.nextInt(), letras());
    }
    return cadenaPalabra;
}
}
