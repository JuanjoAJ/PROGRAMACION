package modelGenericosComparable;

public class ProductoGenerico implements Comparable{
    private String nombre, tipo;
    private double precio;

    public ProductoGenerico() {
    }

    public ProductoGenerico(String nombre, String tipo, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof ProductoGenerico){
            if (((ProductoGenerico) o).getPrecio()>precio) return -1;
            else if(precio>((ProductoGenerico) o).getPrecio()) return 1;
            else return 0;
        }else throw new IllegalArgumentException("El objeto no es un producto");
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("tipo = " + tipo);
        System.out.println("precio = " + precio);

    }

    @Override
    public String toString() {
        return "El producto " + nombre + " del tipo " + tipo + " tiene un precio de " + precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
