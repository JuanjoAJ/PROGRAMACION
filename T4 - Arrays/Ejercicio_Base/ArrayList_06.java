import java.util.ArrayList;
import java.util.Scanner;

/*Crea un programa que permita meter una lista de coches, donde cada coche consta de marca (String), modelo (String) y caballos (int).
 Mete tres coches manualmente*/
public class ArrayList_06 {
    public static void main(String[] args) {
        ArrayList<ArrayList_06B>coches=new ArrayList<ArrayList_06B>();
        ArrayList_06B coche1=new ArrayList_06B("ford", "orion", 100);
        ArrayList_06B coche2=new ArrayList_06B("ford", "mustang", 150);
        ArrayList_06B coche3=new ArrayList_06B("ford", "CMAX", 200);
        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);

        /*Modifica el ejercicio anterior para que una vez metodos los coches se listen todos con el siguiente formato: "Modelo: Ford	Marca: Focus	CV: 100"*/
        for (ArrayList_06B imp:coches) {
            imp.mostrarDatos();
        }

        /*Modifica el ejercicio anterior para que pida por teclado una marca y muestre por consola todos los coches que sean de la marca introducida*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce la marca a buscar");
        String marca= scanner.next();
        for (ArrayList_06B item:coches) {
            if (item.getMarca().equals(marca)){
                item.mostrarDatos();
            }
        }

        /*Crea un programa que permita realizar las funcionalidades de los ejercicions 5, 6 y 7 mediante un menú*/
        System.out.println("<Elija una de estas opciones>\n 1) Añade un coche 2) Saca todos los datos 3) Busque los coches de una marca en concreto");
        switch (scanner.nextInt()){
            case 1:
                ArrayList_06B cocheSiguiente=new ArrayList_06B(scanner.next(), scanner.next(), scanner.nextInt());
                coches.add(cocheSiguiente);
                break;
            case 2:
                for (ArrayList_06B imp:coches) {
                    imp.mostrarDatos();
                }
                break;
            case 3:
                System.out.println("Introduce la marca a buscar");
                marca= scanner.next();
                for (ArrayList_06B item:coches) {
                    if (item.getMarca().equals(marca)){
                        item.mostrarDatos();
                    }
                }
                break;
            default:
                System.out.println("Opción no contemplada");
        }




    }

}

