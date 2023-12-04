//Ejercicio 4. Hágase un programa que convierta segundos en horas, minutos y segundos.
//(Segundos)
//
//
//ENTRADA/SALIDA
//Número de segundos: 24973
//Horas: 6
//Minutos: 56
//Segundos: 13

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner ejercicio = new Scanner(System.in);

        System.out.println("Por favor, introduzca los segundos: ");

        int tiempo = ejercicio.nextInt();

        int hora= tiempo/3600;

        int minuto= (tiempo -(hora*3600))/60; //hacer otro ejemplo usando el resto %

        int seg= tiempo-((hora*3600)+(minuto*60));

        System.out.println("Número de segundos: " + tiempo + "\n" + "Horas: " + hora + "\n" + "Minutos: " + minuto + "\n"
        + "Segundos: " + seg);
    }
}