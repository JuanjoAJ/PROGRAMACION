package model;

public class Piso {
    private Vivienda vivienda;
    private String direccion;
    private int planta;
    private char puerta;


    //constructores
    public Piso(){}
    public Piso(Vivienda vivienda,String direccion, int planta, char puerta){
        this.vivienda=vivienda;
        this.direccion=direccion;
        this.planta=planta;
        this.puerta=puerta;
    }

    //Getter & Setter

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public char getPuerta() {
        return puerta;
    }

    public void setPuerta(char puerta) {
        this.puerta = puerta;
    }
}
