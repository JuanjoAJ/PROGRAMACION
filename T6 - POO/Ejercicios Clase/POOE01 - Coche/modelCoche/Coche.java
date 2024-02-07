package modelCoche;
/*Desarrollar una clase llamada Coche que:

- Tenga un atributo private de tipo Motor, un atributo de tipo String (marca), otro de tipo String (modelo) y otro de tipo double con el precio acumulado con las averías.
- Tenga un constructor con dos parámetros de tipo String que inicialice la marca y el modelo.
- Tenga un getter para cada uno de los atributos.
- Un método acumularAveria que incrementará el importe gastado en averías.*/
public class Coche {
    private Motor motor=new Motor();
    private String marca, modelo;
    private double precioAcumulado;

    //Constructores
    public Coche(){
        precioAcumulado=0;

    }
    public Coche(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
        precioAcumulado=0;
    }
    public Coche(String marca, String modelo, Motor motor){
        this.marca=marca;
        this.modelo=modelo;
        this.motor=motor;
        precioAcumulado=0;

    }


    //Metodos
public double incrementoPrecioAcumulado(){

        precioAcumulado+=(Math.random()*301);
        return precioAcumulado;
}

public void mostrarDatosCoche(){
    System.out.printf("El coche con marca %s y modelo %s", marca, modelo);
    System.out.println("\n Tiene un motor de " + motor.getCV() + " y un incremento de aceite de " + motor.getAceite());
}

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
    public void setMotor(Motor motor){
       this.motor=motor;
    }
}
