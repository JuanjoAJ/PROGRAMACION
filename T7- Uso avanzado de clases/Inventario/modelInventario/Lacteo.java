package modelInventario;

public class Lacteo extends Alimento{
    private int volumen;

    //Constructores
    public Lacteo() {
    }
    public Lacteo(String calidad, String origen, int precio, int volumen) {
        super(calidad, origen, precio);
        this.volumen = volumen;
    }

    //Método
    @Override
    public String mostrarDatos() {
        return "El volumen es de "+volumen + "."+super.mostrarDatos();
    }

    //Getter & Setter
    public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}
