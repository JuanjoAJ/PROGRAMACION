import java.util.Scanner;

/*Leer por teclado una tabla de 10 elementos numéricos enteros y una posición (entre 0 y 9). Eliminar el
elemento situado en la posición dada sin dejar huecos.*/
public class bol04e12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] array=new int[10];
        for (int i = 0; i <10 ; i++) {
            System.out.println("Introduce número");
            array[i]=s.nextInt();
        }
        System.out.println("Introduce posición a eliminar");
        int n=s.nextInt();

        for (int i = n; i < array.length-1; i++) {
            array[i]=array[1+i];
        }array[array.length-1]=0;

        for (int item:array) System.out.print(item + " ");

    }
}
