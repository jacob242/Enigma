package Controllers;

import Aplications.Main;
import Cipher.Cipher;
import Cipher.Imp.CesarCipher;
import file.utils.FileTool;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private Stage mainStage;


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
        mainStage = Main.getMainStage();
    }

    @FXML
    public void saveToFile() throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save to file");
        fileChooser.setInitialFileName("message.crpt");
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home") + "/Desktop"));
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("crypt file", "*.crpt"),
                new FileChooser.ExtensionFilter("text file", "*.txt"));
        File fileToSave = fileChooser.showSaveDialog(null);
        if (fileToSave != null) {
            String absolutePath = fileToSave.getAbsolutePath();
            try {
                FileTool.writeTextAreaContentToFile(absolutePath, textArea.getText());
            } catch (IOException e) {
                System.out.println("Could not save text in file: " + absolutePath + "exception: " + e);
            }
        }
    }

    public void openFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("crypt file", "*.crpt"),
                new FileChooser.ExtensionFilter("text file", "*.txt"));
        File fileToOpen = fileChooser.showOpenDialog(mainStage);
        if (fileToOpen != null) {
            String fileContent = FileTool.getFileContent(fileToOpen.getAbsolutePath());
            textArea.setText(fileContent);
        }
    }
}

