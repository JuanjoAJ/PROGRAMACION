package modelGasolinera;

import java.util.ArrayList;

public class Gasolinera {
    private String nombre;
    private ArrayList<Surtidor> surtidores;
    private int ganancias;

    //constructores
    public Gasolinera(String nombre) {
        this.nombre = nombre;
        surtidores=new ArrayList<>();
    }
    //métodos
    public int obtenerGanancias(){
        return ganancias;
        //¿diferencia con getGanancias?
    }
    public void agregarSurtidores(Surtidor surtidor){
       surtidores.add(surtidor);
    }

    //Getter & Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Surtidor> getSurtidores() {
        return surtidores;
    }

    public void setSurtidores(ArrayList<Surtidor> surtidores) {
        this.surtidores = surtidores;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }
}
