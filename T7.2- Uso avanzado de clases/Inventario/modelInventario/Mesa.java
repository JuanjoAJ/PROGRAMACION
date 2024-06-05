package modelInventario;

public class Mesa extends Mueble{
    private int capacidad;

    //Constructores
    public Mesa() {
    }
    public Mesa(String material, int peso, int precio, int capacidad) {
        super(material, peso, precio);
        this.capacidad = capacidad;
    }

    //Métodos
    @Override
    public String mostrarDatos() {
        return "La capacidad de la mesa es de " +capacidad + "."+ super.mostrarDatos();
    }

    //Getter & Setter
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
