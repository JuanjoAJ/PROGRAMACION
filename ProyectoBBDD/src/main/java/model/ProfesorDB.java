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

    private Double sueldo;

    public ProfesorDB(String nombre, String correo, Double sueldo) {
        this.nombre = nombre;
        this.correo = correo;
        this.sueldo = sueldo;
    }
}
