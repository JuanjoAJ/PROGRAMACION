//Leer un número entre 0 y 10. Se mostrará la tabla de multiplicar de dicho número con el formato: 5 x 3 = 15 (desde 0 hasta 10 en líneas distintas). (TablaDeMultiplicar)
import java.util.*;
public class For_E02 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        System.out.println("Por favor, introduzca un número entre 0 y 10");
        int num=teclado.nextInt();
        int res=0;
        if(num>=0 && num<=10) {
            for (int i=1; i<11; i++) {
                res=i*num;
                System.out.printf("%d x %d = %d \n", num, i, res);
            }
        }else {
            System.out.println("Número no válido");
        }

    }

}