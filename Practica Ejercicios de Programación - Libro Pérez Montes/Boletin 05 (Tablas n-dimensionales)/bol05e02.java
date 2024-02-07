import java.util.Scanner;

/*Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir, si se obtiene la misma
tabla al cambiar filas por columnas.
*/
public class bol05e02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] array=new int[4][4];
        boolean simetrico=true;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introduce número");
                array[i][j]= scanner.nextInt();
            }

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]!=array[j][i]){
                    simetrico=false;
                    break;
                }

            }
            if (!simetrico) break;
        }

        if (!simetrico) System.out.println("No es simétrico");
        else System.out.println("Es simétrico");

    }
}
