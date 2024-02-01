package model;

public class Vivienda {
    private String orientacion;
    private boolean tieneGaraje;
    private int metrosCuadrados, numeroHabitaciones;

    //constructor
    public Vivienda(){}

    public Vivienda(String orientacion, boolean tieneGaraje, int metrosCuadrados, int numeroHabitaciones) {
        this.orientacion = orientacion;
        this.tieneGaraje = tieneGaraje;
        this.metrosCuadrados = metrosCuadrados;
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public Vivienda(String orientacion, int metrosCuadrados, int numeroHabitaciones) {
        this.orientacion = orientacion;
        this.metrosCuadrados = metrosCuadrados;
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public Vivienda(int metrosCuadrados, int numeroHabitaciones) {
        this.metrosCuadrados=metrosCuadrados;
        this.numeroHabitaciones=numeroHabitaciones;
    }

    //Setter & Getter

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public boolean isTieneGaraje() {
        return tieneGaraje;
    }

    public void setTieneGaraje(boolean tieneGaraje) {
        this.tieneGaraje = tieneGaraje;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }
}
