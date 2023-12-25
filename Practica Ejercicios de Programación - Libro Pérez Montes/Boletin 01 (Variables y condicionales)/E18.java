import javax.swing.*;

/*Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días (suponer que febrero tiene
siempre 28 días).*/
public class E18 {
    public static void main(String[] args) {
        String fecha= JOptionPane.showInputDialog("Introduce fecha con el siguiente formato dd/mm/aaaa");
        String[] fechaArray=fecha.split("/");

        int dia = Integer.parseInt(fechaArray[0]);
        int mes=Integer.parseInt(fechaArray[1]);
        int anio=Integer.parseInt(fechaArray[2]);

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
                    if (dia > 0 && dia < 31) {
                        dia++;
                    } else if (dia == 31 && mes == 12) {
                        dia = 1;
                        mes = 1;
                        anio++;
                    } else if (dia == 31) {
                        dia = 1;
                        mes++;
                    } else {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;

                case 2:
                    if (dia > 0 && dia < 28) {
                        dia++;
                    } else if (dia == 28) {
                        dia = 1;
                        mes++;
                    } else {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia > 0 && dia < 30) {
                        dia++;
                    } else if (dia==30) {
                        dia=1;
                        mes++;
                    } else System.out.println("La fecha es incorrecta");
                    break;
                default:
                    System.out.println("La fecha es incorrecta");
                    break;
            }
            System.out.printf("La fecha del día siguiente es %d/%d/%d",dia,mes,anio);
        }
    }
}
