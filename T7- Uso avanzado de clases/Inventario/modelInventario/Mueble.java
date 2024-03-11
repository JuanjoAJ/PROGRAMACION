package modelInventario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mueble implements Inventariable{

    private String material;
    private int peso, precio, precioIva;

    //Constructores
    public Mueble() {
    }
    public Mueble(String material, int peso, int precio) {
        this.material = material;
        this.peso = peso;
        this.precio = precio;
    }

    //Métodos

    public String mostrarDatos(){
        return " El material con el que está hecho es " + material + " con un peso de " + peso + " y un precio de " + precio;
    }

    @Override
    public void calcularPrecio() {
        precioIva=(int) (precio*iva_Muebles);
        System.out.println("El precio es del producto es de " + precioIva);
    }


}
