import javax.swing.*;
import java.util.Scanner;

/*Pedir un número e indicar si es positivo o negativo. */
public class E05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un valor");
        long variable= scanner.nextLong();
        if (variable<0){
            JOptionPane.showMessageDialog(null, "El número es negativo", "NEGATIVO/POSITIVO", JOptionPane.INFORMATION_MESSAGE);
        }
        else JOptionPane.showMessageDialog(null, "El número es positivo","NEGATIVO/POSITIVO",JOptionPane.INFORMATION_MESSAGE);
    }
}
