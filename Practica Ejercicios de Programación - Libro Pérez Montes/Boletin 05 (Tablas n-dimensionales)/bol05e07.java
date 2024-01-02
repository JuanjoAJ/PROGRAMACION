import java.util.Scanner;

/*utilizando dos tablas de tamaño 5x9 y 9x5, cargar la primera y trasponerla en la segunda.*/
public class bol05e07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] arrayUno=new int[5][9], arrayDos=new int[9][5];

        for (int i=0; i<arrayUno.length; i++){
            for (int j = 0; j < arrayUno[i].length; j++) {
                System.out.println("Introduce número");
                arrayUno[i][j]= scanner.nextInt();
                arrayDos[j][i]=arrayUno[i][j];
            }
        }
        imprimir(arrayUno);
        System.out.println("-----------------");
        imprimir(arrayDos);


    }
    public static void imprimir(int[][] array){
        for (int[] item:array) {
            for (int imp:item){
                System.out.print(imp +" ");
            }
            System.out.println();
        }


    }

}
