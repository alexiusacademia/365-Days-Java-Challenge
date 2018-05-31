package Day45;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class JavaFX1 extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("JavaFX App part 1");

    // Create a button
    Button btn = new Button();
    btn.setText("Test Button");
    btn.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        System.out.println("Button pressed...");
      }
    });

    // Create a pane
    StackPane pane = new StackPane();
    pane.getChildren().add(btn);

    primaryStage.setScene(new Scene(pane, 600, 400));
    primaryStage.show();
  }
}
