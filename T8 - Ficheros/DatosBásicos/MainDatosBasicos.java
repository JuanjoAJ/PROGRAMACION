import controller.ControladorUsuario;
import model.UsuarioDB;

import javax.swing.*;
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

                scanner=new Scanner(System.in);
                int opcion=JOptionPane.showConfirmDialog(null,"¿Desea crear a otro usuario?", "Creador Usuarios", JOptionPane.YES_NO_OPTION);
                if (opcion==JOptionPane.NO_OPTION) salir = true;
            }catch (IllegalArgumentException e){
                System.err.println("Introducción ilegal de datos");
            }
        }while (!salir);

        usuarios.escribirUsuario();



    }

}
