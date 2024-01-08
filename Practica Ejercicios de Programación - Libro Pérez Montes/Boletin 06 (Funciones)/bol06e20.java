import java.util.Scanner;

/*DUF que muestre en binario un número entre 0 y 255.
 */
public class bol06e20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número");
        int n= scanner.nextInt();
        if(n>-1 && n<256) System.out.println("El número " + n + " en binario es: " + binario(n));
        else System.out.println("Número fuera de parámetros");

    }

    public static String binario(int n){
        String binario="";
        while (n>0) {
            if (n % 2 == 0) {
                binario = "0" + binario;
                n/=2;
            }
            else{
                binario = "1" + binario;
                n/=2;
            }
        }
        return binario;
    }
}
