//Modificar el ejercicio anterios para calcular la tabla de multiplicar de todos los números (TablaTodos)


public class For_E03 {

    public static void main(String[] args) {


        int mul=0;

        for (int i=1; i<11; i++) {
            System.out.println("La tabla de multiplicar " + i + " es: ");

            for (int j=1;j<11; j++) {
                mul=j*i;
                System.out.println( j + " x " + i + " = " + mul );
            }
        }

    }

}
