package util;

public enum Trama {
    MISTERIO(" es una novela de misterio"), INTRIGA(" es una novela de intriga policial");
    private String descripcion;

    Trama(String descripcion) {
        this.descripcion = descripcion;
    }
}
