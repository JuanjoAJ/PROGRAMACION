import java.util.Scanner;

/*Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los
elementos impares.
Realizar dos versiones: una trabajando con los valores y otra trabajando con los índices.*/
public class bol04e13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] array=new int[10], parV=new int[5], imparV=new int[5], parI=new int[5], imparI=new int[5];
        int contP=0, contI=0, contPIt=0, contIIT=0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce número");
            array[i]= s.nextInt();
            if (array[i]%2==0){
                parV[contP]=array[i];
                contP++;
            }else {
                imparV[contI]=array[i];
                contI++;

            }
            if(i%2==0){
                parI[contPIt]=array[i];
                contPIt++;
            }else {
                imparI[contIIT]=array[i];
                contIIT++;
            }

        }
        System.out.println("Los valores pares son: ");
       imprimir(parV);
        System.out.println("\nLos valores impares son: ");
        imprimir(imparV);
        System.out.println("\nLos valores en los indices pares son: ");
      imprimir(parI);
        System.out.println("\nLos valores en los indices impares son: ");
        imprimir(imparI);


    }
    public static void imprimir( int[] array){

        for (int item:array){
            System.out.print(item + " ");
        }
    }

}
