package Main.Forms;

import Main.Main;
import Main.Resources.GlobalVar;
import Main.Utils.ButtonFunction;
import Main.Utils.ImageContainer;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class SidePanel extends VBox implements EventHandler<MouseEvent> {
    private Button Reservation_btn, Services_btn, FloorPlan_btn;

    public SidePanel() {
        super();

        this.setAlignment(Pos.CENTER_LEFT);
        ImageView LogoIV = new ImageView("Assets/logo.png");
        LogoIV.setPreserveRatio(true);
        LogoIV.setFitWidth(150);
        HBox LogoCont = new HBox();
        LogoCont.getChildren().add(LogoIV);
        LogoCont.setOnMouseClicked(this);
        this.getChildren().add(LogoCont);

        VBox MenuBox = new VBox();
        MenuBox.setAlignment(Pos.CENTER);
        MenuBox.setMinHeight(0.7 * GlobalVar.HEIGHT);
        MenuBox.setSpacing(50);

        Reservation_btn = new ButtonFunction("Reservation", GlobalVar.fun_Reservation, 0);
        Reservation_btn.setGraphic(new ImageContainer("Assets/Reservation_logo.png",2));
        Services_btn = new ButtonFunction("Services", GlobalVar.fun_Services, 0);
        Services_btn.setGraphic(new ImageContainer("Assets/Services_logo.png",2));
        FloorPlan_btn = new ButtonFunction("Rooms", GlobalVar.fun_Floorplan, 0);
        FloorPlan_btn.setGraphic(new ImageContainer("Assets/Rooms_logo.png",2));

        MenuBox.getChildren().addAll(Reservation_btn, Services_btn, FloorPlan_btn);

        this.getChildren().add(MenuBox);
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        Main.mainstage.setScene(GlobalVar.mainmenu);
    }
}
