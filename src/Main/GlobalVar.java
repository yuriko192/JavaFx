package Main;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class GlobalVar implements EventHandler<ActionEvent> {
    public static Button Rooms, Reservation, Services;
    public static Scene mainmenu, temp;

    public GlobalVar() {
        Rooms = new Button("Rooms");
        Rooms.setOnAction(this);
        Reservation = new Button("Reservation");
        Reservation.setOnAction(this);
        Services = new Button("Services");
        Services.setOnAction(this);
        temp = new Scene(new WindowBase(), 300, 275);
        mainmenu = new Scene(new MainMenu(), 300, 275);
        Main.mainstage.setScene(mainmenu);
        Main.mainstage.show();
    }

    public static void formatMainButton(Button x) {
        x.setMinWidth(100);
        x.setMinHeight(50);
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        if (actionEvent.getSource() == Rooms) {
            Main.mainstage.setScene(mainmenu);
        } else if (actionEvent.getSource() == Services) {

        } else {

        }
    }
}
