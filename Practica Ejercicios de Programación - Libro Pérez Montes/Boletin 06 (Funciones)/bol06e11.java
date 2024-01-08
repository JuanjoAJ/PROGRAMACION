import java.util.Scanner;

/*Escribir una función que calcule el máximo común divisor de dos números.
* el máximo común divisor de dos números es el número más grande que
* es capaz de dividir a ambos números
*/
public class bol06e11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int min, max;
        System.out.println("Introduce el primer número");
        int nUno= scanner.nextInt();
        System.out.println("Introduce el segundo número");
        int nDos= scanner.nextInt();
        if(nUno<nDos){
             min=nUno;
             max=nDos;
        }
        else {
            min=nDos;
            max=nUno;
        }

        System.out.println("El máximo común divisor de " + nUno + " y " + nDos + " es " + mcd(max, min));

    }

    public static int mcd(int max, int min){
        int mcd=1;
        if (max%min==0) mcd=min;
        else{
            for (int i = 2; i < min; i++) {
                if(max%i==0 && min%i==0)
                    mcd=i;
            }
            
        }
        return mcd;
    }


}
