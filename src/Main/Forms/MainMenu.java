package Main.Forms;

import Main.Main;
import Main.Resources.GlobalVar;
import Main.Utils.ButtonFunction;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

public class MainMenu extends FlowPane {
    private Button Rooms_btn, Reservation_btn, Services_btn,FloorPlan_btn;

    public MainMenu() {
        super();
        //==========================
        Rooms_btn = new ButtonFunction("Rooms",GlobalVar.fun_Rooms,1);
        Reservation_btn = new ButtonFunction("Reservation",GlobalVar.fun_Reservation,1);
        Services_btn = new ButtonFunction("Services",GlobalVar.fun_Services,1);
        FloorPlan_btn = new ButtonFunction("Floor Plan",GlobalVar.fun_FloorPlan,1);

        //==================================
        this.setHgap(70);
        this.setVgap(25);
        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(Rooms_btn,Reservation_btn,Services_btn,FloorPlan_btn);
    }

}
