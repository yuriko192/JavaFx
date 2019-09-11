package Main.Forms;

import Main.Resources.GlobalVar;
import Main.Resources.Handler.MainFunction;
import Main.Utils.ButtonFunction;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;


public class SidePanel extends VBox {
    private Button Rooms_btn, Reservation_btn, Services_btn, FloorPlan_btn;

    public SidePanel( ) {
        super();

        this.setAlignment(Pos.CENTER_LEFT);
        ImageView LogoIV = new ImageView("Assets/Temp_Logo.png");
        LogoIV.setPreserveRatio(true);
        LogoIV.setFitWidth(150);
        this.getChildren().add(LogoIV);

        VBox MenuBox = new VBox();
        MenuBox.setAlignment(Pos.CENTER);
        MenuBox.setMinHeight(0.8*GlobalVar.HEIGHT);
        MenuBox.setSpacing(50);

        Rooms_btn = new ButtonFunction("Rooms",GlobalVar.fun_Rooms,0);
        Reservation_btn = new ButtonFunction("Reservation",GlobalVar.fun_MainMenu,0);
        Services_btn = new ButtonFunction("Services",GlobalVar.fun_MainMenu,0);
        FloorPlan_btn = new ButtonFunction("Floor Plan",GlobalVar.fun_FloorPlan,0);

        MenuBox.getChildren().addAll(Rooms_btn,Reservation_btn,Services_btn,FloorPlan_btn);

        this.getChildren().add(MenuBox);
    }
}
