import java.util.Scanner;

/*Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la
forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
*/
public class bol04e06 {
    public static void main(String[] args) {
        int[] arrayUno=new int[12], arrayDos=new int[12], arrayTres=new int[24];
        array(arrayUno);
        array(arrayDos);
        int j=0,k=0;
        for (int i = 0; i < 24; i++) {

            arrayTres[i]=arrayUno[j];
            i++;
            j++;
            arrayTres[i]=arrayUno[j];
            i++;
            j++;
            arrayTres[i]=arrayUno[j];
            i++;
            j++;
            arrayTres[i]=arrayUno[k];
            i++;
            k++;
            arrayTres[i]=arrayUno[k];
            i++;
            k++;
            arrayTres[i]=arrayUno[k];
            k++;

        }
        for (int item:arrayTres){
            System.out.print(item + " ");
        }

    }
    public static int[] array(int[] array) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Inserte el número " + (i + 1));
            array[i] = s.nextInt();
        }
        return array;


    }
}
