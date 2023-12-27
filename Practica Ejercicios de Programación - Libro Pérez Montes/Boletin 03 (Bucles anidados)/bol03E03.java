/*Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.
 */
public class bol03E03 {
    public static void main(String[] args) {
int num;
        for (int i = 1; i < 11; i++) {
            System.out.println("Tabla del " + i );
            for (int j = 1; j <11 ; j++) {
                System.out.println(i +"x"+j+" = "+  i*j);
            }

        }


    }
}
