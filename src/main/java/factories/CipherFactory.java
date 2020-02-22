package factories;

import Cipher.Cipher;

public interface CipherFactory {
    Cipher create(String type);
}
