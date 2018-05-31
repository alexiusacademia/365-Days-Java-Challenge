package Day45;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

public class JavaFX2 extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Part 2 of JavaFX Development");

    // Gridpane to hold the layout
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER);
    pane.setHgap(10);
    pane.setVgap(10);
    pane.setPadding(new Insets(10, 10, 10, 10));

    Scene scene = new Scene(pane, 300, 275);

    // Create the controls
    Text sceneTitle = new Text("Welcome");
    sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));
    pane.add(sceneTitle, 0, 0, 2, 1);

    Label usernameLabel = new Label("Username:");
    pane.add(usernameLabel, 0, 1);

    TextField usernameField = new TextField();
    pane.add(usernameField, 1, 1);

    Label passwordLabel = new Label("Password:");
    pane.add(passwordLabel, 0, 2);

    TextField passwordField = new TextField();
    pane.add(passwordField, 1, 2);

    Button btnSignIn = new Button("Sign In");

    HBox hbBtn = new HBox(10);
    hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
    hbBtn.getChildren().add(btnSignIn);
    pane.add(hbBtn, 1, 4);

    final Text message = new Text();
    pane.add(message, 1, 6);

    // Action
    btnSignIn.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        message.setFill(Color.FIREBRICK);
        message.setText("Sign in button pressed...");
      }
    });

    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
