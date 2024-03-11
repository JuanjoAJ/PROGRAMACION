package controllerInventario;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import modelInventario.Alimento;
import modelInventario.Inventariable;
import modelInventario.Mueble;

import java.util.ArrayList;

@Getter
@Setter
public class SupermercadoEspecifico <V>{

    ArrayList<V> listadoElementos;

    public SupermercadoEspecifico() {

        listadoElementos=new ArrayList<>();
    }
    public void registrarElemento(V elemento){
        listadoElementos.add(elemento);
    }

    public void mostrarPreciosFinales(){
        int precioFinal=0;
        for (V item:listadoElementos) {
            if (item instanceof Alimento){
                ((Inventariable) item).calcularPrecio();
                precioFinal+=((Alimento) item).getPrecio();
            } else if (item instanceof Mueble) {
                ((Inventariable) item).calcularPrecio();
                precioFinal+=((Mueble) item).getPrecioIva();
            }
        }
        System.out.println("El precio final de la cesta de la compra es de "+precioFinal );
    }
}
