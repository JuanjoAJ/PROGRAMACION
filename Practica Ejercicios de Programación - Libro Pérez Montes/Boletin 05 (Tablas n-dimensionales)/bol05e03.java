import java.util.Scanner;

/*Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.*/
public class bol05e03 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[][] array=new int[3][3], arrayDos=new int[3][3], arraySuma=new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introduce número del array");
                array[i][j]=scanner.nextInt();
                System.out.println("Introduce número del arrayDos");
                arrayDos[i][j]= scanner.nextInt();
                arraySuma[i][j]=array[i][j]+arrayDos[i][j];
            }
        }
        System.out.println("La suma de ambos arrays es de: ");
        for (int[] item:arraySuma){
            for (int imp:item){
                System.out.print(imp +" ");
            }
        }
    }
}
