package model;

public class Triangulo {
    private int base, altura;
    private double area;

    //constructores

    public Triangulo(){}
    public Triangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }

    //metodo
    public double calculoArea(){
        area=(double)(base*altura)/2;
        return area;
    }

    public void mostrarDatos(){
        System.out.printf("El triangulo, con una base de %d y una altura de %d tiene como area un total de %.2f",base,altura,area);
    }

    //Setter & Getter


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
