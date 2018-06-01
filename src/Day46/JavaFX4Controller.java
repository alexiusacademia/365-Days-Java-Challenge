package Day46;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class JavaFX4Controller {

  @FXML private Text message;

  @FXML protected void handleSigninButtonAction(ActionEvent actionEvent) {
    message.setText("Sign button is pressed!");
  }
}
