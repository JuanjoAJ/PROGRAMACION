import java.util.Scanner;

/* DUF que realice la búsqueda dicotómica en una tabla, de forma recursiva.
 */
public class bol06e35 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int busqueda;
        System.out.println("Seleccione el tamaño del array");
        int[] array=new int [scanner.nextInt()];
        array=relleno(array);
        System.out.println("Introduce el número a buscar");
        busqueda= scanner.nextInt();

        if (dicotomico(array,busqueda,0, array.length-1)==-1) System.out.println("El número no está en la tabla");
        else System.out.println("El número se encuentra en la tabla");

    }

    //rellenar + repetido

    public static int[] relleno(int[] array){
        int random;
        for (int i = 0; i < array.length; i++) {
            do {
                random=(int) (Math.random()*101);
            }while (repetido(random,array));
            array[i]=random;
        }
        return array;
    }

    public static boolean repetido (int num,  int[]array){
        for (int j : array) {
            if (j == num) return true;
        }
        return false;

    }

    //busqueda dicotómica
    public static int dicotomico(int[] array, int num, int origen, int ultimo){
        int encontrado,pos1=0,pos2=0;
        if (origen>=ultimo){
            if (array[origen]==num) encontrado=1;
            else encontrado=-1;}
        else{
            pos1=dicotomico(array,num,origen,(origen+ultimo)/2);
            pos2=dicotomico(array, num, (origen+ultimo)/2+1, ultimo);
            if (pos1!=-1) encontrado=pos1;
            else encontrado=pos2;}
        return encontrado;
    }
}
