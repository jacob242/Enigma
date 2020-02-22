import Cipher.Imp.Root13Cipher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRoot13 {

    String name = "Kuba";

    String name1 = "Żółć";


    @Test
    public void testEncodeText() {
        Root13Cipher cipher13 = new Root13Cipher();
        String encode = cipher13.encode(name1);
        Assertions.assertEquals("Żółć", encode);
    }


    @Test
    public void testDecodeText() {
        Root13Cipher cipher13 = new Root13Cipher();
        String decode = cipher13.decode("Xhon");
        Assertions.assertEquals(name, decode);
    }
}
