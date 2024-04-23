package model;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Jugador implements Serializable, Comparable {
    @Serial
    private static final long serialVersionUID = 2985368129592039474L;
    private String nombre;
    private int recordIntentos;

    public Jugador() {
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.recordIntentos =99999999;
    }

    public Jugador(String nombre, int recordIntentos) {
        this.nombre = nombre;
        this.recordIntentos = recordIntentos;
    }

    public void setRecordIntentos(int nIntentos){
        if (nIntentos<recordIntentos){
            System.out.println("Nuevo record");
            recordIntentos=nIntentos;
        }else System.out.println("El record de " + nombre + " está en " + recordIntentos + " intentos.");
    }



    @Override
    public String toString() {
        return "("+nombre+","+recordIntentos+")"+"\n";
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Jugador){
            if (this.recordIntentos>((Jugador) o).recordIntentos) return 1;
            else if (this.recordIntentos<((Jugador) o).recordIntentos) return -1;
        }
        return 0;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRecordIntentos() {
        return recordIntentos;
    }
}
