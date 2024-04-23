import java.util.Scanner;

public class EntradaDescifrar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                Elige lo que quieras hacer:
                1) Cifrar
                2) Descifrar""");
        switch (scanner.nextInt()){
            case 1:

                break;
            case 2:

                break;
            default:
                System.out.println("Opción no valida");
        }




    }
}
