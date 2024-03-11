import controllerBiblioteca.Biblioteca;
import modelBiblioTema7.Elemento;
import modelBiblioTema7.Persona;
import modelBiblioTema7.Socio;
import modelBiblioTema7.Trabajador;

public class prueba {
    public static void main(String[] args) {
        Biblioteca biblioteca=new Biblioteca();

        biblioteca.registrarUsuario(new Trabajador("juanj", "avila", "1234"));
        biblioteca.registrarUsuario(new Socio("alej", "rgz", "2222"));
        biblioteca.registrarUsuario(new Socio("as", "as", "as"));

        biblioteca.mostrarDatosPersona();

        biblioteca.registrarElemento(new Elemento(1, "azul", "hola"));
        biblioteca.registrarElemento(new Elemento(2, "verde", "hola"));
        biblioteca.registrarElemento(new Elemento(3, "a", "dd"));
        biblioteca.registrarElemento(new Elemento(4, "e", "ss"));
        biblioteca.registrarElemento(new Elemento(5, "q", "aa"));
        biblioteca.getElementos().get(1).setEstado(false);
        biblioteca.getElementos().get(4).setEstado(false);

        biblioteca.mostrarElementosPrestados();
        biblioteca.mostrarElementosDisponibles();




    }
}
