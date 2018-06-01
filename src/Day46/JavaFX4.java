package Day46;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFX4 extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = new FXMLLoader().load(getClass().getResource("JavaFX4.fxml"));

    Scene scene = new Scene(root, 400, 275);

    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
