package modelGenericosAlmacen;

public class CajaGenerica <T>{
    private T objeto;

    public CajaGenerica() {
    }

    public CajaGenerica(T objeto) {
        this.objeto = objeto;
    }



    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
}
