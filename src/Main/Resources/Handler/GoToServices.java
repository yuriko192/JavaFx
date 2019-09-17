package Main.Resources.Handler;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class GoToServices extends MainFunction{
    @Override
    public void handle(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Coming Soon");
        alert.setHeaderText(null);
        alert.setContentText("This Feature is coming in a future update");
        alert.show();
    }
}
