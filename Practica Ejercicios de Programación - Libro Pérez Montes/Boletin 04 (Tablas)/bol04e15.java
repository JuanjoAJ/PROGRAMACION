import java.util.Scanner;

/*Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostrar la posición
en que se encuentra. Si no está, indicarlo con un mensaje.*/
public class bol04e15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] array=new int[10];
        boolean encontrado=false;
        int num;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce número: ");
            array[i]= s.nextInt();
            }
        System.out.println("Introduce número a buscar");
        num=s.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (num==array[i]) {
                encontrado=true;
                System.out.println("El número ha sido encontrado en la posición " + i);
            }
        }
        if (!encontrado) System.out.println("El número no está en el arrays");

    }
}
