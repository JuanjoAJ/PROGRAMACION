/*(AhorcadoArray) Crear un array de String donde se guarden 20 palabras. /
 *  El sistema deberá de seleccionar una de las palabras pertenecientes al array.
 *  Una vez seleccionada se jugará al juego del ahorcado donde la palabra a acertar será la seleccionada.
  Para ello las normas son las siguientes:
    - Nada mas arrancar se mostrarán por consola tantos _ como letras tenga la palabra a acertar
    - Se pedirá por pantalla la letra con la que se quiere probar
    - En el caso de acertar se mostrará la letra en la posición correspondiente
    - En el caso de falla se restará una vida  vida-- (10 vidas)
    - El programa continuará hasta que: (do while)
    - Acierte la palabra
    - Me quede sin vidas*/
import java.util.*;

public class ArraysMult_07 {

    public static Scanner teclado = new Scanner(System.in);
    public static Random r = new Random();
    public static String[] palabras = new String[] { "caballo", "manzana", "euro", "nivel", "programacion", "guitarra",
            "libro", "silla", "mesa", "lampara", "murcielago", "esternocleidomastoideo", "lobezno", "psicotecnico",
            "caramelo", "nomina", "taburete", "rondador", "persiana", "pijama" };
    public static String palabraAle;
    public static char[] guion;
    public static boolean juegoTerminado = false, letraAcertada = false;
    public static int vida = 10;
    public static String seguirJuego;

    public static void main(String[] args) {
        do {

            System.out.println("Bienvenido al juego del ahorcado");
            creacionGuiones();

            do {
                System.out.println("Por favor, introduzca la letra en minúsculas, le quedan " + vida + " vidas.");
                char letra = teclado.next().charAt(0);

                for (int i = 0; i < palabraAle.length(); i++) {
                    if (palabraAle.charAt(i) == letra) {
                        guion[i] = letra;
                        letraAcertada = true;
                    }

                }
                if (!letraAcertada) {
                    System.out.println("Esa letra no está en la palabra");
                    vida--;
                    if (vida == 0) {
                        juegoTerminado = true;
                    }

                } else if (!tieneGuiones()) {
                    juegoTerminado = true;
                }
                System.out.println(guion);
                letraAcertada = false;
            } while (!juegoTerminado);

            if (vida > 0) {
                System.out.println("\n Enhorabuena, has completado el juego");
            } else {
                System.out.println("\n Lo sentimos, has perdido. La palabra era " + palabraAle);
            }
            System.out.println();
            System.out.println("¿Le gustaría volver a jugar? \n \t Si \n \t No \n");
            seguirJuego = teclado.next();
            vida = 10;
        } while (seguirJuego.equalsIgnoreCase("SI"));

        if (seguirJuego.equalsIgnoreCase("No")) {
            System.out.println("Gracias por jugar al ahorcado conmigo. \n \t  ¡Hasta la próxima!");
        }

    }

    public static void creacionGuiones() {
        int n = r.nextInt(palabras.length);
        palabraAle = palabras[n];
        int nLetras = palabraAle.length();

        guion = new char[nLetras];
        for (int i = 0; i < guion.length; i++) {
            guion[i] = '_';

        }
        System.out.println("Su palabra tiene " + guion.length + " letras.");
    }

    public static boolean tieneGuiones() {
        for (char l : guion) {
            if (l == '_') {
                return true;
            }
        }
        return false;
    }
}
