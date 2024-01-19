import java.util.Scanner;

/*(MayorArray) Crea una aplicación que realice lo siguiente:
    - pida por pantalla la longitud del array de enteros
    - crea el array de enteros con la longitud introducida
    - pida al usuario que introduzca todos los datos del array
    - saque por pantalla el elemento mayor y el elemento menor
 */
public class ArrayMetodo02 {
    public static void main(String[] args) {
        int[]arrays=orden(arrays());
        System.out.printf("El elemento mayor del arreglo es %d, mientras que el menor es %d", arrays[arrays.length-1],arrays[0]);

    }
    public static int[] arrays(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca la longitud");
        int[] array=new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca número");
            array[i]= scanner.nextInt();
        }
        return array;
    }
    public static int[] orden(int[] array){
        int aux;
        for (int j=0; j<array.length; j++){
        for (int i = 1; i < array.length; i++) {
         if (array[i-1]>array[i] ){
             aux=array[i];
             array[i]=array[i-1];
             array[i-1]=aux;
         }
        }}
        return array;
    }
}
