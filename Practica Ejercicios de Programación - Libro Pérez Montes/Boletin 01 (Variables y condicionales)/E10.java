import java.util.Arrays;
import java.util.Scanner;

/*Pedir tres números y mostrarlos ordenados de mayor a menor*/
public class E10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce tres números");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        
        if(a>b && a>c) {
            if(b>c) System.out.println(a + " " + b +" " + c);
            else System.out.println(a + " " + c + " " + b);
        }

        else if (b>c && b>a) {
            if (a>c) System.out.println(b+" " + a + " " + c);
            else System.out.println(b + " " + c + " " + a);
        }

        else {
            if(a>b) System.out.println(c + " " + a +" " + b);
            else System.out.println(c + " " + b +" " + a);
        }

        int[] prueba={a,b,c};
        Arrays.sort(prueba);
        for (int i= prueba.length-1;i>-1;i--){
            System.out.print(prueba[i] + " ");
        }
    }
}
