package modelGenericosComparable;

public class CocheGenerico implements Comparable<CocheGenerico>{
    private String marca, modelo;
    private int cv;

    public CocheGenerico() {
    }

    public CocheGenerico(String marca, String modelo, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
    }


    @Override
    public int compareTo(CocheGenerico o) {
        if (cv>o.cv) return 1;
        else if(cv<o.cv) return -1;
        else return 0;

    }

    @Override
    public String toString() {
        return "CocheGenerico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cv=" + cv +
                '}';
    }

    public void mostrarDatos(){
       System.out.println("marca = " + marca);
       System.out.println("modelo = " + modelo);
       System.out.println("cv = " + cv);
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

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
}
