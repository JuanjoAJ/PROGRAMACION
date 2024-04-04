import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class MiLista <T>{
    private ArrayList<T> miLista;

    public MiLista() {
        miLista=new ArrayList<>();
    }

    public MiLista(ArrayList<T> miLista) {
        this.miLista = miLista;
    }

    public void agregarElementos(T elemento){
        miLista.add(elemento);
    }

    public void imprimirLista(){
        for (T item:miLista){
            System.out.println(item);
        }
    }

    public boolean estaEnLista(T element){
        return miLista.contains(element);
    }
}
