package modelInventario;

public class Alimento implements Inventariable{
    private String calidad, origen;
    private int precio;


    //constructores
    public Alimento(){}
    public Alimento(String calidad, String origen, int precio) {
        this.calidad = calidad;
        this.origen = origen;
        this.precio = precio;
    }
    //métodos

    public String mostrarDatos(){
        return  "El origen del alimento es " + origen + " su calidad es " + calidad + " y su precio es de " + precio;
    }

    @Override
    public void calcularPrecio() {
        setPrecio ((int) (precio*iva_Alimentos));
        System.out.println("El precio es de " + precio);
    }

    //Getter & Setter
    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
