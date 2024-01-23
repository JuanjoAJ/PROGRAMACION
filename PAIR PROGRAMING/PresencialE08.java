import java.util.Scanner;

/*Crea una función con la siguiente cabecera:
public String convierteEnPalabras(int n)
Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en una
cadena de caracteres*/
public class PresencialE08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        System.out.println(convierteEnPalabras(scanner.nextInt()));
    }

    public static String convierteEnPalabras(int n) {
        String palabraFinal = "";
        String[] array = String.valueOf(n).split("");

        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case "1":
                    palabraFinal += "uno";
                    if (array[i] != array[array.length - 1]) palabraFinal += ", ";
                    else palabraFinal += ".";
                    break;
                case "2":
                    palabraFinal += "dos";
                    if (array[i] != array[array.length - 1]) palabraFinal += ", ";
                    else palabraFinal += ".";
                    break;

                case "3":
                    palabraFinal += "tres";
                    if (array[i] != array[array.length - 1]) palabraFinal += ", ";
                    else palabraFinal += ".";
                    break;

                case "4":
                    palabraFinal += "cuatro";
                    if (array[i] != array[array.length - 1]) palabraFinal += ", ";
                    else palabraFinal += ".";
                    break;

                case "5":
                    palabraFinal += "cinco";
                    if (array[i] != array[array.length - 1]) palabraFinal += ", ";
                    else palabraFinal += ".";
                    break;
                case "6":
                    palabraFinal += "seis";
                    if (array[i] != array[array.length - 1]) palabraFinal += ", ";
                    else palabraFinal += ".";
                    break;
                case "7":
                    palabraFinal += "siete";
                    if (array[i] != array[array.length - 1]) palabraFinal += ", ";
                    else palabraFinal += ".";
                    break;

                case "8":
                    palabraFinal += "ocho";
                    if (array[i] != array[array.length - 1]) palabraFinal += ", ";
                    else palabraFinal += ".";
                    break;

                case "9":
                    palabraFinal += "nueve";
                    if (array[i] != array[array.length - 1]) palabraFinal += ", ";
                    else palabraFinal += ".";
                    break;

                case "0":
                    palabraFinal += "cero";
                    if (array[i] != array[array.length - 1]) palabraFinal += ", ";
                    else palabraFinal += ".";
                    break;

            }

        }
        return palabraFinal;
    }
}
