package modelBiblioTema7;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Revista extends Elemento{
    private String isbn;

    public Revista(int id, String seccion, String titulo, String isbn) {
        super(id, seccion, titulo);
        this.isbn = isbn;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("El ISBN es " + isbn);
        super.mostrarDatos();
    }
}
