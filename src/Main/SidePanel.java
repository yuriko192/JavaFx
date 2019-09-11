package Main;

import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class SidePanel extends VBox {

    public SidePanel() {
        super();
        ImageView LogoIV = new ImageView("Assets/Temp_Logo.png");
        LogoIV.setPreserveRatio(true);
        LogoIV.setFitHeight(100);
        this.getChildren().add(LogoIV);

        VBox MenuBox = new VBox();
        MenuBox.getChildren().add(GlobalVar.Rooms);
        MenuBox.getChildren().add(GlobalVar.Reservation);
        MenuBox.getChildren().add(GlobalVar.Services);

        this.getChildren().add(MenuBox);
    }
}
