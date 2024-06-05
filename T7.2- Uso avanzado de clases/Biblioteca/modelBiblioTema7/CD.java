package modelBiblioTema7;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public final class CD extends Elemento implements Prestable{
private TipoCD tipoCD;
private int anioEdicion;

    public CD(int id, String seccion, String titulo, TipoCD tipoCD, int anioEdicion) {
        super(id, seccion, titulo);
        this.tipoCD = tipoCD;
        this.anioEdicion = anioEdicion;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("CD del tipo: " + tipoCD);
        System.out.println("Cuyo año de edición es: " + anioEdicion);
        super.mostrarDatos();
    }

    @Override
    public boolean prestar() {
        if (!isEstado()) System.out.println("El CD ya se encontraba en prestamo");
        else{
            setEstado(false);
            System.out.println("El prestamo del CD se ha efectuado correctamente");
        }
        return isEstado();
    }
    @Override
    public boolean devolver() {
        if (isEstado()) System.out.println("El CD ya se encontraba en la biblioteca");
        else{
            setEstado(true);
            System.out.println("El CD se ha devuelto correctamente");
        }
        return isEstado();
    }
}
