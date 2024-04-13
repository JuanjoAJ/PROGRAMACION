import modelTiendaAnidada.Bicicleta;
import modelTiendaAnidada.Tienda;
import utilsTiendaAnidada.Tamanio;
import utilsTiendaAnidada.TiendaException;
import utilsTiendaAnidada.Tipo;

public class Entrada {
    public static void main(String[] args) {
        Tienda tiendaBicis=new Tienda();
        tiendaBicis.construirAlmacen(2);
        try {
            tiendaBicis.agregarBicicleta(new Bicicleta(3, 20, true, Tipo.carretera, Tamanio.L) {
                @Override
                public Object reparar(Bicicleta bici, int velocidad, int pulgadas) {
                    bici.setPulgadas(bici.getPulgadas()+pulgadas);
                    bici.setVelocidades(getVelocidades()+velocidad);
                    return bici.getTipo().getConstanteReparacion();
                }
            });

            tiendaBicis.agregarBicicleta(new Bicicleta(5, 40, true, Tipo.mtb, Tamanio.S) {
                @Override
                public Object reparar(Bicicleta bici, int velocidad, int pulgadas) {
                    bici.setPulgadas(bici.getPulgadas()+pulgadas);
                    bici.setVelocidades(getVelocidades()+velocidad);
                    return bici.getTipo().getConstanteReparacion();
                }
            });

            tiendaBicis.agregarBicicleta(new Bicicleta() {
                @Override
                public Object reparar(Bicicleta bici, int velocidad, int pulgadas) {
                    return (int) (Math.random()*201)+50;
                }
            });
            tiendaBicis.agregarBicicleta(new Bicicleta() {
                @Override
                public Object reparar(Bicicleta bici, int velocidad, int pulgadas) {
                    return (int) (Math.random()*201)+50;
                }
            });


            tiendaBicis.repararBicicleta(new Bicicleta(27, 29,true, Tipo.mtb, Tamanio.L) {
                @Override
                public Object reparar(Bicicleta bici, int velocidad, int pulgadas) {
                    bici.setVelocidades(getVelocidades()+velocidad);
                    return bici.getTipo().getConstanteReparacion();
                }
            }, 0, 2);

            tiendaBicis.repararBicicleta(new Bicicleta(2, 27, true, Tipo.paseo, Tamanio.M) {
                @Override
                public Object reparar(Bicicleta bici, int velocidad, int pulgadas) {
                    bici.setPulgadas(bici.getPulgadas()+pulgadas);
                    bici.setVelocidades(getVelocidades()+velocidad);
                    return bici.getTipo().getConstanteReparacion();
                }
            },2, 1);

            tiendaBicis.repararBicicleta(new Bicicleta(8, 24, true, Tipo.carretera, Tamanio.S) {
                @Override
                public Object reparar(Bicicleta bici, int velocidad, int pulgadas) {
                    bici.setPulgadas(bici.getPulgadas()+pulgadas);
                    bici.setVelocidades(getVelocidades()+velocidad);
                    return bici.getTipo().getConstanteReparacion();
                }
            },5, 4);


            tiendaBicis.listarStock();
            tiendaBicis.venderBicicleta((int) (Math.random()*20)+1);

        } catch (TiendaException e) {
            throw new RuntimeException(e);
        }


    }
}
