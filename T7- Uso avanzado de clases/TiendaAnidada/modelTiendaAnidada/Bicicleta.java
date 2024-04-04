package modelTiendaAnidada;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utilsTiendaAnidada.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Bicicleta<T> {
    private int velocidades, pulgadas;
    private boolean estado;
    private Tipo tipo;
    private Tamanio tamanio;

    public void mostrarDatos(){
        System.out.println("Bicicleta");
        System.out.println("velocidades = " + velocidades);
        System.out.println("pulgadas = " + pulgadas);
        System.out.println("estado = " + estado);
        System.out.println("estado = " + estado);
        System.out.println("tipo = " + tipo);
        System.out.println("tamanio = " + tamanio);
        
    }

    public abstract T reparar();


}
