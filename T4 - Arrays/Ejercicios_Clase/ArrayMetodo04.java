/*(PosicionesArray) Crea una aplicación que:
        - pida por teclado la longitud de un array
        - cree el array de enteros de la longitud introducida
        - pida al usuario que introduzca todos los datos del array -> Esto ya se hizo en Metodo02
        - mueva una posición todos los elementos. el elemento de la posición 0 pasa a la posición 1 y así sucesivamente. El elemento que está en la última posición pasa a la primera
        - realizar la tarea anterior pero al contrario. El elemento que está en la primera posición pasa a la última y así sucesivamente*/
public class ArrayMetodo04 {
    public static void main(String[] args) {
        ArrayMetodo02 relleno=new ArrayMetodo02();
       int[] array= relleno.arrays();
        imprimir(array);
        derecha(array);
        izquierda(array);


    }
    public static void derecha (int[] array){
        int aux= array[array.length-1];
        for (int i = array.length-1; i > 0; i--) {
            array[i]=array[i-1];
        }array[0]=aux;
        imprimir(array);
    }
    public static void izquierda(int[] array){
        int aux=array[0];
        for (int i = 1; i < array.length; i++) {
            array[i-1]=array[i];
        }array[array.length-1]=aux;
        imprimir(array);


    }
    public static void imprimir(int[] array) {
        for (int imp : array) {
            System.out.print(imp + " ");
        }
        System.out.println();
    }

}
