import java.util.Scanner;

/*Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
 */
public class bol02E19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nota;
        int aprobados = 0, cond = 0, sus = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduzca la nota");
            nota = s.nextDouble();

            if (nota > 4) aprobados++;
            else if (nota == 4) cond++;
            else sus++;
        }
        System.out.printf("Hay un total de %d aprobados, %d condicionados y %d suspensos", aprobados, cond, sus);


    }
}
