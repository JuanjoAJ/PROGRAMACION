import java.util.Scanner;

/*Crear y cargar una tabla de tamaño 10x10, mostrar la suma de cada fila y de cada columna.
 */
public class bol05e06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] array=new int[10][10];
        int sumaF=0, sumaC=0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introduzca número");
                array[i][j]=scanner.nextInt();

            }

        }

        for (int i=0; i< array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                sumaF+= array[i][j];
                sumaC+= array[j][i];
                if (j== array[i].length-1){
                    System.out.println("La suma de la fila es de " + sumaF);
                    sumaF=0;
                }
                if (j== array[j].length-1){
                    System.out.println("La suma de la columna es de " + sumaC);
                    sumaC=0;
                }
            }
        }

    }
}
