import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
public class dniPrueba {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);){
            System.out.println("Introduzca DNI para registro");
            DNI dni = new DNI(scanner.next());
            System.out.println("Registro correcto");
        } catch (DNI.ErrorValidacionDNI e) {
            System.out.println("Error en el registro" + e.getMessage());
        } finally {
            System.out.println("\nGracias por usar nuestros servicios");
        }

    }
}

class DNI {
    String dni;

    public DNI(String dni) throws ErrorValidacionDNI {
            validarDNI(dni);
            this.dni = dni;
    }

    public void validarDNI(String dni) throws ErrorValidacionDNI {
        char[] dniChopped = dni.toCharArray();
        if (dniChopped.length != 9) throw new LongitudNoValida("Longitud incorrecta");
        else if (!Character.isLetter(dniChopped[dniChopped.length - 1])) throw new UltimoDigitoNoLetra("No ha introducido una letra");
        for (int i = 0; i < dniChopped.length - 1; i++) {
            if (!Character.isDigit(dniChopped[i])) throw new NumeracionContieneLetra("Necesario introducir números");
        }
    }

    abstract class ErrorValidacionDNI extends Exception {
        public ErrorValidacionDNI(String msn) {
            super(msn);
        }
    }
    class LongitudNoValida extends ErrorValidacionDNI{
        public LongitudNoValida(String msn) {
            super(msn);
        }
    }
    class UltimoDigitoNoLetra extends ErrorValidacionDNI{
        public UltimoDigitoNoLetra(String msn) {
            super(msn);
        }
    }

    class NumeracionContieneLetra extends ErrorValidacionDNI{
        public NumeracionContieneLetra(String msn) {
            super(msn);
        }
    }

}
