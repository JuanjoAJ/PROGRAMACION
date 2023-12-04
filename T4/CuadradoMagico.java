import java.util.*;

public class CuadradoMagico {
    public static int[][] cMagico = new int[3][3];
    public static Scanner s = new Scanner(System.in);
    public static Random r = new Random();

    public static int fila, columna, sFila,sCol,sDia;

    public static void main(String[] args) {

        System.out.println("Bienvenidos al cuadrado mágico");
       // ramdonizar();
        imprimir();
        do {
            System.out.println("Por favor, introduzca posiciones");
            fila = s.nextInt();
            columna = s.nextInt();
            System.out.println("Introduce el valor que le quieras dar");
            cMagico[fila][columna] = s.nextInt();
            imprimir();
            hueco();
        } while (!comprobacion());
    }

    public static void imprimir() {
        for (int[] primeraVuelta : cMagico) {
            for (int segVuelta : primeraVuelta) {
                System.out.print("|" + segVuelta + "|");
            }
            System.out.println();
        }

    }

    public static void ramdonizar() {
        for (int i = 0; i < cMagico.length; i++) {
            cMagico[i][r.nextInt(0, 2)] = r.nextInt(100);
        }
    }

    public static boolean hueco() {
        for (int[] primeraVuelta : cMagico)
            for (int segVuelta : primeraVuelta)
                if (segVuelta == 0) {
                    return true;
                }
        return false;
    }

    public static boolean comprobacion() {
        if (!hueco()) {
            for (int j = 0; j <cMagico.length; j++) {
                for (int i = 0; i < cMagico.length; i++) {
                    sFila += cMagico[j][i];
                    sCol += cMagico[i][j];
                    sDia += cMagico[i][i];
                }
            }
            if (sFila == sCol && sCol == sDia) {
                System.out.println("Enhorabuena, lograste realizar un cuadrado mágico. Todos los lados suman " + sFila/cMagico.length);
                return true;
            } else {
                System.out.println("No lo has conseguido, revisa donde fallas y a por todas");

            }
        } return false;

    }

}
