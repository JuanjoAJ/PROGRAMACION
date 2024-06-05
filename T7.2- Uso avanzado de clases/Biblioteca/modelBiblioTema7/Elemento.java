package modelBiblioTema7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Elemento{
    private int id;
    private String seccion, titulo;
    private boolean estado;

    public Elemento(int id, String seccion, String titulo) {
        this.id = id;
        this.seccion = seccion;
        this.titulo = titulo;
        this.estado=true;
    }

    public void mostrarDatos(){
        System.out.println("Con título " + titulo);
        System.out.println("ID: " + id);
        System.out.println("Encontrado en " + seccion);
        if(estado) System.out.println("Se encuentra disponible");
        else System.out.println("No está disponible");
    }


}
