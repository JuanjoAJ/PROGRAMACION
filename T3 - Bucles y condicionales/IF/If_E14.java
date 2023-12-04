//Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos los meses tienen 30 días excepto febrero que tiene 28.
import java.util.*;
public class If_E14 {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduce día, mes(en número) y año");

        int dia, mes, agno;

        dia= teclado.nextInt();
        mes= teclado.nextInt();
        agno=teclado.nextInt();

        if ((mes==2 && dia==28) || (mes!=2 && dia==30 && mes<=12)) {

            mes++;
            dia=1;
            System.out.println("La fecha del día siguiente es: " + dia + " " + mes + " " + agno);
        }else if (dia<30 && mes<=12) {
            dia++;
            System.out.println("La fecha del día siguiente es: " + dia + " " + mes + " " + agno);
        }else {
            System.out.println("Fecha incorrecta");
        }

    }
}
