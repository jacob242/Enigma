package factories;

import Cipher.Cipher;
import Cipher.Imp.CesarCipher;
import Exceptions.CipherNotFoundException;
import factories.Impl.CipherFactoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CipherFactoryTest {
    private CipherFactory factory = new CipherFactoryImpl();
    private static final String MESSAGE = "Type of cipher is not recognized: ";

    @Test
    protected void ifCesarInstanceofretunType() {
        Cipher cipher = factory.create(CipherFactoryImpl.CESAR);
        Assertions.assertTrue(cipher instanceof CesarCipher);
    }

    @Test
    protected void Tesy2() {
        Assertions.assertThrows(CipherNotFoundException.class, () -> factory.create("Unknow"),
                MESSAGE + "unknow");

    }
}
