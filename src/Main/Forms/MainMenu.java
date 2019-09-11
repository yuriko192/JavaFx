package Main.Forms;

import Main.Main;
import Main.Resources.GlobalVar;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

public class MainMenu extends FlowPane implements EventHandler<ActionEvent> {
    private Button Rooms, Reservation, Services;

    public MainMenu() {
        super();
        Rooms = new Button("Rooms");
        Reservation = new Button("Reservation");
        Services = new Button("Services");
        Rooms.setOnAction(this);
        Services.setOnAction(this);
        Reservation.setOnAction(this);
        GlobalVar.formatMainButton(Rooms);
        GlobalVar.formatMainButton(Services);
        GlobalVar.formatMainButton(Reservation);
        this.setHgap(70);
        this.setVgap(25);
        this.setAlignment(Pos.CENTER);
        this.getChildren().add(Rooms);
        this.getChildren().add(Reservation);
        this.getChildren().add(Services);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if (actionEvent.getSource() == Rooms) {
            Main.mainstage.setScene(GlobalVar.temp);
        } else if (actionEvent.getSource() == Services) {

        } else {

        }
    }
}
