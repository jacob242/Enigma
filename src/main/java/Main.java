import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestMain extends Application {
    String resourcePath = "/fxml/Test.fxml";

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/Test.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("Enigma");
        stage.setScene(scene);
        stage.show();
    }

}
