package Main.Forms;

import Main.Main;
import Main.Resources.GlobalVar;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

public class MainMenu extends FlowPane implements EventHandler<ActionEvent> {
    private Button Rooms, Reservation, Services,FloorPlan;

    public MainMenu() {
        super();
        //==========================
        Rooms = new Button("Rooms");
        Rooms.setOnAction(this);
        GlobalVar.formatMainButton(Rooms);

        Reservation = new Button("Reservation");
        Reservation.setOnAction(this);
        GlobalVar.formatMainButton(Reservation);

        Services = new Button("Services");
        Services.setOnAction(this);
        GlobalVar.formatMainButton(Services);

        FloorPlan = new Button("FloorPlan");
        FloorPlan.setOnAction(this);
        GlobalVar.formatMainButton(FloorPlan);
        //==================================
        this.setHgap(70);
        this.setVgap(25);
        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(Rooms,Reservation,Services,FloorPlan);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if (actionEvent.getSource() == Rooms) {
            Main.mainstage.setScene(GlobalVar.temp);
        } else if (actionEvent.getSource() == FloorPlan) {
            Main.mainstage.setScene(GlobalVar.floorplan_S);
        } else {

        }
    }
}
