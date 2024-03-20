package modelExcepcionesMult;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void validarDatos() throws EdadInvalidaException, NombreInvalidoException{

     //TODO
    }
}

class EdadInvalidaException extends Exception{
    public EdadInvalidaException(String m){
        super(m);
    }

}
class NombreInvalidoException extends Exception{
    public NombreInvalidoException(String message) {
        super(message);
    }
}
