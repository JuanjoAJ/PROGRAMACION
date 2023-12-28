import java.util.Arrays;
import java.util.Scanner;

/*Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar (fusionar) las dos
tablas en una tercera, de forma que sigan ordenados.
*/
public class bol04e14 {
    public static void main(String[] args) {
        int[] arrayUno=new int[10], arrayDos=new int[10], arrayTres=new int[20];
        rellenar(arrayUno);
        rellenar(arrayDos);
        int u=0, d=0,t=0;
        do{
            if (arrayUno[u]<=arrayDos[d]){
                arrayTres[t]=arrayUno[u];
                t++;
                arrayTres[t]=arrayDos[d];
            }else {
                arrayTres[t]=arrayDos[d];
                t++;
                arrayTres[t]=arrayUno[u];
            }
            t++;
            d++;
            u++;

        }while (u<10 || d<10);

        System.out.println("El tercer arrays es: ");
        for (int item:arrayTres) System.out.print(item +" ");
    }


    public static int[] rellenar(int[] array){
        Scanner s=new Scanner(System.in);
        for (int i=0; i< array.length; i++){
            System.out.println("Introduce número: ");
            array[i]=s.nextInt();
        }
        Arrays.sort(array);
        return array;
    }





}
