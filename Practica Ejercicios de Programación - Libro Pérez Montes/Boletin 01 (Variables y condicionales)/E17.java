import javax.swing.*;
import java.util.Scanner;

/*Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos
los meses tienen 30 días.*/
public class E17 {
    public static void main(String[] args) {
        String fecha=JOptionPane.showInputDialog("Introduce fecha con el siguiente formato dd/mm/aaaa");
        String[] fechaArray=fecha.split("/");

        int dia = Integer.parseInt(fechaArray[0]);
        int mes=Integer.parseInt(fechaArray[1]);
        int anio=Integer.parseInt(fechaArray[2]);

        if (anio/1000<0 && anio/1000>10) {
            System.out.println("La fecha proporcionada no es correcta");
        }
        else if(mes<13 && mes>0 && dia>0){
            if (dia<30){
                dia++;
            }
            else if (dia==30 && mes<12){
                dia=1;
                mes++;
            } else {
                dia=1;
                mes=1;
                anio++;
            }
            System.out.printf("La fecha del día siguiente es %d/%d/%d",dia,mes,anio);
        }
        else {
            System.out.println("La fecha proporcionada no es correcta");
        }
    }
}
