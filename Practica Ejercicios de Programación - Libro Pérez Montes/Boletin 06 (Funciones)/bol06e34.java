import java.util.Scanner;

/* Igual que el ejercicio anterior, pero pudiendo configurar los valores de los dos primeros término
de la serie.
*/
public class bol06e34 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num, fibUno, fibDos;

        System.out.println("Introduce el primer valor de fibonacci");
        fibUno= scanner.nextInt();
        System.out.println("Introduce el segundo valor de fibonacci");
        fibDos= scanner.nextInt();
        System.out.println("Introduce número");
        num= scanner.nextInt();
        System.out.println("fibonacci(" + num + ") = " +fibo(num,fibUno,fibDos));
    }

    public static int fibo(int num, int fibUno, int fibDos){
        int resultado;
        if (num==0) resultado=fibUno;
        else if (num==1) resultado=fibDos;
        else resultado=fibo(num-1, fibUno, fibDos)+fibo(num-2, fibUno, fibDos);
        return  resultado;
    }
}
