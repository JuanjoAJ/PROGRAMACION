//Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.

import java.util.*;
public class If_E13 {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);

        System.out.println(" Introduzca día, mes(en número) y año");

        int dia, mes, agno;

        dia= teclado.nextInt();
        mes= teclado.nextInt();
        agno=teclado.nextInt();

        if (dia<28 && mes==2) {
            System.out.println("Fecha correcta");
        }else if (dia<=30 && (mes==4 || mes==6 || mes==9 || mes==11)) {
            System.out.println("Fecha correcta");
        }else if (dia<=31 && (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)) {
            System.out.println("Fecha correcta");
        }else {
            System.out.println("Fecha incorrecta");
        }
    }
}
