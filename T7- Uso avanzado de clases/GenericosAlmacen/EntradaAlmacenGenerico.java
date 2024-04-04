import controllerGenericosAlmacen.AlmacenGenerica;
import modelGenericosAlmacen.CajaGenerica;

public class EntradaAlmacenGenerico {
    public static void main(String[] args) {

        AlmacenGenerica almacen=new AlmacenGenerica<>();

        almacen.agregarElemento(1, "Coca-cola");
        almacen.agregarElemento(2, "Pepsi");
        almacen.agregarElemento(3, "Fanta");
        almacen.agregarElemento(4, "Nestea");


        System.out.println(almacen.posicionDada(3).getObjeto());

        System.out.println();
        almacen.listarLista();




    }
}
