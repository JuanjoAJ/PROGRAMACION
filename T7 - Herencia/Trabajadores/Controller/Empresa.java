package Controller;
import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    private ArrayList<Trabajador> trabajadores;
    Scanner sc=new Scanner(System.in);

    //Constructores
    public Empresa() {
        this.trabajadores=new ArrayList<>();
    }
    public Empresa(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
    //Métodos

    public void registrarTrabajador(String dni){
        if (buscarTrabajador(dni)==null) {
            System.out.println("Que tipo de trabajador quieres registrar: \n 1) Asalariado \n 2) Autónomo \n 3) Jefe");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Introduzca nombre, apellido, salario anual y número de pagas");
                trabajadores.add(new Asalariado(sc.next(), sc.next(), dni, sc.nextInt(), true, sc.nextInt()));
                    break;
                case 2:
                    System.out.println("Introduzca nombre, apellido y salario anual");
                trabajadores.add(new Autonomo(sc.next(), sc.next(),dni, sc.nextInt(), true));
                    break;
                case 3:
                    if (buscarJefe()==null){
                        System.out.println("Introduzca nombre, apellido, acciones y beneficio");
                trabajadores.add(new Jefe(sc.next(), sc.next(), dni, sc.nextInt(), sc.nextInt()));
                    }else {
                        System.out.println("La empresa ya tiene un jefe");
                    }
                    break;

            }
        }else {
            System.out.println("Ya existe alguien registrado con ese DNI");
        }
    }
    public void mostrarTrabajador(String dni){
        if (buscarTrabajador(dni)!=null){
            Trabajador trabajador=buscarTrabajador(dni);
            if (trabajador instanceof Jefe){
                trabajador.mostrarDatos();
            } else if (trabajador instanceof Asalariado) {
                trabajador.mostrarDatos();
            } else if (trabajador instanceof Autonomo) {
                trabajador.mostrarDatos();
            }
        }else{
            System.out.println("El trabajador con DNI " + dni + " no está registrado.");
        }




    }
    private Trabajador buscarTrabajador(String dni){
        for (Trabajador item:trabajadores){
            if (item.getDni().equalsIgnoreCase(dni)) return item;
        }
        return null;
    } //Este deberia valer para registrar y buscar por dni
    private Trabajador buscarJefe(){
        for (Trabajador item:trabajadores){
            if (item instanceof Jefe) return item;
        }
        return null;

    }

    public void modoJefe(){
        if (buscarJefe()!=null){
            Jefe jefe=(Jefe) buscarJefe();
            String dni;
            System.out.println("Ha entrado en modo Jefe, elija una de las opciones: \n1) Despedir \n2) Contratar");
            switch (sc.nextInt()){
                case 1:
                    System.out.println("Introduce el dni del trabajador a despedir");
                    dni= sc.next();
                    if (buscarTrabajador(dni)!=null && !buscarTrabajador(dni).equals(buscarJefe())){
                    jefe.despedirEmpleado((MandoIntermedio) buscarTrabajador(dni));
                    }else {
                        System.out.println("Hubo un error");
                    }
                    break;
                case 2:
                    System.out.println("Introduce el dni del trabajador a contratar");
                    dni= sc.next();
                    if (buscarTrabajador(dni)!=null && !buscarTrabajador(dni).equals(buscarJefe())){
                        jefe.contratarEmpleado((MandoIntermedio) buscarTrabajador(dni));
                    }else {
                        System.out.println("Hubo un error");
                    }
                    break;
                default:
                    break;
            }
        }else {

            System.out.println("No hay jefe que pueda hacer eso");
        }

    }
    public void listarTrabajadores(){
        System.out.println("""
    Desea:
    1) Listar asalariados.
    2) Listar autónomos.
    3) Listar todos""");
        switch (sc.nextInt()){
            case 1:
                listarAsalariados();
                break;
            case 2:
                listarAutonomos();
                break;
            case 3:
                listarTodos();
                break;
            default:
                System.out.println("Opción no contemplada");
                break;
        }


    }
    private void listarAsalariados(){
        System.out.println("\u001B[4mAsalariados:\u001B[0m");
      for (Trabajador item:trabajadores){
          if (item instanceof Asalariado){
              item.mostrarDatos();
          }
      }
    }
    private void listarAutonomos(){
        System.out.println("\u001B[4mAutónomos:\u001B[0m");
        for (Trabajador item:trabajadores){
            if (item instanceof Autonomo){
                item.mostrarDatos();
            }
        }
    }
    private void listarTodos(){
        listarAsalariados();
        listarAutonomos();
        System.out.println("\u001B[4mJefe:\u001B[0m");
        for (Trabajador item:trabajadores){
            if (item instanceof Jefe){
                item.mostrarDatos();
            }
        }
    }
    //Getter & Setter


    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
}
