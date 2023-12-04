/*Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10).
 *Obténgase la media con dos decimales de las temperaturas inroducidas por consola. (TemperaturasIntroducidas)
 */

import java.util.*;
public class For_E01 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduzca numero de temperaturas");
        int num=teclado.nextInt();
        double sum=0;
        if(num<0) {
            num=10;
        }
        for (int i=0; i<num; i++) {
            System.out.println("Introduzca temperatura");
            double temp=teclado.nextDouble();
            sum+=temp;

        }
        System.out.printf("La media de las temperaturas introducidas es de %.2f",sum/num);
    }

}