package modelInventario;

public class Carne extends Alimento{
    private int proteinas;

    //constructores
    public Carne() {
    }
    public Carne(String calidad, String origen, int precio, int proteinas) {
        super(calidad, origen, precio);
        this.proteinas = proteinas;
    }

    //Método
    @Override
    public String mostrarDatos() {
        return "Las proteinas de la carne son de " + proteinas + "."+super.mostrarDatos() ;
    }

    //Getter & Setter
    public int getProteinas() {
        return proteinas;
    }
    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }
}
