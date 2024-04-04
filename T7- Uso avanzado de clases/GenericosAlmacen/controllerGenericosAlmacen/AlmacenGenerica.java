package controllerGenericosAlmacen;

import lombok.Getter;
import lombok.Setter;
import modelGenericosAlmacen.CajaGenerica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class AlmacenGenerica <T>{
   HashMap<Integer, CajaGenerica> listaGenerica;

    public AlmacenGenerica() {
        listaGenerica=new HashMap<>();

    }

    public AlmacenGenerica(HashMap<Integer, CajaGenerica> listaGenerica) {
        this.listaGenerica = listaGenerica;
    }


    public void agregarElemento(int n, T elemento){
        listaGenerica.put(n, new CajaGenerica<>(elemento));
    }

    public CajaGenerica posicionDada(int n){
        return listaGenerica.get(n);
    }

    public void listarLista(){
       for (Map.Entry<Integer,CajaGenerica> item:listaGenerica.entrySet()){
           System.out.println("Clave: " + item.getKey() + ", Elemento: " + item.getValue().getObjeto());
       }

    }
}
