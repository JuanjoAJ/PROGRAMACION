import java.util.Scanner;

/*Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.*/
public class E20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Introduzca la hora, minutos y segundos en el siguiente formato:\n hh:mm:ss");
        String horaUsuario=s.next();
        String[] arrayHora=horaUsuario.split(":");
        int hora=Integer.parseInt(arrayHora[0]);
        int min=Integer.parseInt(arrayHora[1]);
        int seg=Integer.parseInt(arrayHora[2]);

        if(seg>=59){
            seg=0;
            min++;
            if(min>=59){
                min=0;
                hora++;
                if(hora>23) {
                    hora=0;
                }
            }
        }
        else {
            seg++;
        }
        System.out.printf("La hora %s con el segundo siguiente es %d:%d:%d",horaUsuario,hora,min,seg);


    }
}
