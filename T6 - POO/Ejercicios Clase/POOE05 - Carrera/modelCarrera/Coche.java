package modelCarrera;

public class Coche {
    private int cv, velocidad;
    private String matricula, modelo;
    private double kmRecorridos;


    //constructor

    public Coche(){
        this.matricula="0000AAA";
        this.modelo="sin especificar";
    }

    public Coche (String modelo, String matricula,int cv) {
        this.cv = cv;
        this.matricula = matricula;
        this.modelo = modelo;
    }

    //métodos

    public void acelerar(int velocidad){
        this.velocidad+=velocidad;
        if (this.velocidad>=180) this.velocidad=180;
        kmRecorridos=this.velocidad*(cv*((Math.random()*10)+1));
    }

    public void frenar(){
        velocidad=0;
    }

    public void resetear(){
        velocidad=0;
        kmRecorridos=0;
    }

    public void mostrarDatos(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Modelo: " + modelo);
        System.out.println("Caballos: " + cv);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Kilometros: " + kmRecorridos);
    }

    //Setter & Getter


    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
}
