//Ejercicio 1. Hágase un programa en el que se declare constantes locales con tu nombre completo, la dirección de tu casa (sólo la calle), el número del portal, el piso, la letra del piso, el código postal, la localidad, la provincia y el país. Muéstrese por consola dichos datos almacenados en las constantes como si fuera la dirección a la que se enviaría una carta.
//
//ENTRADA/SALIDA
//
//Luis González Sanz
//
//C/ Maria de Molina nº 51, 1A
//
//91023 Madrid
//
//España


import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner ejercicio = new Scanner(System.in);

        System.out.print("Por favor, introduce su nombre y apellidos: ");

        final String nombre = ejercicio.next();

        System.out.print("Introduzca su calle: ");

        final  String calle = ejercicio.next();

        System.out.print("Introduzca número de portal: ");

        final int numero = ejercicio.nextInt();

        System.out.print("Introduzca número de piso: ");

        final int piso = ejercicio.nextInt();

        System.out.print("Letra del piso: ");

        final String letra = ejercicio.next();

        System.out.print("Por favor, introduzca código postal: ");

        final int codigoPostal = ejercicio.nextInt();

        System.out.print("Introduzca su localidad: ");

        String localidad = ejercicio.next();

        System.out.print("Introduzca su provincia: ");

        String provincia = ejercicio.next();

        System.out.print("Introduzca su pais: ");

        String pais = ejercicio.next();

        System.out.println("\n" + nombre + "\n" + calle + ". Nº " + numero + ", " + piso + letra + "\n" + codigoPostal +
                " " + localidad + " (" + provincia + ") " + "\n" + pais);

    }
}
