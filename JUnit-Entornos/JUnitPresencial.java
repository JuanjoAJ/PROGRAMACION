public class JUnitPresencial {
    //Para realizar el test JUnit, clickamos botón derecho en del public class -> Show Context Action -> Create Test.
    //El test lo creamos en la carpeta de la clase que queremos testear.
        private int saldo;
        private String password;

        public JUnitPresencial (int saldoInicial, String password){
            this.saldo=saldoInicial;
            this.password=password;
        }
        public int retirar(int cantidadDinero, String pass){
            if (password.equals(pass)){
                if(saldo>=cantidadDinero){
                    saldo-=cantidadDinero;
                    return saldo;
                }else return -1;
            }else return -2;
        }
        public boolean passwordCorrecta(String pass){
           return password.equals(pass);
        }

}
