/* Crear un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array. Una vez metidos, se deberá mostrar:
 * - Numero de puntos obtenidos
 * - Media de puntos obtenidos
 */

public class Arrays_02 {

    public static void main(String[] args) {

        int[] numAle=new int[30];
        int sum=0;
        for(int i=0; i<numAle.length; i++) {

            numAle[i]=(int) (Math.random()*11);
            sum+=numAle[i];
        }
        for(int a:numAle) {
            System.out.print(a + " ");

        }
        System.out.println();
        System.out.println("La suma es " + sum);
        System.out.println("La media es " +sum/30);
    }

}
