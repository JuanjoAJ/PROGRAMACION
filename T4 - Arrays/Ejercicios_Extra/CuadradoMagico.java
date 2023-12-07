import java.util.*;

public class CuadradoMagico {
    public static int[][] cMagicoA = new int[3][3];
    public static Scanner s = new Scanner(System.in);
    public static Random r = new Random();


    public static int fila, columna, sFila, sCol, sDia, rellenar, aciertos;

    public static void main(String[] args) {
        System.out.println("Bienvenidos al cuadrado mágico \n Elige entre dos opciones:" +
                " \n 1. Realiza tú el cuadrado mágico partiendo de un número al azar" +
                " \n 2. Elige que la máquina te genere de forma automática un cuadrado mágico");
        int opcion = s.nextInt();

        switch (opcion) {
            case 1:
                ramdonizar();
                imprimir(cMagicoA);
                do {
                    System.out.println("Por favor, introduzca posiciones");
                    fila = s.nextInt();
                    columna = s.nextInt();
                    System.out.println("Introduce el valor que le quieras dar");
                    cMagicoA[fila][columna] = s.nextInt();
                    imprimir(cMagicoA);
                } while (comprobacion(cMagicoA));
                break;
            case 2:
                System.out.println("Introduzca el tamaño del cuadrado");
                fila = s.nextInt();
                int[][] cMagicoU = new int[fila][fila];
                imprimir(cMagicoU);
                do {
                    rellenarCubo(cMagicoU);
                    imprimir(cMagicoU);
                } while (comprobacion(cMagicoU));


                break;

        }


    }

    public static void imprimir(int[][] cMagico) {
        for (int[] primeraVuelta : cMagico) {
            for (int segVuelta : primeraVuelta) {
                System.out.print("|" + segVuelta + "|");
            }
            System.out.println();
        }

    }

    public static void ramdonizar() {
        cMagicoA[r.nextInt(cMagicoA.length - 1)][r.nextInt(cMagicoA.length - 1)] = r.nextInt(100);
    }

    public static boolean hueco(int[][] cMagico) {
        for (int[] primeraVuelta : cMagico)
            for (int segVuelta : primeraVuelta)
                if (segVuelta == 0) {
                    return true;
                }
        return false;
    }

    public static boolean comprobacion(int[][] cMagico) {
        if (!hueco(cMagico)) {
            for (int j = 0; j < cMagico.length; j++) {
                reset();
                diagonal(cMagico);
                for (int i = 0; i < cMagico[j].length; i++) {
                    sFila += cMagico[j][i]; //0 0  0 1  0 2  0 3 + 1 0  1 1  1 2  1 3
                    sCol += cMagico[i][j]; // 0 0  1 0  2 0  3 0 + 0 1  1 1  2 1  3 1

                } if(sFila == sDia && sCol == sDia){
                    aciertos++;
                    System.out.println(sDia + " "+ aciertos);
                }
            }
            if (aciertos==cMagico.length) {
                System.out.println("Enhorabuena, lograste realizar un cuadrado mágico. Todos los lados suman " + sFila );
                return false;
            } else {
                System.out.println("No lo has conseguido, revisa donde fallas y a por todas");

            }
        }
        return true;

    }

    public static boolean repe(int[][] cMagico) {
        for (int w = 0; w < cMagico.length; w++) {
            for (int z = 0; z < cMagico[w].length; z++) {
                if (rellenar == cMagico[w][z]) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void rellenarCubo(int[][] cMagico) {
        do {
            for (int i = 0; i < cMagico.length; i++) {
                for (int j = 0; j < cMagico[i].length; j++) {
                    rellenar = r.nextInt(1, 100);
                    if (!repe(cMagico)) {
                        cMagico[i][j] = rellenar;
                    }
                }
            }
        } while (repe(cMagico) && hueco(cMagico));


    }

    public static void reset(){

        sFila=0;
        sCol=0;

    }
    public static void diagonal(int[][] cMagico){
        for (int i = 0; i <cMagico.length ; i++) {
            sDia += cMagico[i][i];
        }
       }


}
