package Main.Resources.Handler.Functions;

import Main.Main;
import Main.Resources.GlobalVar;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class GoToFloorplan extends MainFunction implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        Main.mainstage.setScene(GlobalVar.floorplan_S);
        Main.mainstage.setTitle("Rooms");
    }
}
