//Dibujar por consola un Cuadrado de + . Para ello se pedirá por consola el tamaño del lado y se imprimirá el cuadrado con el siguiente formato (CuadradoFor)

import java.util.*;
public class For_E11 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduce el tamaño del lado");
        int lado=teclado.nextInt();
        for (int i=0; i<lado; i++) {
            for(int j=0; j<lado;j++) {
                if(i==0 || i==(lado-1)) {
                    System.out.print("+\t");
                }else if (j==0 || j==(lado-1)) {
                    System.out.print("+\t");
                }else {
                    System.out.print(" \t");
                }
            }
            System.out.println(" \n");

        }
    }

}
