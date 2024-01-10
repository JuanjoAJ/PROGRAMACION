import java.util.Scanner;

/*DUF que calcule el n-ésimo término de la serie de Fibonacci. En esta serie el n-ésimo valor se
calcula sumando los dos valores anteriores. Es decir fibonacci(n) = fibonacci(n1)+fibonacci(n-2), siendo fibonacci(0)=1 y fibonacci(1)=1.
*/
public class bol06e33 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("Introduce el número para calcular el fibonacci"); //Si el número introducido es grande tardará mucho
        num= scanner.nextInt();
        System.out.println("\nfibonacci(" + num + ") = " +fibo(num));
    }

    public static int fibo(int num){
        int fibo;

        if(num==0) fibo=0;
        else if (num==1) fibo=1;
        else fibo=fibo(num-1)+fibo(num-2);
        return fibo;
    }
}
