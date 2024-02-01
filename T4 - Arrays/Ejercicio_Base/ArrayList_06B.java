public class ArrayList_06B {
    private String marca,modelo;
    private int caballos;

    public ArrayList_06B(){}

    public ArrayList_06B(String marca, String modelo, int caballos) {
        this.marca = marca;
        this.modelo = modelo;
        this.caballos = caballos;
    }

    public void mostrarDatos(){
        System.out.println("Datos del coche: ");
        System.out.println("\033[1mMarca: \033[0m" + marca);
        System.out.println("\033[1mModelo: \033[0m" + modelo);
        System.out.println("\033[1mCaballos: \033[0m" + caballos);
        System.out.println();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }
}
