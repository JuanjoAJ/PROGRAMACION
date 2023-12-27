import java.util.Scanner;

/*Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las
facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el
precio por litro.
Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1
y cuantas facturas se emitieron de más de 600 €.*/
public class bol02E17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int codigo, litros, litrosUno=0,factSeis=0;
        double factura,factTotal=0,precio;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca código de articulo");
            codigo=scanner.nextInt();
            System.out.println("Introduzca cantidad vendida en litros");
            litros=scanner.nextInt();
            System.out.println("Introduzca precio por litro");
            precio=scanner.nextDouble();

            factura= precio*litros;
            factTotal+=factura;

            if(factura>600) factSeis++;
            if(codigo==1) litrosUno+=litros;

        }
        System.out.printf("Facturación total:  %.2f\n" +
                "Cantidad en litros vendidos del artículo 1: %d \n" +
                "Facturas emitidas de más de 600 €: %d",factTotal,litrosUno,factSeis);





    }
}
