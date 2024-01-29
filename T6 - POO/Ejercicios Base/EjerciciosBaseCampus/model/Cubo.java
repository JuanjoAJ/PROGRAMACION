package model;

public class Cubo {
    private int capacidad, contenido;

    //constructor

    public Cubo(){}
    public Cubo(int capacidad){
        this.capacidad=capacidad;
    }
    //métodos
    public void pinta() {
        for (int nivel = this.capacidad; nivel > 0; nivel--) {
            if (this.contenido >= nivel) { System.out.println("#~~~~#");
            } else {
                System.out.println("# #");
            }
        }
        System.out.println("######");
    }
    public void vaciarCubo(){
        contenido=0;
    }
    public void llenaCubo(){
        this.contenido=this.capacidad;
    }

        //Getter & Setter

    public void setCapacidad(int capacidad){
        this.capacidad=capacidad;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public void setContenido(int litros){
        contenido=litros;
    }
    public int getContenido(){
        return contenido;
    }


}
