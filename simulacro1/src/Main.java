import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numerosUser=new int[5];
        int[] numAleatorios=new int[5];
        int aleatorio;
        int aciertos=0;
        ArrayList<Integer> numAcertados=new ArrayList<>();




        for (int i = 0; i < numerosUser.length; i++) {
            System.out.println("Introduce el número entre el 1 y el 10 " + (i+1));
            do {
                numerosUser[i]=sc.nextInt();
                if (numerosUser[i]<1 || numerosUser[i]>10) System.out.println("Número invalido");
            }while (numerosUser[i]<1 || numerosUser[i]>10);

            do {
                aleatorio = (int) (Math.random() * 10) + 1;
            }while (existeNumero(aleatorio, numAleatorios));
                    numAleatorios[i] = aleatorio;
        }
        System.out.println("Los numeros aleatorios son");
        for (Integer item:numAleatorios) {
            System.out.print( item + " ");
        }
        System.out.println();

        for (int i = 0; i < numerosUser.length; i++) {
            for (int j = 0; j < numAleatorios.length; j++) {
                if (numerosUser[i]==numAleatorios[j]){
                    aciertos++;
                    numAcertados.add(numAleatorios[j]);
                }
            }
        }

        System.out.println("El usuario ha tenido " + aciertos);
        if (!numAcertados.isEmpty()){
        System.out.println("Los números acertados son");
        for (Integer item:numAcertados) {
            System.out.print(item +" ");
        }
        }
        }

        public static boolean existeNumero(int num, int[]numerosAleatorios){
            for (int i = 0; i <numerosAleatorios.length ; i++) {
                if (num==numerosAleatorios[i]) return true;
            }
            return false;

        }
    }



