

import java.util.*;

public class PrimerTrimestreBingo {
    public static int[] cartonBingo = new int[10];
    public static int[] numAleatorios = new int[99];
    public static int r, apuesta, estimacion, numAciertos = 0, numSacados = 0, linea;
    public static boolean repe;
    public static Random ran = new Random();
    public static Scanner teclado = new Scanner(System.in);
    public static String volverJugar;


    public static void main(String[] args) {

        do {

            generarCartonBingo();
            apuestas();
            numAleatoriosGenerados();
            cantarBingo();
            resultado();


        } while (volverJugar.equalsIgnoreCase("Si"));
        if (volverJugar.equalsIgnoreCase("No")) {
            System.out.println("Gracias por jugar con Bingo DAW. \n \t  ¡Hasta la próxima!");
        }
    }


    public static void generarCartonBingo() {

        //1.Creará un cartón de bingo, el cual está formado por 10 números aleatorios


        cartonBingo[0] = (int) (Math.random() * 100);
        if (cartonBingo[0] == 0) {
            cartonBingo[0] = (int) (Math.random() * 100);
        }
        for (int i = 1; i < cartonBingo.length; i++) { //Bucle for para rellenar los números
            cartonBingo[i] = (int) (Math.random() * 100);
            for (int j = 0; j < i; j++) {
                if (cartonBingo[i] == cartonBingo[j] || cartonBingo[i] == 0) { //Segundo bucle para comprobar que no se repite, condición para dar "un paso atrás" y que vuelva a asignar valor en caso de que repita.
                    i--;
                }
            }
        }
        Arrays.sort(cartonBingo);
        for (int imprimir : cartonBingo) {
            System.out.print(imprimir + " ");
        }
        System.out.println();
    }

    public static void apuestas() {
        //2. Pedirá una cantidad que servirá como apuesta del jugador.
        System.out.println("Por favor, introduzca la cantidad de euros que desea apostar");
        apuesta = teclado.nextInt();
        System.out.println("Introduzca la cantidad de números en la que prevé acertará el bingo");
        estimacion = teclado.nextInt();

    }

    public static void numAleatoriosGenerados() {
        //3. Una vez creado el cartón, el sistema irá sacando números aleatorio entre el 1-99 (no repetidos)
        for (int i = 0; i < numAleatorios.length; i++) {
            do {
                r = ran.nextInt(100);
                generarNumeros();

                if (!repe) {
                    numAleatorios[i] = r;


                } else {
                    repe = true;
                }

            } while (repe);
        }
    }

    public static void generarNumeros() {

        for (int j = 0; j < numAleatorios.length; j++) {
            if (r == numAleatorios[j]) {
                repe = true;
                break;
            } else {
                repe = false;
            }
        }
    }

    public static void cantarBingo() {
        for (int z = 0; z < numAleatorios.length; z++) {
            for (int j = 0; j < cartonBingo.length && numAciertos < 10; j++) {
                if (cartonBingo[j] == numAleatorios[z]) {
                    numAciertos++;
                    numSacados = z;
                    if (numAciertos == 5) {
                        linea = z;
                    }
                }
            }
        }
    }

    public static void resultado() {
        //Una vez el cartón cante bingo se deberá mostrar la siguiente información
        System.out.printf("El bingo ha finalizado has necesitado %d números para la linea y %d números para completar el bingo. \n \n", linea, numSacados);

        if (estimacion == numSacados) {
            apuesta *= 10;
            System.out.printf("Enhorabuena acertaste y te has llevado %d €.", apuesta);
        } else {
            System.out.println("Qué pena que no has acertado la cantidad. Pero suerte en la siguiente.");
        }
        System.out.println("¿Desea jugar de nuevo?");
        volverJugar = teclado.next();
        numAciertos = 0; //En caso de que sea sí necesitamos volver a llevar el contador a 0.
    }

}