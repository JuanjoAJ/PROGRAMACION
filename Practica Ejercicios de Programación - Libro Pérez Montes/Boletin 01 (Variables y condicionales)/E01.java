/*Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
debe indicarlo*/
import javax.swing.JOptionPane;
public class E01 {
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para a: "));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para b: "));
        int c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para c: "));

        double interiorRaiz=(Math.pow(b,2))-(4*a*c);
        double solucionPositiv=((-b+Math.sqrt(interiorRaiz))/(2*a));

        if (interiorRaiz<0) System.out.println("La solución real no existe");
        else if(interiorRaiz==0) System.out.println("La solución es " + "\u001B[32m"+ solucionPositiv + "\u001B[30m");
        else System.out.println("El valor de la \"X\" es " + "\u001B[31m" + solucionPositiv + "\u001B[30m" + " y " + "\u001B[34m" + ((-b-Math.sqrt(interiorRaiz))/(2*a)));

    }
}
