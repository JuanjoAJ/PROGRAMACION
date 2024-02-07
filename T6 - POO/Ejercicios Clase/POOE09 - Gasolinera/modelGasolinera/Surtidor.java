package modelGasolinera;

public class Surtidor {
    private int capacidadTotal, capacidadActual;
    private String tipoGas;
    private boolean funciona;

    //constructores
    public Surtidor(){
    }
    public Surtidor(String tipoGas){
       this.tipoGas=tipoGas;
    }

    public Surtidor(int capacidadTotal, String tipoGas) {
        this.capacidadTotal = capacidadTotal;
        this.tipoGas = tipoGas;
        funciona=true;
        capacidadActual=this.capacidadTotal;
    }

    // métodos

    public void arreglar(){
        funciona=true;
    }
    public void rellenar(int gas){
        capacidadActual+=gas;
    }
    public void quitarGasolina(int gas){
        capacidadActual-=gas;
    }

    //Setter & Getter


    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public String getTipoGas() {
        return tipoGas;
    }

    public void setTipoGas(String tipoGas) {
        this.tipoGas = tipoGas;
    }

    public boolean isFunciona() {
        return funciona;
    }

    public void setFunciona(boolean funciona) {
        this.funciona = funciona;
    }
}
