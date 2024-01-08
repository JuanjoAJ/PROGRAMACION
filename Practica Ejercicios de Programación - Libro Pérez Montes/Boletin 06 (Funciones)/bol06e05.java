import java.util.Scanner;

/*Función a la que se le pasan dos enteros y muestra todos los números comprendidos entre ellos,
inclusive.*/
public class bol06e05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num, numD;
        System.out.println("Introduce número:");
        num=scanner.nextInt();
        System.out.println("Introduce siguiente número");
        numD= scanner.nextInt();
        System.out.println("Entre " + num + " y " + numD + " hay comprendidos :");
        comp(num,numD);
    }
    public static void comp(int num, int numD){
        int comp=0;

        if (num<numD) {
            for (int i = num; i <= numD; i++) {
                System.out.println(i);
            }
        }
        else {
            for (int i = numD; i <= num; i++) {
                System.out.println(i);
            }
        }
    }

}
