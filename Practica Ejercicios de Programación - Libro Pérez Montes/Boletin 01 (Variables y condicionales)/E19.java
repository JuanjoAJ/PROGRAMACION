import java.util.Scanner;

/*Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30
días.*/
public class E19 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.println("Introduce la primera fecha en el siguiente formato dd/mm/aaaa");
        String fechaUno= s.next();
        String[]cortaFechas=fechaUno.split("/");
        int diaUno=Integer.parseInt(cortaFechas[0]);
        int mesUno=Integer.parseInt(cortaFechas[1]);
        int anioUno=Integer.parseInt(cortaFechas[2]);
        System.out.println("Introduce la segunda fecha en el siguiente formato dd/mm/aaaa");
        String fechaDos=s.next();
        cortaFechas=fechaDos.split("/");
        int diaDos=Integer.parseInt(cortaFechas[0]);
        int mesDos=Integer.parseInt(cortaFechas[1]);
        int anioDos=Integer.parseInt(cortaFechas[2]);

        System.out.println("Hay un total de " + Math.abs((anioDos-anioUno)*365 + (mesDos-mesUno)*30 + (diaDos-diaUno)) + " días de diferencia");

    }
}
