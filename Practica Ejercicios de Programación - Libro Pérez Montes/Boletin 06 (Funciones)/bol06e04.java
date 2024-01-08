import java.util.Scanner;

/*Ídem una versión que calcule el máximo de una tabla de n elementos.*/
public class bol06e04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Elige la cantidad de números que desea introducir");
        int[] n=new int[scanner.nextInt()];


        for (int i = 0; i < n.length; i++) {
            System.out.println((i+1) + ".) Introduzca número");
            n[i]=scanner.nextInt();
        }
        System.out.println("El número máximo es " + maximo(n));


    }
    public static int maximo(int[] n){
        int max=0;
        for (int i = 0; i < n.length; i++) {
            if (n[i]>max) max=n[i];
        }
        return max;

    }
}
