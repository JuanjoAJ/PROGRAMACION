import java.util.Scanner;

/*Módulo al que se le pasa un número entero y devuelve el número de divisores primos que tiene.*/
public class bol06e09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n, cont=0;

        System.out.println("Escribe un número");
        n= scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if(n%i==0 && primo(i)) {
                cont++;
            }
        }
        System.out.println("El número " + n + " tiene " + cont + " divisores primos");
    }

    public static boolean primo(int num){
        if (num<=1) return false;
        if (num==2) return true;
        if (num%2==0) return false;
        int raiz = (int) Math.sqrt(num);
        for (int i = 3; i <= raiz; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
