/*. Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo.
 * - Carga el array numero con valores aleatorios entre 0 y 100.
 * - En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
 * - En el array cubo se deben almacenar los cubos de los valores que hay en numero.
 * Una vez realizado lo anterior muestra el contenido de los tres arrays dispuesto en tres columnas.
 */

public class Arrays_04 {

    public static void main(String[] args) {

        int numero[]=new int[20];
        int cuadrado[]=new int[20];
        int cubo[]=new int[20];

        for (int i=0; i<numero.length;i++) {

            numero[i]=(int)(Math.random()*101);
        }
        for (int i=0; i<cuadrado.length;i++) {
            cuadrado[i]=(int) Math.pow(numero[i], 2);
        }

        for (int i=0; i<cubo.length; i++) {
            cubo[i]=(int) Math.pow(numero[i], 3);
        }
        System.out.println("Número" + " \t" + "Cuadrado Cubo" );
        for (int j=0; j<numero.length; j++) {
            System.out.print( numero[j] + " \t" + cuadrado[j] + " \t" + cubo[j] );
            System.out.println();

        }


    }

}