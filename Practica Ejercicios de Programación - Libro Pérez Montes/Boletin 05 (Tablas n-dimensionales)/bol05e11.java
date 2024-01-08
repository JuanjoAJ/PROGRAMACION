/*Se pretende realizar un programa para gestionar la lista de participaciones en una competición de
salto de longitud.
El número de plazas disponible es de 10.
Sus datos se irán introduciendo en el mismo orden que vayan inscribiéndose los atletas.

 Diseñar el programa que muestre las siguientes opciones:
1- Inscribir un participante.
2- Mostrar listado de datos.
3- Mostrar listado por marcas.
4- Finalizar el programa.
Si se selecciona 1, se introducirán los datos de uno de los participantes: Nombre, mejor marca del
2002, mejor marca del 2001 y mejor marca del 2000.
Si se elige la opción 2, se debe mostrar un listado por número de dorsal.
La opción 3 mostrará un listado ordenado por la marca del 2002, de mayor a menor.
Tras procesar cada opción, se debe mostrar de nuevo el menú inicial, hasta que se seleccione la opción
4, que terminará el programa.
*/

import java.util.Arrays;
import java.util.Scanner;

public class bol05e11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int dorsal=1,opcion,i=0;
        double[] marca2002=new double[9], marca2001=new double[9], marca2000=new double[9];
        int[] dorsalArray=new int[9];
        String[] nombre=new String[9];


        do {


            System.out.println("Elija una de estas opciones:\n" +
                    "1- Inscribir un participante.\n" +
                    "2- Mostrar listado de datos.\n" +
                    "3- Mostrar listado por marcas.\n" +
                    "4- Finalizar el programa.");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (dorsal<=10){
                       dorsalArray[i]=dorsal;
                        System.out.println("Nombre: ");
                        nombre[i]= scanner.next();
                        System.out.println("Mejor marca 2002");
                        marca2002[i]= scanner.nextDouble();
                        System.out.println("Mejor marca 2001");
                        marca2001[i]= scanner.nextDouble();
                        System.out.println("Mejor marca 2000");
                        marca2000[i]= scanner.nextDouble();
                        i++;


                    }
                    dorsal++;
                    break;

                case 2:
                    for (int j = 0; j < dorsal-1; j++) {
                        System.out.printf("En el dorsal número %d, tenemos a: \n %s, con una marca en 2002 de %.2f, en 2001 de %.2f y en 2000 de %.2f \n\n", dorsalArray[j], nombre[j], marca2002[j], marca2001[j], marca2000[j]);
                    }

                    break;

                case 3:
                    Arrays.sort(marca2002);
                    double[] mejorMarca = new double[marca2002.length];
                    for (int k = 0; k < marca2002.length; k++) {
                        mejorMarca[k] = marca2002[marca2002.length - k - 1];
                    }

                    break;

                case 4:
                    System.out.println("Programa finalizado");

                    break;

                default:
                    System.out.println("Opción no contemplada");

            }
        }while (opcion!=4);






    }
}
