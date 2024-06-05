package actividad1;

import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int opcion;
        String nombre=null, apellidos=null, DNI=null, email=null;
do {
    do {
        System.out.println("""
                Por favor indique una de las siguientes opciones:
                1. Rellenar nombre.
                2. Rellenar apellidos.
                3. Rellenar DNI.
                4. Rellenar e-mail.
                5. Finalizar.
                """);
        opcion= scanner.nextInt();
        switch (opcion) {
            case 1:
                try {
                    System.out.println("Introduce nombre");
                    nombre= scanner.next();
                    esLetra(nombre);
                    System.out.println("Nombre creado correctamente");

                }catch (TipoDatoIncorrectoException e){
                    System.err.println(e.getMessage());
                }finally {
                    break;
                }
            case 2:
                try {
                    System.out.println("Introduce apellidos");
                    apellidos= scanner.next();
                    esLetra(apellidos);
                    System.out.println("Apellidos creados correctamente");
                }catch (TipoDatoIncorrectoException e){
                    System.err.println(e.getMessage());
                }finally {
                    break;
                }

            case 3:
                try {
                    System.out.println("Introduce DNI");
                    DNI=scanner.next();
                    validarDNI(DNI);
                    System.out.println("DNI creado correctamente");
                }catch (LongitudDNINoValidaException e){
                    System.err.println(e.getMessage());
                }catch (UltimoDigitoNoLetra e){
                    System.err.println(e.getMessage());
                }catch (NumeracionContieneLetrasException e){
                    System.err.println(e.getMessage());
                }finally {
                    break;
                }

            case 4:
                try {
                    System.out.println("Introduce email");
                    email=scanner.next();
                    validarEmail(email);
                    System.out.println("E-mail creado correctamente");

                }catch (EmailIncorrectoException e){
                    System.err.println(e.getMessage());
                }finally {
                    break;
                }

        }

    } while (opcion != 5);
    if (nombre==null || apellidos==null || DNI==null || email==null) System.out.println("Faltan datos por rellenar");
}while (nombre==null || apellidos==null || DNI==null || email==null);
        System.out.printf("Los datos son los siguientes: \n %s %s con DNI %s tiene el siguiente email %s",nombre, apellidos, DNI, email);


    }









//Métodos
    public static void esLetra(String palabra) throws TipoDatoIncorrectoException{
        for (int i = 0; i < palabra.length(); i++) {
            if (Character.isDigit(palabra.charAt(i))) throw new TipoDatoIncorrectoException("No se contemplan numeros");
        }
    }

    public static void validarDNI(String DNI) throws LongitudDNINoValidaException, UltimoDigitoNoLetra, NumeracionContieneLetrasException{
        if (DNI.length()!=9) throw new LongitudDNINoValidaException("La longitud debe ser de 9 caracteres");
        else if (Character.isDigit(DNI.length()-1)) throw new UltimoDigitoNoLetra("El último dígito debe ser una letra");
        else {
            for (int i = 0; i < DNI.length()-1; i++) {
                if (Character.isLetter(DNI.charAt(i))) throw new NumeracionContieneLetrasException("La numeración contiene letras");
            }
        }
    }
    public static void validarEmail(String email) throws EmailIncorrectoException{
        if (!email.contains(".") || !email.contains("@")) throw new EmailIncorrectoException("Email no definido correctamente");

    }


}
