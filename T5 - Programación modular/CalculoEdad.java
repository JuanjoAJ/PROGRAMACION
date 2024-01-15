import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
/*DUF que sobreescriba las otras funciones y calcule la edad. Pasando año, año y mes o año, mes y día como parámetro*/
public class CalculoEdad {

    /*   LocalDate fecha=LocalDate.now();
        System.out.println(fecha); Otra opción de conseguir la fecha*/
    public static Date fechaActual= new Date();
   public static SimpleDateFormat formatoDia = new SimpleDateFormat("dd");
   public static SimpleDateFormat formatoMes= new SimpleDateFormat("MM");
    public static SimpleDateFormat formatoAnio = new SimpleDateFormat("yyyy");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce año de nacimiento");
        int anio = scanner.nextInt();
        System.out.println("¿Quieres introducir también el mes? Diga Si o No");
        if (scanner.next().equalsIgnoreCase("Si")) {
            System.out.println("Introduzca mes");
            int mes = scanner.nextInt();
            System.out.println("¿Quieres introducir también el día? Diga Si o No\"");
            if (scanner.next().equalsIgnoreCase("Si")) {
                System.out.println("Introduzca dia");
                int dia = scanner.nextInt();
                System.out.println("Su edad es de " + calculaEdad(anio, mes, dia)+ " años");
            }else {
                System.out.println("Su edad es de " + calculaEdad(anio, mes) + " años");
            }
        }else System.out.println(calculaEdad(anio));
    }
   public static int calculaEdad(int anio){
       int anioActual = Integer.parseInt(formatoAnio.format(fechaActual));
        return anio-anioActual;
    }
    public static double calculaEdad(int anio, int mes){
        int mesActual = Integer.parseInt(formatoMes.format(fechaActual));
        int anioActual = Integer.parseInt(formatoAnio.format(fechaActual));

        return (double) Math.abs((anio-anioActual)*365+(mes-mesActual)*30)/365;
    }
    public static double calculaEdad(int anio, int mes, int dia){

        int diaActual = Integer.parseInt(formatoDia.format(fechaActual));
        int mesActual = Integer.parseInt(formatoMes.format(fechaActual));
        int anioActual = Integer.parseInt(formatoAnio.format(fechaActual));
        return (double) Math.abs((anio-anioActual)*365+(mes-mesActual)*30+(dia-diaActual))/365;
    }
}
