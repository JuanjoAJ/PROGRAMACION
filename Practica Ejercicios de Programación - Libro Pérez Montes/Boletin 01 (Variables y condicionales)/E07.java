import javax.swing.*;

/* Pedir dos números y decir cual es el mayor*/
public class E07 {
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número"));

        if(a>b) System.out.printf("%d es mayor que %d",a,b);
        else System.out.printf("%d es mayor que %d",b,a);

    }

}
