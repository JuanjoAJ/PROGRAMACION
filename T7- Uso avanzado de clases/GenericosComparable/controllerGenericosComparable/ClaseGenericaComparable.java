package controllerGenericosComparable;

import java.util.ArrayList;

public class ClaseGenericaComparable<T extends Comparable> {

    public T encontrarMaximo(ArrayList<T> lista){

       if(lista.isEmpty() || lista==null){
           throw new IllegalArgumentException("No podemos encontrar el máximo en una lista vacia");
       }
       T maximo= lista.get(0);
        for (T item:lista){
            if (item.compareTo(maximo) > 0) maximo=item;
        }
        return maximo;
    }





}
