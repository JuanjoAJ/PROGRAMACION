package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProfesorDB {
    private int id;
    private String nombre, correo;

    private double sueldo;

    public ProfesorDB(String nombre, String correo, double sueldo) {
        this.nombre = nombre;
        this.correo = correo;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Profesor {" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
