package Main.Resources.Handler;

import Main.Main;
import Main.Resources.GlobalVar;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class GoToRooms extends MainFunction implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        Main.mainstage.setScene(GlobalVar.Rooms_S);
    }
}