/*Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición T[n,m]
debe contener n+m. Después se debe mostrar su contenido.
*/
public class bol05e01 {
    public static void main(String[] args) {
        int[][] array=new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=i+j;

            }

        }
        for(int[] item:array){
            for (int imp:item){
                System.out.print(imp + " ");

            }
        }
    }

}
