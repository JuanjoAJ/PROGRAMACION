import java.util.Scanner;
/*DUF que calcule la secuencia de fibonacci que den por teclado*/
public class FibonacciRecursivo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce número de fibonacci que quiera calcular");
        int num= scanner.nextInt();
        System.out.println("El fibonacci de " + num + " números. Es " + fibonacci(num));

    }
    public static long fibonacci(int num){
        if(num==0) return 0;
        else if (num==1) return 1;
        else return (long) fibonacci(num-1)+fibonacci(num-2);
    }

}
