public class Ingredientes {
    private String nombre;
    private int precio;

    public Ingredientes() {
    }
    public Ingredientes(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ingredientes " + nombre + '\'' +
                " y un precio=" + precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
