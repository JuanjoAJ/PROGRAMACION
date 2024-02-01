import java.util.ArrayList;
import java.util.Arrays;

/*Crea un programa que cree un ArrayList de palabras, introduce en él 10 palabras cualquiera.
 Muestra el número de letras de todas las palabras, la palabra con más letras y la palabra con menos letra*/
public class ArrayList_05 {
    public static void main(String[] args) {
        ArrayList<String> lista=new ArrayList<>(Arrays.asList("Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez"));
        int min=2147483647, max=0, suma=0;
        String minPalabra="",maxPalabra="";
        for (String palabras:lista){
            suma+=palabras.length();
            if(palabras.length()<min) {
                min=palabras.length();
                minPalabra=palabras;
            }
            if (palabras.length()>max) {
                max=palabras.length();
                maxPalabra=palabras;
            }
        }
        System.out.println("La suma de todas las letras es de " + suma + "\nLa palabra con menos letras es "+ minPalabra+ " con un total de " + min +" letras.\nLa palabra con más letras es "+ maxPalabra +" con un total de "+max+ " letras." );


    }
}
