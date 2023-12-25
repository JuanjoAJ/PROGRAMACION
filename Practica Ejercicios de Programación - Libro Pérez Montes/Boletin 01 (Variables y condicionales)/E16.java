import java.util.Scanner;

/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.
Sin años bisiestos.*/
public class E16 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Teclee una fecha con el siguiente formato dd/mm/aaaa");
        String fecha= s.next();
        String[] arrayFecha=fecha.split("/");
        int dia=Integer.parseInt(arrayFecha[0]);
        int mes=Integer.parseInt(arrayFecha[1]);
        int anio=Integer.parseInt(arrayFecha[2]);

        if (anio/1000<0 && anio/1000>10) {
            System.out.println("La fecha proporcionada no es correcta");
        }
        else {
            switch (mes){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (dia>1 && dia<=31) System.out.println("La fecha es correcta");
                    else System.out.println("La fecha es incorrecta");
                    break;

                case 2:
                    if (dia>1 && dia<=28) System.out.println("La fecha es correcta");
                    else System.out.println("La fecha es incorrecta");

                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia>1 && dia<=30) System.out.println("La fecha es correcta");
                    else System.out.println("La fecha es incorrecta");
                    break;
                default:
                    System.out.println("La fecha es incorrecta");
                    break;
            }
        }
    }
}
