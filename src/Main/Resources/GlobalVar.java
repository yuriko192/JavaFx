package Main.Resources;

import Main.Forms.MainMenu;
import Main.Forms.WindowBase;
import Main.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class GlobalVar implements EventHandler<ActionEvent> {
    public static Button Rooms, Reservation, Services;
    public static Scene mainmenu, temp;
    public static final int HEIGHT = 700, WIDTH = 900;

    public GlobalVar() {
        Rooms = new Button("Rooms");
        Rooms.setOnAction(this);
        Reservation = new Button("Reservation");
        Reservation.setOnAction(this);
        Services = new Button("Services");
        Services.setOnAction(this);
        temp = new Scene(new WindowBase(), WIDTH, HEIGHT);
        mainmenu = new Scene(new MainMenu(), WIDTH, HEIGHT);
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
lasso, magic wand, patch, stamp, text