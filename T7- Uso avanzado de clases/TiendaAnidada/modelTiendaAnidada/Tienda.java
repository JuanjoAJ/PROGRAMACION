package modelTiendaAnidada;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utilsTiendaAnidada.TiendaException;

import java.util.ArrayList;
import java.util.Random;

public final class Tienda {
private Almacen almacen;
private ArrayList<Bicicleta> bicicletasStock, bicicletasReparar;
private int caja;

Random random;

    public Tienda() {
        bicicletasReparar=new ArrayList<>();
        bicicletasStock=new ArrayList<>();
        random=new Random();
    }

    public void construirAlmacen(int nPlazas){
        almacen=new Almacen(nPlazas);
    }

    public void agregarBicicleta(Bicicleta bicicleta) throws TiendaException {
        if (almacen.getPlazasDisponibles()>0){
            bicicletasStock.add(bicicleta);
            almacen.setPlazasDisponibles(almacen.getPlazasDisponibles()-1);
        }else{
            throw new TiendaException("No hay más plazas disponibles");
        }
    }
    public void venderBicicleta(int num)throws TiendaException{
        if (bicicletasStock.size()<num){
            bicicletasStock.get(num).mostrarDatos();
            bicicletasStock.remove(bicicletasStock.get(num));
            almacen.setPlazasDisponibles(almacen.getPlazasDisponibles()+1);
            caja+= random.nextInt(200, 1000);
            System.out.println("Se ha eliminado correctamente");
        }else throw new TiendaException("Esa posición no existe");
    }

    public void repararBicicleta(Bicicleta bicicleta){
        //TODO

    }

    public void listarStock(){
        for (Bicicleta item:bicicletasStock){
            item.mostrarDatos();
        }
    }




//GETTER & SETTER
    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public ArrayList<Bicicleta> getBicicletasStock() {
        return bicicletasStock;
    }

    public void setBicicletasStock(ArrayList<Bicicleta> bicicletasStock) {
        this.bicicletasStock = bicicletasStock;
    }

    public ArrayList<Bicicleta> getBicicletasReparar() {
        return bicicletasReparar;
    }

    public void setBicicletasReparar(ArrayList<Bicicleta> bicicletasReparar) {
        this.bicicletasReparar = bicicletasReparar;
    }

    @Setter
    @Getter
    @NoArgsConstructor
     class Almacen{
        int numPlazas, plazasDisponibles;
        public Almacen(int numPlazas){
            this.numPlazas=numPlazas;
            plazasDisponibles=numPlazas;
        }
    }
}
