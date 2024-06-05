package actividad2;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Figura2D> figuras=new ArrayList<>();
        figuras.add(new Circulo("circulo", 20));
        figuras.add(new Rectangulo("rectángulo", 20, 30));
        figuras.add(new Triangulo("triangula", 1 ,2 ,3));

        for (Figura2D item:figuras) {
            System.out.println(item);
            System.out.println(item.calcularPerimetro());
        }
    }
}
