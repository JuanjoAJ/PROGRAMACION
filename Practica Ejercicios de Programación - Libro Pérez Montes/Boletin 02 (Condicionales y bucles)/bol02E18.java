import java.util.Scanner;

/*Igual que el anterior pero suponiendo que no se introduce el precio por litro. Solo existen tres
productos con precios:
1- 0,6 €/litro, 2- 3 €/litro y 3- 1,25 €/litro.
*/
public class bol02E18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo, litros, litrosUno = 0, factSeis = 0;
        double factura = 0, factTotal = 0, precio;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca código de articulo");
            codigo = scanner.nextInt();
            System.out.println("Introduzca cantidad vendida en litros");
            litros = scanner.nextInt();
            switch (codigo) {
                case 1:
                    factura = litros * 0.6;
                    litrosUno += litros;
                    break;
                case 2:
                    factura = litros * 3;
                    break;
                case 3:
                    factura = litros * 1.25;
                    break;
                default:
                    System.out.println("Código no contemplado");
            }
            factTotal += factura;

            if (factura > 600) factSeis++;


        }
        System.out.printf("Facturación total:  %.2f\n" +
                "Cantidad en litros vendidos del artículo 1: %d \n" +
                "Facturas emitidas de más de 600 €: %d", factTotal, litrosUno, factSeis);


    }
}
