package factories.Impl;

import Cipher.Cipher;
import Cipher.Imp.CesarCipher;
import Cipher.Imp.Root13Cipher;
import Exceptions.CipherNotFoundException;
import factories.CipherFactory;

public class CipherFactoryImpl implements CipherFactory {
    public static final String CESAR = "cesar";
    public static final String ROOT13 = "root13";

    @Override
    public Cipher create(String type) {
        if (type.equals(CESAR)) {
            return new CesarCipher();
        }
        if (type.equals(ROOT13)) {
            return new Root13Cipher();
        }
        throw new CipherNotFoundException(type);
    }
}
