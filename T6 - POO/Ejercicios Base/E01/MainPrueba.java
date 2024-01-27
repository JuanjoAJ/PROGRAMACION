package E01;
//1. Crea una clase llamada persona con los siguientes elementos
//    - Propiedades: nombre (string) apellido (string) dni (string) edad (int) peso (double) altura (int)
//    - Métodos:
//        - mostrarDatos: sacará por pantalla los datos de la persona formateados
//        - Métodos getters y setters asociados
//        - Constructores:
//            - un constructor que permita crear una persona con todos los datos
//            - un constructor que permita crear una persona sin peso ni altura
//            - un constructor que permita crear una persona con nombre y apellidos, el resto de datos los pondrá a 0, excepto el dni que lo pondrá a 111111111X
//            - un constructor que permita crear una persona sin datos de entrada. Los inicializará todos a "datos por defecto", 1111111111X y 0 respectivamente
public class MainPrueba {

    public static void main(String[] args) {
        Persona persona01=new Persona();
        persona01.mostrarDatos();
        Persona persona02=new Persona("Pedro", "Ávila", "123456N",30, 177,74.5);
        persona02.mostrarDatos();
        Persona persona03=new Persona("Manuel", "Jimémez", "56789A",52);
        persona03.setAltura(182);
        persona03.mostrarDatos();
        persona03.setEdad(53);

    }


}
