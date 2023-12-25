import java.util.Scanner;

/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de
30 días.*/
public class E15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Introduce la fecha en el siguiente formato dd/mm/aaaa");
        String fecha= s.next();

        String[] fechaArray=fecha.split("/");
        int dia=Integer.parseInt(fechaArray[0]);
        int mes=Integer.parseInt(fechaArray[1]);
        int anio=Integer.parseInt(fechaArray[2]);

        if(mes<0 && mes>13){
            System.out.println("La fecha proporcionada no es correcta");
        }
        else if (dia<0 && dia>30){
            System.out.println("La fecha proporcionada no es correcta");
        } else if (anio/1000<0 && anio/1000>10) {
            System.out.println("La fecha proporcionada no es correcta");
        }
        else System.out.println("La fecha es correcta");









    }
}
