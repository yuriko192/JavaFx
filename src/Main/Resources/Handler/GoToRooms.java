package Main.Resources.Handler;

import Main.Forms.Rooms;
import Main.Main;
import Main.Resources.GlobalVar;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class GoToRooms extends MainFunction implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        TextInputDialog dialog = new TextInputDialog(GlobalVar.RoomNumber);
        dialog.setTitle("Room Number");
        dialog.setGraphic(null);
        dialog.setContentText("Please enter Room Number:");
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
            try{
                int temp = Integer.parseInt(result.get());
                Rooms.refresh(temp);
                GlobalVar.RoomNumber = String.valueOf(temp);
                Main.mainstage.setScene(GlobalVar.Rooms_S);
            }catch (NumberFormatException e){
                Alert Err = new Alert(Alert.AlertType.ERROR);
                Err.setTitle("Input Error");
                Err.setHeaderText("Invalid Input");
                Err.setContentText("We cannot show the corresponding Room, please enter a valid Room Number");
                Err.showAndWait();
            }
        }
    }
}