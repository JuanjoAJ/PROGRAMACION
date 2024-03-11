package modelInventario;

public class Silla extends Mueble{
    private int patas;

    //Constructores
    public Silla() {
    }
    public Silla(String material, int peso, int precio, int patas) {
        super(material, peso, precio);
        this.patas = patas;
    }

    //Métodos

    @Override
    public String mostrarDatos() {
        return "El número de patas de la silla es de " + patas + "." + super.mostrarDatos();
    }
    //Getter & Setter

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
