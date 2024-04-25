import java.util.ArrayList;

public class Pizza {
    private String nombre;
    private int precio;
    private ArrayList<Ingredientes> ingredientes;

    public Pizza() {
        ingredientes=new ArrayList<>();
    }

    public Pizza(String nombre) {
        this.nombre = nombre;
        ingredientes=new ArrayList<>();
    }


    public void aniadirIngredientes(String nombre, int precio){
        ingredientes.add(new Ingredientes(nombre, precio));
        this.precio+=precio;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
