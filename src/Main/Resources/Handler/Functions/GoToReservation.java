package Main.Resources.Handler.Functions;

import Main.Main;
import Main.Resources.GlobalVar;
import javafx.event.ActionEvent;

public class GoToReservation extends MainFunction {
    @Override
    public void handle(ActionEvent actionEvent) {
        Main.mainstage.setScene(GlobalVar.Reservation_s);
    }
}
