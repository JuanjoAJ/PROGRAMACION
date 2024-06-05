import controllerGenericosComparable.ClaseGenericaComparable;
import modelGenericosComparable.CocheGenerico;
import modelGenericosComparable.ProductoGenerico;
import modelGenericosComparable.UsuarioGenerico;

import java.util.ArrayList;
import java.util.Arrays;

public class EntradaGenComp {
    public static void main(String[] args) {
        ClaseGenericaComparable comparable=new ClaseGenericaComparable();
        ArrayList<ProductoGenerico> listaProductos=new ArrayList<>(Arrays.asList(
                new ProductoGenerico("Movil", "telefonia", 800),
                new ProductoGenerico("Play", "videoconsola", 499),
                new ProductoGenerico("Lenovo 5006", "Ordenador", 1599)
        ));

        ArrayList<CocheGenerico> listaCoche=new ArrayList<>(Arrays.asList(
                new CocheGenerico("Ford", "mustang", 600),
                new CocheGenerico("Renault", "Megane", 500),
                new CocheGenerico("Maserati", "Chubasco", 800)
        ));

        ArrayList<UsuarioGenerico> listaUsuarios=new ArrayList<>(Arrays.asList(
                new UsuarioGenerico("Juanjo", "Avila", "juanjo@correo.com", 30),
                new UsuarioGenerico("Maria", "Avila", "maria@correo.com", 26),
                new UsuarioGenerico("Usuario","Ejemplo", "ejemplo@correo.com", 56)
        ));


        System.out.println("El coche con más CV es "+ comparable.encontrarMaximo(listaCoche));


        System.out.println(listaProductos);

        System.out.println("El producto más caro es " + comparable.encontrarMaximo(listaProductos));


        System.out.println("La persona con más edad es "+ comparable.encontrarMaximo(listaUsuarios));



    }

}
