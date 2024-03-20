package modelExcepciones;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CuentaExcepcion {
    private String numeroCuenta;
    private double saldo;


    public CuentaExcepcion(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void realizarTransaccion (double monto)throws IllegalArgumentException, SaldoInsuficienteException{
        if(monto<0) throw new IllegalArgumentException("La cantidad debe ser positiva");
        else {
         if (monto>saldo) throw new SaldoInsuficienteException("No tienes saldo suficiente para hacer esa operación");
         else {
            setSaldo(this.saldo-=monto);
            System.out.println("Salario actualizado correctamente. Le quedan " + saldo + " euros.");
         }
        }
    }

}

class SaldoInsuficienteException extends RuntimeException{
    public SaldoInsuficienteException() {
    }

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
