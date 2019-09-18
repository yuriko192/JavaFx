package Main.Forms;

import Main.Main;
import Main.Resources.GlobalVar;
import Main.Utils.ButtonFunction;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;


public class SidePanel extends VBox implements EventHandler<MouseEvent> {
    private Button Rooms_btn, Reservation_btn, Services_btn, FloorPlan_btn;

    public SidePanel( ) {
        super();

        this.setAlignment(Pos.CENTER_LEFT);
        ImageView LogoIV = new ImageView("Assets/temp_logo.png");
        LogoIV.setPreserveRatio(true);
        LogoIV.setFitWidth(150);
        LogoIV.setOnMouseClicked(this);
        this.getChildren().add(LogoIV);

        VBox MenuBox = new VBox();
        MenuBox.setAlignment(Pos.CENTER);
        MenuBox.setMinHeight(0.8*GlobalVar.HEIGHT);
        MenuBox.setSpacing(50);

        Rooms_btn = new ButtonFunction("Rooms",GlobalVar.fun_Rooms,0);
        Reservation_btn = new ButtonFunction("Reservation",GlobalVar.fun_Reservation,0);
        Services_btn = new ButtonFunction("Services",GlobalVar.fun_Services,0);
        FloorPlan_btn = new ButtonFunction("Floor Plan",GlobalVar.fun_FloorPlan,0);

        MenuBox.getChildren().addAll(Rooms_btn,Reservation_btn,Services_btn,FloorPlan_btn);

        this.getChildren().add(MenuBox);
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        Main.mainstage.setScene(GlobalVar.mainmenu);
    }
}
