/*Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal principal sean 1
y el resto 0.
*/
public class bol05e05 {
    public static void main(String[] args) {
        int[][] array=new int[7][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
             array[i][j]=0;
             array[i][i]=1;
            }
        }
        for (int[] item:array){
            System.out.println();
            for (int imp:item){
                System.out.print(imp + " ");
            }
        }

    }
}
