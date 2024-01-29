package model;

public class PilotoDeFormula1 {
    private String nombre;
    private int edad, campeonatosGanados, numeroDeCarrerasOficiales;
    private double mediaDePuntosPorTemporada;


    //constructores

    public PilotoDeFormula1(){

    }
    public PilotoDeFormula1(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public PilotoDeFormula1(String nombre, int edad, int campeonatosGanados, int numeroDeCarrerasOficiales, double mediaDePuntosPorTemporada) {
        this.nombre = nombre;
        this.edad = edad;
        this.campeonatosGanados = campeonatosGanados;
        this.numeroDeCarrerasOficiales = numeroDeCarrerasOficiales;
        this.mediaDePuntosPorTemporada = mediaDePuntosPorTemporada;
    }

    //Setter & Getter

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCampeonatosGanados() {
        return campeonatosGanados;
    }

    public void setCampeonatosGanados(int campeonatosGanados) {
        this.campeonatosGanados = campeonatosGanados;
    }

    public int getNumeroDeCarrerasOficiales() {
        return numeroDeCarrerasOficiales;
    }

    public void setNumeroDeCarrerasOficiales(int numeroDeCarrerasOficiales) {
        this.numeroDeCarrerasOficiales = numeroDeCarrerasOficiales;
    }

    public double getMediaDePuntosPorTemporada() {
        return mediaDePuntosPorTemporada;
    }

    public void setMediaDePuntosPorTemporada(double mediaDePuntosPorTemporada) {
        this.mediaDePuntosPorTemporada = mediaDePuntosPorTemporada;
    }
}
