package modelAgenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    ArrayList<Usuario> listUser=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    public Agenda(){}

    public void agregarUsuario(){
        System.out.println("Ingrese nombre: ");
        String nombre=scanner.next();
        System.out.println("Ingrese apellido: ");
        String apellido=scanner.next();
        System.out.println("Ingrese teléfono: ");
        int tel=scanner.nextInt();
        System.out.println("Ingrese DNI: ");
        String dni= scanner.next();
        if(!repeDNI(dni)){
            listUser.add(new Usuario(nombre,apellido,dni,tel));
        }else System.out.println("No se puede agregar el usuario, ya existe otro con el mismo DNI");

    }

    public void buscarUser(){
        System.out.println("Introduzca DNI");
        String dni= scanner.next();
        if (repeDNI(dni)){
        for (Usuario buscar:listUser) {
            if (buscar.getDni().equals(dni)) {
                System.out.println("El usuario " + buscar.getNombre() + " " + buscar.getApellido());
                System.out.println("Tiene el siguiente telefono: " + buscar.getTelefono());
            }
        }
        }else System.out.println("El usuario no está en nuestra agenda");
    }
    public void borrarUser(){
        System.out.println("Introduzca DNI para eliminar");
        String dni= scanner.next();
        if (repeDNI(dni)){
            for (int i = 0; i < listUser.size(); i++) {
               if(listUser.get(i).getDni().equals(dni)){
                listUser.remove(i);
                   System.out.println("Usuario eliminado correctamente");
                }
            }
        }else System.out.println("El usuario no está en nuestra agenda");
    }

    public void listarUsuario(){
        if (listUser.isEmpty()){
            System.out.println("La lista está vacia");
        }else {
            for (Usuario print:listUser) {
                System.out.println("Nombre: " + print.getNombre());
                System.out.println("Apellidos: " + print.getApellido());
                System.out.println("DNI: " + print.getDni());
                System.out.println("Telefono " + print.getTelefono());
            }
        }
    }

    public boolean repeDNI(String dni){
        for (Usuario item:listUser) {
            if (item.getDni().equals(dni)) return true;
        }
        return false;
    }






}
