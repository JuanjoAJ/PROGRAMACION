package modelBiblioTema7;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Socio extends Persona{
    private int numSocio;
    private ArrayList<Elemento> prestamo;

    public Socio(String nombre, String apellidos, String dni) {
        super(nombre, apellidos, dni);
        this.numSocio=numSocio;
        prestamo= new ArrayList<>();
        numSocio=(int) (Math.random()*9999)+1;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("El socio " + numSocio + ":");
        super.mostrarDatos();
        if (prestamo.isEmpty()){
            System.out.println("Actualmente no tiene elementos en prestamo.");
        }else{
            System.out.println("Tiene los siguientes elementos en prestamo: ");
            for (Elemento item:prestamo){
                item.mostrarDatos();
            }
        }
        System.out.println();
    }
}
