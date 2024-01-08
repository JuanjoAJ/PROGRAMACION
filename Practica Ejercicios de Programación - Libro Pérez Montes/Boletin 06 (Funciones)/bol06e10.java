import java.util.Scanner;

/*Ídem diseñar una función que devuelve una tabla con los divisores.
 */
public class bol06e10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        int[] primoArray;
        System.out.println("Escribe un número");
        n= scanner.nextInt();
        pri(n);
        for (int item:pri(n)){
            if(item!=0) System.out.print(item + " ");
        }
    }

    public static int[] pri(int n){
        int[] primArray=new int[n]; //otra forma de hacerlo sería crear un contador de div primos y crear un arrays de ese tamaño
        int j=0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0 && primo(i)) {
                primArray[j]=i;
                j++;
            }
        }
        return primArray;

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
