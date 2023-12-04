/*(SumaArrays) Crear una aplicación que:
    - pida la longitud de dos arrays de enteros
    - crea los array de enteros con las longitudes introducidas
    - crea un tercer array de la misma longitud que los dos anteriores
    - rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)
 */
import java.util.*;
public class ArraysMult_03 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Random r=new Random();

        System.out.println("Por favor, introduzca la longitud de las cadenas");
        int [] arraysPrimero=new int [teclado.nextInt()];
        int [] arraysSegundo=new int [arraysPrimero.length];
        int[]arraysTercero=new int[arraysPrimero.length];

        for(int i=0; i<arraysPrimero.length; i++) {
            arraysPrimero[i]=r.nextInt(1,99);
            arraysSegundo[i]=r.nextInt(1,99);
            arraysTercero[i]=arraysPrimero[i]+arraysSegundo[i];
        }
        for(int j=0; j<arraysTercero.length; j++) {
            System.out.printf("\n La suma de los arrays %d y %d es de %d \n",arraysPrimero[j], arraysSegundo[j], arraysTercero[j]);
        }

    }

}
