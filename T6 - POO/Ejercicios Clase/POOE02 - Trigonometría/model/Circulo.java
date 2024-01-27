package model;

public class Circulo {
    private double radio, diametro, area;

    //constructores

    public Circulo(){}
    public Circulo(int radio){
        this.radio=radio;
    }
    //metodos
    public double calculoArea(){
        this.area=Math.PI*Math.pow(radio,2);
        return this.area;
    }
    public double calculoDiametro(){
        this.diametro=radio*2;
        return diametro;
    }
    public void mostrarDatos(){
        System.out.printf("El circulo, con un radio de %.2f tiene como area un total de %.2f y un diametro de %.2f",radio,area,diametro);
    }

    //Getter & Setter

    public void setRadio(double radio){
        this.radio=radio;
    }
    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
