package Main.Resources.Handler.Functions;

import Main.Forms.Reservation;
import Main.Main;
import Main.Resources.GlobalVar;
import javafx.event.ActionEvent;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class GoToReservation extends MainFunction {
    @Override
    public void handle(ActionEvent actionEvent) {
        TextInputDialog td = new TextInputDialog();
        td.setTitle("Reservation");
        td.setHeaderText("Please Enter Reservation Number");
        td.setContentText("Reservation Number:");
        Optional<String> result = td.showAndWait();
        if (result.isPresent()) {
            Reservation.update(result.get());
            Main.mainstage.setScene(GlobalVar.Reservation_s);
            Main.mainstage.setTitle("Reservation");
        }


    }
}
