import java.util.Scanner;

/*. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
*/
public class bol02E14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int suel,suelMayor=0,suma=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca sueldo");
            suel=scanner.nextInt();
            suma+=suel;
            if(suel>1000) suelMayor++;
        }
        System.out.printf("La suma de los sueldos es de %d y hay %d sueldos mayores de 1000€",suma,suelMayor);
    }
}
