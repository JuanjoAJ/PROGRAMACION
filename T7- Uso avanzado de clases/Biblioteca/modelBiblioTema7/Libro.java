package modelBiblioTema7;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Libro extends Revista implements Prestable{
    private String autor, editorial;
    private int paginas;

    public Libro(int id, String seccion, String titulo, String isbn, String autor, String editorial, int paginas) {
        super(id, seccion, titulo, isbn);
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("El libro está escrito por " + autor);
        System.out.println("Con el siguiente número de páginas" + paginas);
        System.out.println("Publicado por la editorial " + editorial);
        super.mostrarDatos();
    }

    @Override
    public boolean prestar() {
        if (!isEstado()) System.out.println("El articulo ya se encontraba en prestamo");
        else{
            setEstado(false);
            System.out.println("El prestamo del artículo se ha efectuado correctamente");
        }
        return isEstado();
    }
    @Override
    public boolean devolver() {
        if (isEstado()) System.out.println("El artículo ya se encontraba en la biblioteca");
        else{
            setEstado(true);
            System.out.println("El artículo se ha devuelto correctamente");
        }
        return isEstado();
    }

}
