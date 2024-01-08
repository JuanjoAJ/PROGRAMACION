import java.util.Scanner;

/*Función que muestra en pantalla el doble del valor que se le pasa como parámetro*/
public class bol06e06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce valor");
        int n= scanner.nextInt();
        System.out.println("El doble del valor de " + n+ " es " + doble(n) );

    }
    public static double doble(int num){
        double dob=Math.pow(num,2);
        return dob;
    }
}
