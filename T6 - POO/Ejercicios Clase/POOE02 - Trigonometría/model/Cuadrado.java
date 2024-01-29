package model;

public class Cuadrado {
    private int base, altura;
    private double area, perimetro;

    //constructores
    public Cuadrado(){}
    public Cuadrado(int base, int altura){
        this.base=base;
        this.altura=altura;
    }

    //metodos

    public double calculoArea(){
        this.area= (double) base*altura;
        return area;
    }
    public double calculoPerimetro(){
        perimetro=(double) (altura*2)+(base*2);
        return perimetro;
    }
    public void mostrarDatos(){
        System.out.printf("El cuadrado, con una base de %d y altura de %d, tiene como area un total de %.2f y un perimetro de %.2f",base,altura,area,perimetro);
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
