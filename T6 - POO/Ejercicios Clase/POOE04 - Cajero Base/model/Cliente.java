package model;

public class Cliente {
    private int pin, saldoInicial;
    private String dni;

    public Cliente(){}

    public Cliente(int pin, int saldoInicial, String dni) {
        this.pin = pin;
        this.saldoInicial = saldoInicial;
        this.dni = dni;
    }



}
