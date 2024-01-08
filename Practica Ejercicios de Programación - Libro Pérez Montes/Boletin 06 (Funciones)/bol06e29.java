import java.util.Random;

/*DUF que toma como parámetros dos tablas. La primera con los 6 números de una apuesta de la
primitiva, y la segunda con los 6 números ganadores. La función debe devolver el número de
aciertos.
*/
public class bol06e29 {
    public static void main(String[] args) {
        int [] apuesta=new int[6], aciertos=new int[6];

    }
    public static int[] rellenar(int[] aciertos){
        int aleatorio;
        Random r=new Random();
        for (int i = 0; i < aciertos.length; i++) {
            aleatorio=r.nextInt(1,50);

        }



        return aciertos;
    }
    public static boolean repetido(int aleatorio, int[] array){

        for (int i = 0; i < array.length; i++) {
            if (aleatorio==array[i]){
                return true;
            }

        }
        return false;

    }

}
