package modelBiblioTema7;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;


@Getter
@Setter
public class DVD extends Elemento{
private TipoDVD tipoDVD;
private int anioEdicion;
private String director;
private ArrayList<String> actores;


    public DVD() {
        actores=new ArrayList<>();
    }

    public DVD(int id, String seccion, String titulo, TipoDVD tipoDVD, int anioEdicion, String director, ArrayList<String> actores) {
        super(id, seccion, titulo);
        this.tipoDVD = tipoDVD;
        this.anioEdicion = anioEdicion;
        this.director = director;
        this.actores = actores;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("El DVD " + getTitulo());
        System.out.println("Tiene el siguiente director: " + director);
        System.out.println("Los siguientes actores: ");
        for (String item:actores) System.out.println(item);
        super.mostrarDatos();
    }
}
