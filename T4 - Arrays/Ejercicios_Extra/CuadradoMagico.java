import java.util.*;

public class CuadradoMagico {
    public static int rellenar,lado, primeraFila, primeraColum, diagonal, sumAuxiliar;
    public static int[][] cuadradoMagico;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique el tamaño del cuadrado");
        lado = scanner.nextInt();
        cuadradoMagico = new int[lado][lado];
        do {
            reset(cuadradoMagico);
            rellenar(cuadradoMagico);

        } while (!comprobacion(cuadradoMagico));
        imprimir(cuadradoMagico);

    }

    // metodos de relleno

    public static void rellenar(int[][] cuadradoMagico) {
        Random r = new Random();
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                do {
                    rellenar = r.nextInt(1, (lado*lado)+1);
                } while (repetido(rellenar));
                cuadradoMagico[i][j] = rellenar;
            }
        }

    }

    public static boolean repetido(int rellenar) {
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                if (rellenar == cuadradoMagico[i][j]) {
                    return true;
                }
            }
        }
        return false;

    }

    // metodos de comprobación

    public static boolean comprobacion(int[][] cuadradoMagico) {

        sumaFila(cuadradoMagico);
        sumaColumna(cuadradoMagico);
        sumaDiagonal(cuadradoMagico);
        if (primeraFila == 0 || primeraColum == 0 || diagonal == 0 ) {//|| diagonal == 0
            return false;
        } else if (primeraFila == primeraColum && primeraColum == diagonal) {// && primeraColum == diagonal
            return true;
        }else {
            return false;}

    }


    public static int sumaFila(int[][] cuadradoMagico) {
        sumAuxiliar = 0;
        for (int i = 0; i < cuadradoMagico.length; i++) {
            sumAuxiliar = 0;
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                sumAuxiliar += cuadradoMagico[i][j];
                if (i == 0) {
                    primeraFila += cuadradoMagico[i][j];
                }
            }
            if (primeraFila != sumAuxiliar) {
                return primeraFila = 0;
            }
        }
        System.out.println("Fila " + primeraFila + " " + sumAuxiliar);
        return primeraFila;

    }

    public static int sumaColumna(int[][] cuadradoMagico) {
        sumAuxiliar = 0;
        for (int i = 0; i < cuadradoMagico.length; i++) {
            sumAuxiliar = 0;
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                sumAuxiliar += cuadradoMagico[j][i];
                if (i == 0) {
                    primeraColum += cuadradoMagico[j][i];
                }
            }
            if (primeraColum != sumAuxiliar) {
                return primeraColum = 0;
            }
        }
        return primeraColum;

    }

    public static int sumaDiagonal(int[][] cuadradoMagico) {
        sumAuxiliar = 0;
        int reverso = cuadradoMagico.length;
        for (int i = 0; i < cuadradoMagico.length; i++) {
            reverso--;
            sumAuxiliar += cuadradoMagico[reverso][i];
            diagonal += cuadradoMagico[i][i];
            System.out.println(reverso);
        }
        imprimir(cuadradoMagico);
        System.out.println("Diagonal " + diagonal +" " + sumAuxiliar);
        if (diagonal != sumAuxiliar) {
            return diagonal = 0;
        }

        return diagonal;

    }

    // imprimir
    public static void imprimir(int[][] cMagico) {
        for (int[] primeraVuelta : cMagico) {
            for (int segVuelta : primeraVuelta) {
                System.out.print("|" + segVuelta + "|");
            }
            System.out.println();
        }

    }

    //reset
    public static void reset(int [][] cuadradoMagico) {
        for(int i=0; i<cuadradoMagico.length; i++) {
            for (int j=0; j<cuadradoMagico[i].length; j++) {
                cuadradoMagico[i][j]=0;

            }
        }
    }

}