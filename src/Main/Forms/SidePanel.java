package Main.Forms;

import Main.Resources.GlobalVar;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;


public class SidePanel extends VBox {

    public SidePanel( ) {
        super();

        this.setAlignment(Pos.CENTER_LEFT);
        ImageView LogoIV = new ImageView("Assets/Temp_Logo.png");
        LogoIV.setPreserveRatio(true);
        LogoIV.setFitHeight(100);
        this.getChildren().add(LogoIV);

        VBox MenuBox = new VBox();
        MenuBox.setAlignment(Pos.CENTER);
        MenuBox.setMinHeight(0.8*GlobalVar.HEIGHT);
        MenuBox.setSpacing(50);

        MenuBox.getChildren().add(GlobalVar.Rooms);
        MenuBox.getChildren().add(GlobalVar.Reservation);
        MenuBox.getChildren().add(GlobalVar.Services);


        this.getChildren().add(MenuBox);
    }
}
