import java.util.Scanner;

/*Diseña una función (en adelante DUF) que decida si un número es primo.*/
public class bol06e18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce número");
        int n= scanner.nextInt();
        if(primo(n)) System.out.println("El número es primo");
        else System.out.println("El número no es primo");

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
