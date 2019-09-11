package Main.Forms;

import Main.Resources.GlobalVar;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;


public class SidePanel extends VBox {
    private Button Rooms, Reservation, Services;

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

        Rooms = new Button("Rooms");
        Rooms.setOnAction(GlobalVar.fun_MainMenu);
        GlobalVar.formatButton(Rooms);
        Reservation = new Button("Reservation");
        Reservation.setOnAction(GlobalVar.fun_MainMenu);
        GlobalVar.formatButton(Reservation);
        Services = new Button("Services");
        Services.setOnAction(GlobalVar.fun_MainMenu);
        GlobalVar.formatButton(Services);

        MenuBox.getChildren().addAll(Rooms,Reservation,Services);

        this.getChildren().add(MenuBox);
    }
}
