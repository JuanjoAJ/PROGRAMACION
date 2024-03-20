package model;

import java.util.Random;

public class Coche {
    private String marca, modelo, matricula, color;
    private int cv, cc, velocidad, kmRecorridos, puntuacion, velocidadBase;
    private Random random = new Random();

    //Constructores
    public Coche() {
    }

    public Coche(String marca, String modelo, String matricula, String color, int cv, int cc, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.cc = cc;
        this.velocidad = velocidad;
        this.color = color;
        this.velocidadBase = velocidad;
        kmRecorridos = 0;
        puntuacion = 0;
    }

    //Métodos
    public void acelerar(int velocidad) {
        if (velocidad <= 0) velocidad = 10;
        if (this.cv < 100) {
            this.velocidad += random.nextInt(0, velocidad + 1);
        } else {
            if (velocidad < 10) velocidad = 10;
            this.velocidad += random.nextInt(10, velocidad + 1);
        }
        kmRecorridos += (this.velocidad / 2);
    }

    public void mostrarDatos() {
        System.out.printf("El coche %s %s, con matrícula %s tiene un CV %d y CC de %d. %s\nComienza la carrera con una velocidad de %d km/h y una puntuación en el campeonato es de %d\n", marca, modelo, matricula, cv, cc, colorAsignado(), velocidad, puntuacion);
    }

    public void sumaPuntuacion(int punt) {
        puntuacion += punt;
    }

    private String colorAsignado() {
        if (color.equalsIgnoreCase("rojo")) {
            return "\uD83D\uDE97";
        } else if (color.equalsIgnoreCase("azul")) {
            return "\uD83D\uDE99";

        } else if (color.equalsIgnoreCase("amarillo")) {
            return "\uD83D\uDE95";
        } else if (color.equalsIgnoreCase("blanco")) {
            return "\uD83D\uDE91";
        } else if (color.equalsIgnoreCase("negro")) {
            return "\uD83D\uDE93";
        } else if (color.equalsIgnoreCase("verde")) {
            return "\uD83D\uDE9C";
        } else
            return "\uD83C\uDFCE️";
    }


    //Setter & Getter
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCv() {
        return cv;
    }

    public int getCc() {
        return cc;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getVelocidadBase() {
        return velocidadBase;
    }

    public void setVelocidadBase(int velocidadBase) {
        this.velocidadBase = velocidadBase;
    }
}
