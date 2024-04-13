import controller.ControladorUsuario;
import model.UsuarioDB;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDatosBasicos {
    public static void main(String[] args) {
        ControladorUsuario usuarios=new ControladorUsuario();
        Scanner scanner=new Scanner(System.in);

        boolean salir=false;
        do{
            try {
                System.out.println("Introduce nombre, apellidos, dni, telefono y edad");

                usuarios.addUsuario(scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.nextInt());
                System.out.println("¿Desea crear a otro usuario?");
                if (!scanner.next().equalsIgnoreCase("si")) salir = true;
            }catch (IllegalArgumentException e){
                System.err.println("Introducción ilegal de datos");
            }
        }while (!salir);

        usuarios.escribirUsuario();



    }

}
