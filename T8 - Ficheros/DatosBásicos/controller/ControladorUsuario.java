package controller;

import model.UsuarioDB;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ControladorUsuario {
    ArrayList<UsuarioDB> usuarios=new ArrayList<>();

    public ControladorUsuario(ArrayList<UsuarioDB> usuarios) {
        this.usuarios = usuarios;
    }

    public ControladorUsuario() {
    }


    public void addUsuario(String nombre, String apellidos, String dni, String telefono, int edad){
        usuarios.add(new UsuarioDB(nombre, apellidos, dni, telefono, edad));
    }

    public void escribirUsuario(){
        File file = new File("T8 - Ficheros/DatosBásicos/resources/usuarios.txt");
        PrintWriter printWriter = null;

        if (!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                System.out.println("Error en la creación");
            }
        }
        try{
            printWriter=new PrintWriter(file);
            for (UsuarioDB item:usuarios){
                printWriter.println(item.toString());
            }

        }catch (IOException e){
            System.err.println("Error en el trabajo con ficheros");
        }finally {
            try{
                assert printWriter != null;
                printWriter.close();
            }catch (NullPointerException e){
                System.err.println("Error en el cierre del print");
            }

        }





    }
}
