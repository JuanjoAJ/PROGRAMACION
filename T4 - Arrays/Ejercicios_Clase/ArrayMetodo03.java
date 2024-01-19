import java.util.Scanner;

/*(SumaArrays) Crear una aplicación que:
    - pida la longitud de dos arrays de enteros
    - crea los array de enteros con las longitudes introducidas
    - crea un tercer array de la misma longitud que los dos anteriores
    - rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)
 */
public class ArrayMetodo03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce la longitud del array");
        int[] array=new int[scanner.nextInt()];
        int[] array2=new int[array.length];

        System.out.println("La suma de los dos array es de: ");
       for (int imp:suma(rellenarArray(array),rellenarArray(array2))){
           System.out.print(imp + " ");
       }

    }
    public static int[] rellenarArray(int[]array){
        for (int i = 0; i < array.length; i++) {
            array[i]=(int) (Math.random()*101)+1;
        }
        return array;
    }
    public static int[] suma(int[] array, int[] array2){
        int[] suma=new int[array.length];
        for (int i = 0; i < array.length; i++) {
           suma[i]=array[i]+array2[i];
        }
        return suma;
    }
}
