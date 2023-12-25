import javax.swing.*;

/*Pedir dos números y decir cual es el mayor o si son iguales*/
public class E08 {
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número"));

        if(a==b) System.out.println("Son iguales");
        else if(a>b) System.out.printf("%d es mayor que %d",a,b);
        else  System.out.printf("%d es mayor que %d",b,a);

    }

}
