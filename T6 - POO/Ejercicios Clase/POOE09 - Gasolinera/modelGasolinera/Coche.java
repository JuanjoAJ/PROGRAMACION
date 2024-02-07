package modelGasolinera;

public class Coche {
    private String tipoGasCoche;
    private int litrosDeposito;

    //constructor
    public Coche(String tipoGasCoche) {
        this.tipoGasCoche = tipoGasCoche;
        litrosDeposito=0;
    }

    //métodos
    public void ponerGasolina(Surtidor surtidor, int litrosRepostar){
        if (!surtidor.isFunciona() || !surtidor.getTipoGas().equalsIgnoreCase(tipoGasCoche) || litrosRepostar> surtidor.getCapacidadActual()) {
            System.out.println("Error en surtidor. No se puede repostar");
        }else {
            litrosDeposito+=litrosRepostar;
            surtidor.quitarGasolina(litrosRepostar);
            System.out.println("Repostado con éxito");

        }
    }

    //Getter & setter


    public String getTipoGasCoche() {
        return tipoGasCoche;
    }

    public void setTipoGasCoche(String tipoGasCoche) {
        this.tipoGasCoche = tipoGasCoche;
    }

    public int getLitrosDeposito() {
        return litrosDeposito;
    }

    public void setLitrosDeposito(int litrosDeposito) {
        this.litrosDeposito = litrosDeposito;
    }
}
