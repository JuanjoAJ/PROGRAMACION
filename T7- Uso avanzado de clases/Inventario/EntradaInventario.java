import controllerInventario.SupermercadoEspecifico;
import modelInventario.*;

public class EntradaInventario {
    public static void main(String[] args) {
        SupermercadoEspecifico<Alimento> supermercadoAlimentacion= new SupermercadoEspecifico<>();
        supermercadoAlimentacion.registrarElemento(new Carne("Superior","Wagyu",30,400 ));
        supermercadoAlimentacion.registrarElemento(new Carne("Media", "Pollo", 5, 150));
        supermercadoAlimentacion.registrarElemento(new Lacteo("Media", "Soja", 2, 1));
        supermercadoAlimentacion.registrarElemento(new Lacteo("Superior", "Vaca", 3, 1));
        supermercadoAlimentacion.mostrarPreciosFinales();

        SupermercadoEspecifico<Mueble> leroyMerlin=new SupermercadoEspecifico<>();
        leroyMerlin.registrarElemento(new Silla("abedul",5,20,4));
        leroyMerlin.registrarElemento(new Silla("roble", 6,30,4));
        leroyMerlin.registrarElemento(new Mesa("pino", 20, 70, 6));
        leroyMerlin.mostrarPreciosFinales();









    }
}
