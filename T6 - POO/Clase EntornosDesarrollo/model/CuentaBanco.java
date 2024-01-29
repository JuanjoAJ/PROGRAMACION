package model;

public class CuentaBanco {
    private int saldo;
    private String password;

    public CuentaBanco(){}

    public CuentaBanco(int saldo, String password) {
        this.saldo = saldo;
        this.password = password;
    }

    public int ingresar(int cantidad){
        if(cantidad>0){
            saldo+=cantidad;
            return saldo;
        }
        else
            return -1;
    }

    public int retirar(int cantidad, String pass){
        if(passwordCorrecta(pass)){
            if(saldo>= cantidad) {
                saldo-=cantidad;
                return saldo;
            }else {
                return -1;
            }
        }else return -2;
    }

    public boolean passwordCorrecta(String pass){
        return password.equals(pass);
    }


}
