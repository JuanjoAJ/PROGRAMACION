import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class JUnitPresencialTest {
    @Test
    public void testIngresar(){
        JUnitPresencial cuenta=new JUnitPresencial(1500,"abc123");
        int resultado=cuenta.retirar(500,"abc123");
        //assertEquals(1000,1000,resultado, "Fallo en retirar");

    }
    @Test
    public void testPasswordCorrecta(){
        JUnitPresencial cuenta=new JUnitPresencial(1500,"abc123");
        boolean resultado=cuenta.passwordCorrecta("abc123");
        assertTrue(resultado,"Fallo en password");

    }

}