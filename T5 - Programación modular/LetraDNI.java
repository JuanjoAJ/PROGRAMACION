import java.util.Scanner;

/*DUF  a la que le pases un número de DNI y te devuelva la letra que corresponde al número pasado como parámetro. */
public class LetraDNI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String teclado;
        do {
            System.out.println("Introduce un número de DNI [recuerda que para que sea valido debe tener 8 números]");
            teclado= scanner.next();
        }while (teclado.length()!=8);
        int dni=Integer.parseInt(teclado);
        System.out.println(dniconLetra(dni));
    }
    public static String dniconLetra (int num){
        char[] letras={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B','N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int posicion=num%23;
        return String.valueOf(num)+letras[posicion];
    }



}
