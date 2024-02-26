package model;

public class Persona {
    private String nombre, dni;

    //Constructores

    public Persona() {
    }

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    //Métodos

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + " con DNI: " + dni);
    }

    //Getter & Setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
