package Main.Resources.Handler.Functions;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class GoToInformation extends MainFunction implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        Alert info = new Alert(Alert.AlertType.INFORMATION);
        String x =
                "Ivan   / 535180030\n" +
                "Wilson / 535180042\n" +
                "==================\n" +
                "A small Front End Hotel Application"
                ;
        info.setTitle("Information");
        info.setContentText(x);
        info.setHeaderText("This Program Is Made By:");
        info.showAndWait();
    }
}