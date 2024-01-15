import java.util.Scanner;

/*DUF  se le pasa por parametro DNI y una letra, pero queremos comprobar si dicha letra es la correcta. */
public class ComprobarDNI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String teclado;
        do {
            System.out.println("Introduce un número de DNI [recuerda que para que sea valido debe tener 7 números]");
            teclado= scanner.next();
        }while (teclado.length()!=8);
        int dni=Integer.parseInt(teclado);
        System.out.println("Ahora introduce la letra");
        teclado+=scanner.next();


        if (dniCorrecto(teclado,dni))System.out.println("La letra coincide con los números");
        else System.out.println("La letra no coincide con los números");

    }
    public static String dniconLetra (int num){
        char[] letras={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B','N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int posicion=num%23;
        return String.valueOf(num)+letras[posicion];
    }

    public static boolean dniCorrecto(String dni, int num){
        if(dni.equalsIgnoreCase(dniconLetra(num))) return true;
        else return false;

    }

}
