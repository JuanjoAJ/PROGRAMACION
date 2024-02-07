package modelConsumicion;
public class Articulo {
    private String nombre;
    private double coste;

    //constructor
    public Articulo(String nombre, double coste) {
        this.nombre = nombre;
        this.coste= coste;
    }
    //Metodos

    public double precioArticulo(){
        return coste+((30*coste)/100);
    }


    //Getter & Setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
}
