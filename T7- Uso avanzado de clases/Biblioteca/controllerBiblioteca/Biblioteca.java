package controllerBiblioteca;

import lombok.Getter;
import lombok.Setter;
import modelBiblioTema7.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

@Getter
@Setter
public class Biblioteca {
    private ArrayList <Persona> personas;
    private ArrayList <Elemento> elementos;
    Scanner scanner=new Scanner(System.in);


    public Biblioteca() {
        personas=new ArrayList<>();
        elementos=new ArrayList<>();
    }

    public void registrarUsuario(Persona persona){
        if (existePersona(persona.getDni())==null){
            personas.add(persona);
        }
        else System.out.println("La persona ya está en nuestros registros");
    }

    public void darAltaElemento(){

        System.out.println("""
                            ¿Qué elemento desea dar de alta?
                            1. CD 
                            2. DVD
                            3. Revista
                            4. Libro""");
        switch (scanner.nextInt()){
            case 1:

                System.out.println("Introduce Id, sección, titulo, tipo de CD y año de edición");
                registrarElemento(new CD(scanner.nextInt(), scanner.next(), scanner.next(), selectTipoCD() , scanner.nextInt()));
                break;
            case 2:
                System.out.println("Introduce Id, sección, titulo, tipo de DVD, año de edición, director y actores");
                registrarElemento(new DVD(scanner.nextInt(), scanner.next(), scanner.next(), selectTipoDVD(), scanner.nextInt(), scanner.next(), agregarActores()));
                break;
            case 3:
                System.out.println("Introduce Id, sección, titulo e ISBN");
                registrarElemento(new Revista(scanner.nextInt(), scanner.next(), scanner.next(), scanner.next()));
                break;
            case 4:
                System.out.println("Introduce Id, sección, titulo, ISBN, autor, editorial y número de páginas");
                registrarElemento(new Libro(scanner.nextInt(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.nextInt()));
                break;
            default:
                System.out.println("No disponemos de esa opción");
                break;



        }




    }
    private TipoCD selectTipoCD(){
        System.out.println("""
                        ¿Elija qué tipo de CD es?
                        1. Musical
                        2. Monologo
                        3. Educativo
                        """);

        switch (scanner.nextInt()){
            case 1:
                return  TipoCD.musical;
            case 2:
                return TipoCD.monologo;
            case 3:
                return TipoCD.educativo;
            default:
                System.out.println("Tipo no correcto");
                return null;
        }
    }
    private TipoDVD selectTipoDVD(){
        System.out.println("""
                        ¿Elija qué tipo de CD es?
                        1. Intriga
                        2. Terror
                        3. Comedia
                        4. Drama
                        """);
        int opcion= scanner.nextInt();

        if (opcion==1) return TipoDVD.intriga;
        else if (opcion==2) return TipoDVD.terror;
        else if (opcion==3) return TipoDVD.comedia;
        else if (opcion==4) return TipoDVD.drama;
        else return null;
    }
    private ArrayList<String> agregarActores(){
        ArrayList<String> actores=new ArrayList<>();
        System.out.println("¿Cuantos actores desea agregar?");
        for (int i = 0; i < scanner.nextInt(); i++) {
            System.out.println("Introduce nombre");
            actores.add(scanner.next());
        }
        return actores;
    }
    public void registrarElemento(Elemento elemento){
        if (existeElemento(elemento.getId())==null) {
            elementos.add(elemento);
        }else System.out.println("El identificador ya está asignado");
    }


    public void realizarPrestamo(Socio socio, Elemento elemento){
        if (elemento instanceof Prestable ){
            if (elemento.isEstado()){
                socio.getPrestamo().add(elemento);
                ((Prestable) elemento).prestar();
            }else System.out.println("Error en el pré stamo // El elemento ya estaba prestado");
        }
        else System.out.println("Error en el préstamo // El elemento no se puede prestar");
    }
    public void realizarDevolucion(Socio socio, Elemento elemento){
        if(elemento instanceof Prestable) ((Prestable) elemento).devolver();
    }




    public void mostrarDatosPersona(){
        for (Persona item:personas){
            item.mostrarDatos();
        }
    }
    public void mostrarElementosPrestados(){
        for (Elemento item:elementos){
            if (!item.isEstado()){
                item.mostrarDatos();
            }
        }
    }
    public void mostrarElementosDisponibles(){
        System.out.println("Elementos disponibles: ");
        for (Elemento item:elementos){
            if (item.isEstado()){
                item.mostrarDatos();
            }
        }
    }
    public void mostrarElementosSocio(String dni){
        if(existePersona(dni)!=null){
            existePersona(dni).mostrarDatos();
        }else {
            System.out.println("Ese dni no está registrado");
        }
    }


    public Persona existePersona(String dni){
        for (Persona item:personas){
            if (item.getDni().equals(dni)) return item;
        }
        return null;
    }
    public Elemento existeElemento(int id){
        for (Elemento item:elementos){
            if (item.getId()==id) return item;
        }
        return null;
    }
    public Socio existeSocio(String dni){
        if (existePersona(dni) instanceof Socio){
            return (Socio) existePersona(dni);
        }
        return null;

    }
}
