/* (MultiplicarArray) Crear un array de 5 posiciones:
    - se le pedirá al usuario que introduzca cada unos de los elementos del array
    - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
    - Saca por consola la suma de todos los números
    - Saca la media de todos los elementos
 */
import java.util.*;
public class ArraysMult_01 {

    public static void main(String[] args) {
        int [] num=new int[5];
        int suma=0;
        Scanner teclado=new Scanner(System.in);

        for(int i=0; i<num.length;i++) {
            System.out.println("Introduzca número");
            num[i]=(teclado.nextInt()*2);
        }
        for (int i=0; i<num.length;i++) {
            suma+=num[i];
        }
        System.out.println("La suma de todos los elementos es de " + suma);
        System.out.println("La media de todos los elementos es de " + suma/num.length);
    }
}