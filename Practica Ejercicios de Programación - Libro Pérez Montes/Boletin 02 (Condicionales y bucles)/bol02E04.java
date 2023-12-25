import javax.swing.*;

/* Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.*/
public class bol02E04 {
    public static void main(String[] args) {
        int num=0, cont=0;
        do {
            num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
            cont++;
        }while (num>=0);
        System.out.println("Ha introducido " + cont + " números.");

    }
}
