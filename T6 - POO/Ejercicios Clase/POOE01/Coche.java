package POOE01;
/*Desarrollar una clase llamada Coche que:

- Tenga un atributo private de tipo Motor, un atributo de tipo String (marca), otro de tipo String (modelo) y otro de tipo double con el precio acumulado con las averías.
- Tenga un constructor con dos parámetros de tipo String que inicialice la marca y el modelo.
- Tenga un getter para cada uno de los atributos.
- Un método acumularAveria que incrementará el importe gastado en averías.*/
public class Coche {
    private Motor motor;
    private String marca, modelo;
    private double precioAcumulado;

    //Constructores
    public Coche(){

    }
    public Coche(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }


    //Metodos


    //Getter & Setter
    public String getMarca() {
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public Motor getMotor(){
        return motor;
    }
    public double getPrecioAcumulado() {
        return precioAcumulado;
    }
}
