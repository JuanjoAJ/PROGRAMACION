import java.util.Scanner;

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
public class ArraysMetodo07 {
    public static void main(String[] args) {
        String palabraAle=palabras();
        System.out.println(palabraAle);
        for (char imp:guiones(palabraAle)) {
            System.out.print(imp);
        }

    }


    public static String palabras(){
        String[] palabras={"mesa", "pizza", "albañil","caballo", "manzana", "euro", "nivel", "programacion", "guitarra",
                "libro", "silla", "mesa", "lampara", "murcielago", "esternocleidomastoideo", "lobezno", "psicotecnico",
                "caramelo", "nomina", "taburete", "rondador", "persiana", "pijama", "television"};
        return palabras[(int) (Math.random()* palabras.length)];
    }
    public static char[] guiones(String palabra){
        char[] guion=new char[palabra.length()];
        for (int i = 0; i < guion.length; i++) guion[i]='_';
       return guion;
    }
    public static void juego(String palabra, char guiones) {
        Scanner scanner = new Scanner(System.in);
        int vida = 10;
        char[] guion = guiones(palabra);
        char letraJugador = scanner.next().toLowerCase().charAt(0);
        for (int i = 0; i < palabra.length(); i++) {
            if (letraJugador == palabra.charAt(i)) {
                guion[i] = letraJugador;

            }
        }

        //juego terminado si terminan las 10 vidas o si consigues dominar la palabra
        /*if(palabnaAle.equalIgnore)*/


        //TODO
    }
}
