package factories.Impl;

import Cipher.Cipher;
import Cipher.Imp.CesarCipher;
import Cipher.Imp.Root13Cipher;
import Cipher.Imp.VigenereCipher;
import Exceptions.CipherNotFoundException;
import factories.CipherFactory;

public class CipherFactoryImpl implements CipherFactory {
    public static final String CESAR = "Cesar";
    public static final String ROOT13 = "Root13";
    public static final String VigenereCipher = "VigenereCipher";

    @Override
    public Cipher create(String type) {
        if (type.equals(CESAR)) {
            return new CesarCipher();
        }
        if (type.equals(ROOT13)) {
            return new Root13Cipher();
        }
        if (type.equals(VigenereCipher)) {
            return new VigenereCipher("klucz");
        }
        throw new CipherNotFoundException(type);
    }
}
