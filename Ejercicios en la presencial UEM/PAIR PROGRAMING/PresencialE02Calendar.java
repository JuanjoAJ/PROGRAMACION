import java.util.Calendar;

public class PresencialE02Calendar {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
       int hora= c.get(Calendar.HOUR_OF_DAY);
        System.out.print("Son las " + hora);
        saludos(hora);
    }
    public static void saludos(int hora){
        switch (hora) {
            case 21:
            case 22:
            case 23:
            case 24:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println(". Buenas noches.");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println(". Buenos dias.");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println(". Buenas tardes.");
                break;
            default:
                System.out.println("Hora no correcta.");
                break;
        }
    }
}
