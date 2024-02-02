package model;

public class Coche {
     private String marca, modelo, matricula;
     private int costeReparacion;
//CONSTRUCTOR

    public Coche(){}
    public Coche(String marca, String modelo, String matricula, int costeReparacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.costeReparacion = costeReparacion;
    }

    //GETTER & SETTER
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCosteReparacion() {
        return costeReparacion;
    }

    public void setCosteReparacion(int costeReparacion) {
        this.costeReparacion = costeReparacion;
    }
}
