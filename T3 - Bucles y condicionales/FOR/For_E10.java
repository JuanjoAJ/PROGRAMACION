//Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.(NotasTipos)

import java.util.*;
public class For_E10 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca seis notas");
        int apro=0, sus=0, cond=0;
        for (int i=0; i<6; i++) {
            int nota=teclado.nextInt();
            if (nota>4) {
                apro++;
            }else if(nota<4) {
                sus++;
            }else {
                cond++;
            }
        }

        System.out.println("Aprobados: " + apro + ", suspensos: " + sus + ", condicionados: " + cond);

    }

}
