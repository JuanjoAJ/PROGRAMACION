/*Hacer lo mismo que el ejercicio anterior, pero con una matriz 9x9x9. Es decir, creamos un cubo con
las caras puestas a 1 y el interior a 0.*/
public class bol05e09 {
    public static void main(String[] args) {
        int[][][] marco=new int[9][9][9];

        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                for (int k = 0; k < marco[j].length; k++) {
                    if (i==0 || j==0 || k==0 || i== marco.length-1 || j== marco[i].length-1 || k== marco[j].length-1) marco[i][j][k]=1;
                    else marco[i][j][k]=0;
                }
            }
        }

        for (int[][] item:marco){
            for (int[] it:item){
                for (int imp:it){
                    System.out.print(imp);
                }

            }
            System.out.println();
        }

        System.out.println("Matriz: ");
        for (int i=0;i<9;i++)
        {
            System.out.println("Capa: " +i);
            for (int j=0;j<9;j++)
            {
                for (int k=0;k<9;k++)
                {
                    System.out.print(marco[i][j][k] + " ");
                }
                System.out.println ();
            }
            System.out.println (" -------------- ");
        }
    }
}
