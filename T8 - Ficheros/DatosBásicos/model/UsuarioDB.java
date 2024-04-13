package model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
public class UsuarioDB implements Serializable {

    @Serial
    private static final long serialVersionUID = 5126319088354464011L;
    private static  int num;
    private String nombre, apellido, dni, tlf;
    private int edad;


    public UsuarioDB() {
    }

    public UsuarioDB(String nombre, String apellido, String dni, String tlf, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.tlf = tlf;
        this.edad = edad;
    }

    @Override
    public String toString() {
        num++;
        return "Usuario "+ num +
                "\n Nombre='" + nombre + '\'' +
                ",\n Apellido='" + apellido + '\'' +
                ",\n DNI='" + dni + '\'' +
                ",\n Telefono:'" + tlf + '\'' +
                ",\n Edad:" + edad;

    }

}
