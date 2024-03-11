package controllerBiblioteca;

import lombok.Getter;
import lombok.Setter;
import modelBiblioTema7.*;
import java.util.ArrayList;
import java.util.Scanner;

@Getter
@Setter
public class Biblioteca {
    private ArrayList <Persona> personas;
    private ArrayList <Elemento> elementos;


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

    public void registrarElemento(Elemento elemento){
        elementos.add(elemento);
    }

    public void realizarPrestamo(Socio socio, Elemento elemento){

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


}
