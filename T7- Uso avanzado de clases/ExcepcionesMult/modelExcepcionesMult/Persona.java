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
       if(edad<0) throw new EdadInvalidaException("La edad no puede ser negativa");
       if (nombre==null) throw new NombreInvalidoException("El nombre no puede estar vacio"); //valorar ver si hay espacios en blanco
       System.out.println("Datos validados");
    }


public class EdadInvalidaException extends Exception{
    public EdadInvalidaException(String m){
        super(m);
    }

}
public class NombreInvalidoException extends Exception{
    public NombreInvalidoException(String message) {
        super(message);
    }
}


}
