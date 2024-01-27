import java.util.Scanner;

/* (MultiplicarArray) Crear un array de 5 posiciones:
    - se le pedirá al usuario que introduzca cada unos de los elementos del array
    - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
    - Saca por consola la suma de todos los números
    - Saca la media de todos los elementos
 */
public class ArrayMetodo01 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int[] array=tabla(teclado);
        consola(multiplicacion(array));

    }
    private static int[] tabla(Scanner teclado){
        int[] array=new int[5];
        for (int i = 0; i < array.length; i++) {
         array[i]= teclado.nextInt();
        }
        return array;
    }
    private static int[] multiplicacion(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]*=2;
        }
        return array;
    }
    private static int suma(int[] array){
        int suma=0;
        for (int i = 0; i < array.length; i++) {
           suma+=array[i];
        }

        return suma;
    }
    private static void consola(int[] array){
        System.out.println("La suma de todos los números es de " + suma(array));
        System.out.println("La media de todos los elementos es de " + suma(array)/ array.length);
    }
}


