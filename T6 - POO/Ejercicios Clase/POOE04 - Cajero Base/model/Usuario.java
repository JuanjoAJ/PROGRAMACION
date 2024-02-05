package model;

import java.util.Random;

public class Usuario {

    private int pass, saldoInicial, isbn;
    private String dni;

    public Usuario() {
    }

    public Usuario(int pass, int saldoInicial, String dni, int isbn) {
        this.pass = pass;
        this.saldoInicial = saldoInicial;
        this.dni = dni;
        this.isbn = isbn;
    }

    //metodos
    public void setIngreso(int ingreso) {
        this.saldoInicial += ingreso;
    }

    public void sacarDineroUsuario(int dinero) {
        if ((saldoInicial - dinero) > 0) {
            saldoInicial -= dinero;
        } else System.out.println("La cuenta no dispone de saldo suficiente");

    }

    //getter && setter
    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(int saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
