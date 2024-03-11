package modelBiblioTema7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Elemento implements Prestable{
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

    @Override
    public boolean prestar() {
        if (!estado) System.out.println("El articulo ya se encontraba en prestamo");
        else{
            estado=false;
            System.out.println("El prestamo del artículo se ha efectuado correctamente");
        }
        return estado;
    }
    @Override
    public boolean devolver() {
        if (estado) System.out.println("El artículo ya se encontraba en la biblioteca");
        else{
            estado=true;
            System.out.println("El artículo se ha devuelto correctamente");
        }
        return estado;
    }
}
