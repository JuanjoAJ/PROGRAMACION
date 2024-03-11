package modelBiblioTema7;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Persona {
    private String nombre, apellidos, dni;

    //Constructor


    public Persona() {
    }

    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }


    //Métodos

    public void mostrarDatos(){
        System.out.println(nombre + " " + apellidos + " tiene como DNI " + dni);
    }

    //Setter & Getter

//Importado con Lombok
}
