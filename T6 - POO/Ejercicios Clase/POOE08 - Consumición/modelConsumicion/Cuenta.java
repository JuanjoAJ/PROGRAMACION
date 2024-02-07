package modelConsumicion;

import java.util.ArrayList;
import java.util.Scanner;

public class Cuenta {
    Scanner scanner=new Scanner(System.in);
    private int identificador;
    private boolean estado;

    private double costeTotal;
    private ArrayList<Articulo> articulos;

    //Constructores
    public Cuenta(){
        articulos=new ArrayList<>();
    }

    public Cuenta(int identificador) {
        this.identificador = identificador;
        articulos=new ArrayList<>();
    }

    //Metodo

    public void agregarArticulo(){
        System.out.println("Indique el articulo y su coste");
        articulos.add(new Articulo(scanner.next(), scanner.nextDouble()));
    }

    public int numeroArticulos(){return articulos.size();}

    public void listarArticulos(){
        for (Articulo imp:articulos) {
            System.out.println("Articulo: " + imp.getNombre());
            System.out.println("Coste: " + imp.getCoste());
            System.out.println("Precio: " + imp.precioArticulo());
        }
    }

    public double costeConsumicion(){
        for (Articulo suma:articulos) {
            costeTotal+=suma.precioArticulo();
        }
        return costeTotal;
    }

    //Getter & Setter
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
