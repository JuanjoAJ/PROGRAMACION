import java.util.Scanner;

/*Crear y cargar una tabla de tamaño 3x3, trasponerla y mostrarla.*/
public class bol05e04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] array=new int[3][3];
        int[][] arrayTras=new int [3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introduce número");
                array[i][j]= scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
            arrayTras[j][i]=array[i][j];
            }
        }
        System.out.println("El array trapuesto es: ");
        for(int[] item:arrayTras){
            for(int imp:item){
                System.out.print(imp + " ");
            }
        }
    }
}
