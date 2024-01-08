import java.util.Scanner;

/*Igual que el ejercicio anterior, pero suponiendo que la tabla no está siempre llena, y el número
de elementos se pasa también como parámetro.*/
public class bol06e26 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] t=new int[10];

        System.out.println("Introduzca un número");
        int n= scanner.nextInt();
        if(esta(t, n, t.length)) System.out.println("El número está en la tabla");
        else System.out.println("El número no está en la tabla");
    }

    public static boolean esta (int []a, int n, int numElementos){
        for (int i = 0; i < numElementos; i++) {
            a[i]=(int) (Math.random()*100)+1;
            if(a[i]==n) return true;
        }

        return false;
    }
}

