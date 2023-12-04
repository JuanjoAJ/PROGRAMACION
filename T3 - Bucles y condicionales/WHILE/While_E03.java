/*Generar números enteros aleatorios entre 0 y 100 hasta obtener el 0.
 * El programa mostrará cada uno de los datos generados y obtendrá el mayor de los números generados. (MayorNumero)
 */


public class While_E03 {

    public static void main(String[] args) {

        int al=1;
        int mayor=0;
        do {
            double num=  Math.random()*101;

            al=(int) num;

            System.out.println(al);

            if (num>mayor) {
                mayor= al;
            }

        }
        while (al!=0);

        System.out.println("El número mayor generado es " + mayor );

    }

}