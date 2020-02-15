import Cipher.Cipher;
import Cipher.Imp.CesarCipher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Test1 {
    protected final String textWithalphabet = "asdfvf213vdg";
    protected final String textWithalphabet2 = "123456";
    protected final String textWithalphabet3 = "qweq2weq";
    protected final String textWithalphabet4 = "zvc12xc";
    protected final String textWithAlphabet5 = "xxx";
    protected Cipher cesar = new CesarCipher();

    @DisplayName("TestingDecode")
    @org.junit.jupiter.api.Test
    public void testDecode() {
        String decode = cesar.decode("aaa");
        Assertions.assertEquals(textWithAlphabet5, decode);
    }

    @DisplayName("TestingDecode")
    @org.junit.jupiter.api.Test
    public void testDecode2() {
        String decode = cesar.decode(textWithalphabet2);
        Assertions.assertEquals(textWithalphabet2, decode);
    }

    @DisplayName("TestingEncode")
    @org.junit.jupiter.api.Test
    public void testEncode() {
        String encode = cesar.encode(textWithalphabet);
        Assertions.assertEquals(textWithAlphabet5, encode);
    }
}
