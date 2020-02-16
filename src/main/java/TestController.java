import Cipher.Cipher;
import Cipher.Imp.CesarCipher;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class TestController implements Initializable {


    @FXML
    TextArea textArea;


    @FXML
    public void triggerEncoding() {
        String userText = textArea.getText();

        if (!userText.isEmpty()) {
            Cipher cesarCipher = new CesarCipher();
            String encode = cesarCipher.encode(userText);
            textArea.setText(encode);
        }
    }

    @FXML
    public void triggerDecode() {
        String userText = textArea.getText();

        if (!userText.isEmpty()) {
            Cipher cesarCipher = new CesarCipher();
            String decode = cesarCipher.decode(userText);
            textArea.setText(decode);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
