import controller.DescrifadorController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EntradaDescifrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DescrifadorController cifradoDescifrado = new DescrifadorController();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int clave;
        System.out.println("""
                Elige lo que quieras hacer:
                1) Cifrar
                2) Descifrar""");

        try {
            switch (scanner.nextInt()) {
                case 1:

                    System.out.println("Introduce el mensaje que quieras cifrar");
                    String mensaje = bufferedReader.readLine();
                    System.out.println("Introduce la clave numérica para cifrar");
                    clave = Integer.parseInt(bufferedReader.readLine());
                    cifradoDescifrado.cifrar(mensaje, clave);


                    break;
                case 2:

                    System.out.println("Introduce la ruta del archivo que quieres descifrar");
                    String ruta = bufferedReader.readLine();
                    System.out.println("Introduce la clave numérica para descifrar");
                    clave = Integer.parseInt(bufferedReader.readLine());
                    cifradoDescifrado.descifrar(ruta, clave);
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } catch (IOException e) {
            System.out.println("Error en el manejo del flujo");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Fallo en el cerrado");
            }


        }
    }
}
