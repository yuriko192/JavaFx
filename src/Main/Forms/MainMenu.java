package Main.Forms;

import Main.Resources.GlobalVar;
import Main.Utils.ButtonFunction;
import Main.Utils.ImageContainer;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class MainMenu extends GridPane {
    private Button Rooms_btn, Reservation_btn, Services_btn,Info_btn;

    public MainMenu() {
        super();
        this.setVgap(10);
        this.setHgap(10);
        this.setAlignment(Pos.CENTER);
        ImageView Logo = new ImageView("Assets/Logo.png");
        Logo.setPreserveRatio(true);
        Logo.setFitHeight(GlobalVar.HEIGHT/3+30);
        HBox LogoCont = new HBox();
        LogoCont.setAlignment(Pos.CENTER);
        LogoCont.getChildren().add(Logo);
        LogoCont.setMinHeight(GlobalVar.HEIGHT/2-15);
        LogoCont.setStyle("-fx-border-radius: 5;" + "-fx-border-color: black;");
        this.add(LogoCont,0,0,2,1);

        Rooms_btn = new ButtonFunction(null,GlobalVar.fun_Rooms,1);
        Rooms_btn.setGraphic(new ImageContainer("Assets/Rooms.png",1));
        Reservation_btn = new ButtonFunction(null,GlobalVar.fun_Reservation,1);
        Reservation_btn.setGraphic(new ImageContainer("Assets/Reservation.PNG",1));
        Services_btn = new ButtonFunction(null,GlobalVar.fun_Services,2);
        Services_btn.setGraphic(new ImageContainer("Assets/Services.png",1));
        Info_btn = new ButtonFunction(null,GlobalVar.fun_Information,2);
        Info_btn.setGraphic(new ImageContainer("Assets/Info.png",1));


        this.add(Services_btn,1,1);
        this.add(Info_btn,0,1);
        this.add(Reservation_btn,2,0,1,2);
        this.add(Rooms_btn,3,0,1,2);

        /*
        //==========================
        Rooms_btn = new ButtonFunction("Rooms",GlobalVar.fun_Rooms,1);
        Reservation_btn = new ButtonFunction("Reservation",GlobalVar.fun_Reservation,1);
        Services_btn = new ButtonFunction("Services",GlobalVar.fun_Services,1);
        FloorPlan_btn = new ButtonFunction("Floor Plan",GlobalVar.fun_FloorPlan,1);
        //==================================
         */

    }

}
