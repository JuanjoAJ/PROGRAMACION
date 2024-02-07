import modelLlamadas.Centralita;
import modelLlamadas.LlamadaLocal;
import modelLlamadas.LlamadaNacional;

import java.util.Scanner;

public class EntradaLlamada {
    public static void main(String[] args) {
        Centralita centralita=new Centralita();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Elija una opción:\n- Agregar llamada local\n" +
                "- Agregar llamada nacional\n" +
                "- Mostrar datos de llamadas locales\n" +
                "- Mostrar datos de llamadas nacionales\n" +
                "- Mostrar coste acumulados");

        switch(scanner.nextInt()){
            case 1:
                centralita.agregarLocal(new LlamadaLocal(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble() ));
                break;
            case 2:
                centralita.agregarNacional(new LlamadaNacional(scanner.nextLong(), scanner.nextLong(), scanner.nextDouble(), scanner.next().charAt(0)));
                break;
            case 3:
                centralita.listarLocales();
                break;
            case 4:
                centralita.listarNacionales();
                break;
            case 5:
                centralita.mostrarCostes();
                break;
            default:
                System.out.println("Opción no contemplada");
                break;



        }


    }
}
