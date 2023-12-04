/*Escribe un programa que rellene un array de 20 números aleatorios entre el 0 y el 30. Una vez hecho esto realizará las siguientes operaciones:
 * - modificar todos los 6 por 8
 * - modificar todos los 7 por 15
 *  - modificar todos los 20 por 10
 *  Al finalizar el programa deberá indicar cuántas modificaciones se han realizado.
 */
public class Arrays_06 {

    public static void main(String[] args) {

        int [] numAleatorio=new int[20];
        int modificaciones=0;
        for (int i=0; i<numAleatorio.length; i++) {
            numAleatorio[i]=(int)(Math.random()*31);

            if(numAleatorio[i]==6) {
                numAleatorio[i]=8;
                modificaciones++;
            }else if(numAleatorio[i]==7) {
                numAleatorio[i]=15;
                modificaciones++;
            }else if(numAleatorio[i]==20) {
                numAleatorio[i]=10;
                modificaciones++;
            }
        }

        for (int imprimir:numAleatorio) {
            System.out.print(imprimir + "\t");
        }

        System.out.println("\nEn total ha hecho " + modificaciones + " modificaciones");

    }

}